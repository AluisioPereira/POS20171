/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia.controler;

import br.edu.ifpb.pos.agencia.Agencia;
import br.edu.ifpb.pos.agencia.Pacote;
import br.edu.ifpb.pos.agencia.domain.AgenciaId;
import br.edu.ifpb.pos.json.Mapper;
import br.edu.ifpb.pos.json.MapperException;
import br.edu.ifpb.pos.model.Cliente;
import br.edu.ifpb.pos.model.ClienteId;
import br.edu.ifpb.pos.model.Hotel;
import br.edu.ifpb.pos.model.HotelId;
import br.edu.ifpb.pos.model.ImmutableReservaHotel;
import br.edu.ifpb.pos.model.Passagem;
import br.edu.ifpb.pos.model.PassagemId;
import br.edu.ifpb.pos.model.ReservaHotel;

import br.edu.ifpb.pos.service.AgenciaService;
import br.edu.ifpb.pos.service.PacoteService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 *
 * @author ajp
 */
@Named
@javax.enterprise.context.SessionScoped
public class ControladorCadastroAgencia implements Serializable {

    private Agencia agencia;

    @EJB
    private AgenciaService servicoAgencia;

    private Pacote pacote;

    @EJB
    private PacoteService servicoPacote;

    private ClienteId clienteId;

    private HotelId hotelId;

    private PassagemId passagemId;

    private AgenciaId agenciaId;

    private String codigo;

    private List<SelectItem> clienteSelect;

    private Cliente clienteSelecionado;

    private List<SelectItem> passagemSelect;

    private Passagem passagemSelecionado;

    private List<SelectItem> hotelSelect;

    private Hotel hotelSelecionado;

    private final Mapper mapperc = new Mapper();
    private final String uric = "http://localhost:8080/pos-micro-todeferias-cliente/todeferiasc/cliente";
    private final Client clientc = ClientBuilder.newClient();
    private final WebTarget rootc = clientc.target(uric);

    private final Mapper mapperh = new Mapper();
    private final String urih = "http://localhost:8080/pos-micro-todeferias-hotel/todeferiash/hotel";
    private final Client clienth = ClientBuilder.newClient();
    private final WebTarget rooth = clienth.target(urih);

    private final Mapper mapperp = new Mapper();
    private final String urip = "http://localhost:8080/pos-micro-todeferias-passagem/todeferiasp/passagem";
    private final Client clientp = ClientBuilder.newClient();
    private final WebTarget rootp = clientp.target(urip);

    public ControladorCadastroAgencia() {
        this.agencia = new Agencia();
        this.pacote = new Pacote();
        this.codigo = new String();
    }

    public String novaAgencia() {
        String url;
        url = "index?faces-redirect=true";
        this.agencia = new Agencia();
        return url;
    }

    public String novoPacote() {
        String url;
        url = "indexp?faces-redirect=true";
        this.pacote = new Pacote();
        this.codigo = new String();

        this.agenciaId = new AgenciaId(agenciaId.getCnpjAgencia());

        return url;
    }

    public String cadastrar() {
        String url;
        if (this.agencia.getCnpj() == null) {
            this.servicoAgencia.create(agencia);
            url = "index?faces-redirect=true";
        } else {
            this.servicoAgencia.edit(agencia);
        }
        url = "gerenciamento?faces-redirect=true";
        this.agencia = new Agencia();
        return url;
    }

