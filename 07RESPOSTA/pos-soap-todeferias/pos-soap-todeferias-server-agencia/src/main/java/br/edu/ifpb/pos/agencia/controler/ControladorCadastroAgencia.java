/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia.controler;

import br.edu.ifpb.pos.agencia.Agencia;
import br.edu.ifpb.pos.agencia.Pacote;
import br.edu.ifpb.pos.agencia.ServiceAgencia;
import br.edu.ifpb.pos.agencia.ServicePacote;
import br.edu.ifpb.pos.agencia.domain.AgenciaId;
import br.edu.ifpb.pos.agencia.domain.ClienteId;
import br.edu.ifpb.pos.agencia.domain.HotelId;
import br.edu.ifpb.pos.agencia.domain.PassagemId;
import br.edu.ifpb.pos.cliente.Cliente;
import br.edu.ifpb.pos.cliente.ServiceCliente;
import br.edu.ifpb.pos.cliente.ServiceClienteService;
import br.edu.ifpb.pos.hotel.Hotel;
import br.edu.ifpb.pos.hotel.ServiceHotel;
import br.edu.ifpb.pos.hotel.ServiceHotelService;
import br.edu.ifpb.pos.passagem.Passagem;
import br.edu.ifpb.pos.passagem.ServicePassagem;
import br.edu.ifpb.pos.passagem.ServicePassagemService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

/**
 *
 * @author ajp
 */
@Named
@javax.enterprise.context.SessionScoped
public class ControladorCadastroAgencia implements Serializable {

    private Agencia agencia;

    @EJB
    private ServiceAgencia servicoAgencia;

    private Pacote pacote;

    @EJB
    private ServicePacote servicoPacote;

    private ClienteId clienteId;

    private HotelId hotelId;

    private PassagemId passagemId;

    private AgenciaId agenciaId;

    private String codigo;

    public String novaAgencia() {
        String url;
        url = "index?faces-redirect=true";
        agencia = new Agencia();
        return url;
    }

    public String novoPacote() {
        String url;
        url = "indexp?faces-redirect=true";
        pacote = new Pacote();
        codigo = new String();
        clienteId = new ClienteId();
        hotelId = new HotelId();
        passagemId = new PassagemId();
        agenciaId = new AgenciaId(agenciaId.getCnpjAgencia());
        return url;
    }

    public String cadastrar() {
        String url;
        if (this.agencia.getId() == null) {
            this.servicoAgencia.salvarAgencia(agencia);
            url = "index?faces-redirect=true";
        } else {
            servicoAgencia.atualizarAgencia(agencia);
        }
        url = "gerenciamento?faces-redirect=true";
        agencia = new Agencia();
        return url;
    }
    
    public void realizarReservaHotel(String codigo, String clieteId, String hotelId){
        
    }
    
    

    public String cadastrarRH() {
        String url;
        if (this.pacote.getId() == null) {
            this.clienteId.setCpf(clienteSelecionado.getCpf());
            this.hotelId.setCnpjHotel(hotelSelecionado.getCnpj());
            this.passagemId.setCnpjEmpresa(passagemSelecionado.getCnpjEmpresa());

            this.pacote = new Pacote(codigo, clienteId, hotelId, passagemId, agenciaId);
            this.servicoPacote.salvarPacote(pacote);
            this.servicoPacote.atualizarPacote(pacote);

            if (this.agencia.getId() == null) {
                this.servicoAgencia.salvarAgencia(agencia);
            } else {
                this.agencia.addPacote(pacote);
                servicoAgencia.atualizarAgencia(agencia);
            }
            url = "indexp?faces-redirect=true";
        } else {
            servicoPacote.atualizarPacote(pacote);
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
        Agencia[] lista = servicoAgencia.listarTodasAgencia();
        return Arrays.asList(lista);

    }

    public List<Pacote> listarPacote() {
        Pacote[] lista = servicoPacote.listarTodasPacote();
        return Arrays.asList(lista);

    }

    public String atualizar(String cnpj) {
        agencia = consultar(cnpj);
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

    public Agencia consultar(String cnpj) {
        return servicoAgencia.encontrarAgencia(cnpj);
    }

    public Pacote consultarPacote(String id) {
        return servicoPacote.encontrarPacote(id);
    }

    public String mostraAgencia(String id) {
        agencia = servicoAgencia.encontrarAgencia(id);
        agenciaId = new AgenciaId(id);
        return "informacoes";
    }

    public String mostraPacote(Pacote p) {
        pacote = p;
        return "informacoesp";
    }

    public String mostraInformacoes(String id) {
        agencia = servicoAgencia.encontrarAgencia(id);
        if (agencia != null) {
            return "informacoes.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String remover(String cnpj) {
        System.err.println("controle" + cnpj);
        servicoAgencia.removerAgencia(cnpj);
        return null;
    }

    public String removerPacote(Pacote p) {
        System.err.println("controle" + p.getCodigo());
        agencia.removePacote(p);
        servicoAgencia.atualizarAgencia(agencia);
        servicoPacote.removerPacote(p);
        return null;
    }

    private List<SelectItem> clienteSelect;

    private Cliente clienteSelecionado;

    private List<SelectItem> passagemSelect;

    private Passagem passagemSelecionado;

    private List<SelectItem> hotelSelect;

    private Hotel hotelSelecionado;

    public Cliente getClienteSelecionado() {
        return clienteSelecionado;
    }

    public void setClienteSelecionado(Cliente clienteSelecionado) {
        this.clienteSelecionado = clienteSelecionado;
    }

    public List<Cliente> listarCliente() {
        ServiceClienteService proxy = new ServiceClienteService();
        ServiceCliente service = proxy.getServiceClientePort();
        List<Cliente> listaCliente = service.listarTodasCliente();
        Cliente c;
        List<Cliente> returno = new ArrayList<>();

        for (Cliente cliente1 : listaCliente) {
            c = new Cliente();
            System.out.println("Cliente: " + cliente1.getCpf());
            c.setId(cliente1.getId());
            c.setNome(cliente1.getNome());
            c.setCpf(cliente1.getCpf());
            c.setRenda(cliente1.getRenda());
            returno.add(c);
            System.out.println("Cliente: " + cliente1.getNome());
            System.out.println("Cliente c:" + c.toString());
        }

        return returno;
    }

    public List<Passagem> listarPassagem() {
        ServicePassagemService proxy = new ServicePassagemService();
        ServicePassagem service = proxy.getServicePassagemPort();

        List<Passagem> listaPassagem = service.listarTodasPassagem();
        Passagem p;
        List<Passagem> returno = new ArrayList<>();

        for (Passagem passagem1 : listaPassagem) {
            p = new Passagem();
            System.out.println("Cliente: " + passagem1.getCnpjEmpresa());
            p.setId(passagem1.getId());
            p.setCnpjEmpresa(passagem1.getCnpjEmpresa());
            p.setDataHoraChegada(passagem1.getDataHoraChegada());
            p.setDataHoraSaida(passagem1.getDataHoraSaida());
            p.setDestino(passagem1.getDestino());
            p.setOrigem(passagem1.getOrigem());
            returno.add(p);
        }

        return returno;

    }

    public List<Hotel> listarHotel() {
        ServiceHotelService proxy = new ServiceHotelService();
        ServiceHotel service = proxy.getServiceHotelPort();
        return service.listarTodasHotel();
    }

    public List<SelectItem> getClienteSelect() {
        if (this.clienteSelect == null) {
            clienteSelect = new ArrayList<>();
            List<Cliente> lista = listarCliente();
            System.out.println("Verfificou lista vazia");
            if ((lista != null) && (!lista.isEmpty())) {
                SelectItem item;
                for (Cliente cliente : lista) {
                    item = new SelectItem(cliente, cliente.getNome());
                    this.clienteSelect.add(item);
                }

            }
        }
        return clienteSelect;
    }

    public void setClienteSelect(List<SelectItem> clienteSelect) {
        this.clienteSelect = clienteSelect;
    }

    public List<SelectItem> getPassagemSelect() {

        if (this.passagemSelect == null) {
            passagemSelect = new ArrayList<>();
            List<Passagem> lista = listarPassagem();
            System.out.println("Verfificou lista vazia");
            if ((lista != null) && (!lista.isEmpty())) {
                SelectItem item;
                for (Passagem passagem : lista) {
                    item = new SelectItem(passagem, passagem.getCnpjEmpresa());
                    this.passagemSelect.add(item);
                }

            }
        }
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
        if (this.hotelSelect == null) {
            hotelSelect = new ArrayList<>();
            List<Hotel> lista = listarHotel();
            System.out.println("Verfificou lista vazia");
            if ((lista != null) && (!lista.isEmpty())) {
                SelectItem item;
                for (Hotel hotel : lista) {
                    item = new SelectItem(hotel, hotel.getCnpj());
                    this.hotelSelect.add(item);
                }

            }
        }

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

    public ServiceAgencia getServicoAgencia() {
        return servicoAgencia;
    }

    public void setServicoAgencia(ServiceAgencia servicoAgencia) {
        this.servicoAgencia = servicoAgencia;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public ServicePacote getServicoPacote() {
        return servicoPacote;
    }

    public void setServicoPacote(ServicePacote servicoPacote) {
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