    public void realizarReservaHotel(String codigo, Integer clieteId, HotelId hotelId) {

        try {
            String recurso = "http://localhost:8080/pos-micro-todeferias-hotel/todeferiash/reservahotel";
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(recurso);

            ReservaHotel rh = ImmutableReservaHotel.builder().codigo(codigo).cliente(clienteId).hotel(hotelId).build();

            Entity<String> json = Entity.json(mapperh.toString(rh));

            Response response = target.request().post(json);

            //atualizando hotel
            String recursoh = "http://localhost:8080/pos-micro-todeferias-hotel/todeferiash/hotel";
            Client clienth = ClientBuilder.newClient();
            WebTarget targeth = clienth.target(recursoh).path("{id}");

            this.hotelSelecionado.reservas().add(rh);

            Entity<String> jsonh = Entity.json(mapperh.toString(this.hotelSelecionado));

            Response responseh = targeth.resolveTemplate("id", this.hotelSelecionado.id()).request().put(jsonh);

        } catch (MapperException ex) {
            Logger.getLogger(ControladorCadastroAgencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String cadastrarRH() {
        String url;
        if (this.pacote.getCodigo() == null) {
            this.pacote = new Pacote(codigo, clienteId, hotelId, passagemId, agenciaId);

            realizarReservaHotel(codigo, clienteId.cpf(), hotelId);
            this.servicoPacote.create(pacote);
            this.servicoPacote.edit(pacote);

            if (this.agencia.getCnpj() == null) {
                this.servicoAgencia.create(agencia);
            } else {
                this.agencia.addPacote(pacote);
                servicoAgencia.edit(agencia);
            }
            url = "indexp?faces-redirect=true";
        } else {
            servicoPacote.edit(pacote);
        }
        url = "gerenciamento?faces-redirect=true";
        pacote = new Pacote();
        return url;
    }

    public String principal() {
        String url;
        url = "index?faces-redirect=true";
        agencia = new Agencia();
        return url;
    }

    public String gerenciamento() {
        String url;
        url = "gerenciamento?faces-redirect=true";
        agencia = new Agencia();
        return url;
    }

    public List<Agencia> listar() {
        List<Agencia> lista = servicoAgencia.findAll();
        return lista;

    }

    public List<Pacote> listarPacote() {
        List<Pacote> lista = servicoPacote.findAll();
        return lista;

    }

    public String atualizar(int id) {
        agencia = consultar(id);
        if (agencia != null) {
            return "editar.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String atualizarPacote(Pacote p) {
        pacote = p;
        if (pacote != null) {
            return "editarp.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public Agencia consultar(int id) {
        return servicoAgencia.find(id);
    }

    public Pacote consultarPacote(int id) {
        return servicoPacote.find(id);
    }

    public String mostraAgencia(int id) {
        agencia = servicoAgencia.find(id);
        agenciaId = new AgenciaId(id);
        return "informacoes";
    }

    public String mostraPacote(Pacote p) {
        pacote = p;
        return "informacoesp";
    }

    public String mostraInformacoes(int id) {
        agencia = servicoAgencia.find(id);
        if (agencia != null) {
            return "informacoes.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String remover(int id) {
        System.err.println("controle" + id);
        servicoAgencia.remove(id);
        return null;
    }

    public String removerPacote(Pacote p) {
        System.err.println("controle" + p.getCodigo());
        agencia.removePacote(p);
        servicoAgencia.edit(agencia);
        servicoPacote.remove(p);
        return null;
    }

    public Cliente getClienteSelecionado() {
        return clienteSelecionado;
    }

    public void setClienteSelecionado(Cliente clienteSelecionado) {
        this.clienteSelecionado = clienteSelecionado;
    }

    public List<Cliente> listarCliente() {

        try {

            Response response = rootc.request().get();
            String json = response.readEntity(String.class);
            List<Cliente> clientes;

            clientes = mapperc.toList(json, Cliente.class);
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.toString());
            }

            return clientes;
        } catch (MapperException ex) {
            Logger.getLogger(ControladorCadastroAgencia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public List<Passagem> listarPassagem() {

        try {

            Response response = rootp.request().get();
            String json = response.readEntity(String.class);
            List<Passagem> passagens;

            passagens = mapperp.toList(json, Passagem.class);
            for (Passagem passagem : passagens) {
                System.out.println("Passagem : " + passagem.toString());
            }

            return passagens;
        } catch (MapperException ex) {
            Logger.getLogger(ControladorCadastroAgencia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public List<Hotel> listarHotel() {

        try {

            Response response = rooth.request().get();
            String json = response.readEntity(String.class);
            List<Hotel> hoteis;

            hoteis = mapperh.toList(json, Hotel.class);
            for (Hotel hotel : hoteis) {
                System.out.println("Passagem : " + hotel.toString());
            }

            return hoteis;
        } catch (MapperException ex) {
            Logger.getLogger(ControladorCadastroAgencia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public List<SelectItem> getClienteSelect() {
//        if (this.clienteSelect == null) {
        clienteSelect = new ArrayList<>();
        List<Cliente> lista = listarCliente();
        System.out.println("Verfificou lista vazia");
        if ((lista != null) && (!lista.isEmpty())) {
            SelectItem item;
            for (Cliente cliente : lista) {
                item = new SelectItem(cliente.cpf(), cliente.nome());
                this.clienteSelect.add(item);
            }

        }
//        }
        System.out.println("Preencheu valores...");
        return clienteSelect;
    }

    public void setClienteSelect(List<SelectItem> clienteSelect) {
        this.clienteSelect = clienteSelect;
    }

    public List<SelectItem> getPassagemSelect() {

//        if (this.passagemSelect == null) {
        passagemSelect = new ArrayList<>();
        List<Passagem> lista = listarPassagem();
        System.out.println("Verfificou lista vazia");
        if ((lista != null) && (!lista.isEmpty())) {
            SelectItem item;
            for (Passagem passagem : lista) {
                item = new SelectItem(passagem.cnpjEmpresa(), passagem.toString());
                this.passagemSelect.add(item);
            }

        }
//        }
        return passagemSelect;
    }

    public void setPassagemSelect(List<SelectItem> passagemSelect) {
        this.passagemSelect = passagemSelect;
    }

    public Passagem getPassagemSelecionado() {
        return passagemSelecionado;
    }

    public void setPassagemSelecionado(Passagem passagemSelecionado) {
        this.passagemSelecionado = passagemSelecionado;
    }

    public List<SelectItem> getHotelSelect() {
//        if (this.hotelSelect == null) {
        hotelSelect = new ArrayList<>();
        List<Hotel> lista = listarHotel();
        System.out.println("Verfificou lista vazia");
        if ((lista != null) && (!lista.isEmpty())) {
            SelectItem item;
            for (Hotel hotel : lista) {
                item = new SelectItem(hotel, hotel.cnpj());
                this.hotelSelect.add(item);
            }

        }
//        }

        return hotelSelect;
    }

    public void setHotelSelect(List<SelectItem> hotelSelect) {
        this.hotelSelect = hotelSelect;
    }

    public Hotel getHotelSelecionado() {
        return hotelSelecionado;
    }

    public void setHotelSelecionado(Hotel hotelSelecionado) {
        this.hotelSelecionado = hotelSelecionado;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public AgenciaService getServicoAgencia() {
        return servicoAgencia;
    }

    public void setServicoAgencia(AgenciaService servicoAgencia) {
        this.servicoAgencia = servicoAgencia;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public PacoteService getServicoPacote() {
        return servicoPacote;
    }

    public void setServicoPacote(PacoteService servicoPacote) {
        this.servicoPacote = servicoPacote;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public void setClienteId(ClienteId clienteId) {
        this.clienteId = clienteId;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public void setHotelId(HotelId hotelId) {
        this.hotelId = hotelId;
    }

    public PassagemId getPassagemId() {
        return passagemId;
    }

    public void setPassagemId(PassagemId passagemId) {
        this.passagemId = passagemId;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public void setAgenciaId(AgenciaId agenciaId) {
        this.agenciaId = agenciaId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void limparCampos() {
        this.agencia = new Agencia();
    }

    public void limparPacote() {
        this.pacote = new Pacote();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.agencia);
        hash = 59 * hash + Objects.hashCode(this.servicoAgencia);
        hash = 59 * hash + Objects.hashCode(this.pacote);
        hash = 59 * hash + Objects.hashCode(this.servicoPacote);
        hash = 59 * hash + Objects.hashCode(this.clienteId);
        hash = 59 * hash + Objects.hashCode(this.hotelId);
        hash = 59 * hash + Objects.hashCode(this.passagemId);
        hash = 59 * hash + Objects.hashCode(this.agenciaId);
        hash = 59 * hash + Objects.hashCode(this.codigo);
        hash = 59 * hash + Objects.hashCode(this.clienteSelect);
        hash = 59 * hash + Objects.hashCode(this.clienteSelecionado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ControladorCadastroAgencia other = (ControladorCadastroAgencia) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.agencia, other.agencia)) {
            return false;
        }
        if (!Objects.equals(this.servicoAgencia, other.servicoAgencia)) {
            return false;
        }
        if (!Objects.equals(this.pacote, other.pacote)) {
            return false;
        }
        if (!Objects.equals(this.servicoPacote, other.servicoPacote)) {
            return false;
        }
        if (!Objects.equals(this.clienteId, other.clienteId)) {
            return false;
        }
        if (!Objects.equals(this.hotelId, other.hotelId)) {
            return false;
        }
        if (!Objects.equals(this.passagemId, other.passagemId)) {
            return false;
        }
        if (!Objects.equals(this.agenciaId, other.agenciaId)) {
            return false;
        }
        if (!Objects.equals(this.clienteSelect, other.clienteSelect)) {
            return false;
        }
        if (!Objects.equals(this.clienteSelecionado, other.clienteSelecionado)) {
            return false;
        }
        return true;
    }

}
