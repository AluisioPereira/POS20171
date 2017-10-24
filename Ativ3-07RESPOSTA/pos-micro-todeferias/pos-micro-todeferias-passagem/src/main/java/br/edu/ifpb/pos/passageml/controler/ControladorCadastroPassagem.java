/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.passageml.controler;

import br.edu.ifpb.pos.passagem.Passagem;
import br.edu.ifpb.pos.passagem.ReservaPassagem;
import br.edu.ifpb.pos.domain.ClienteId;
import br.edu.ifpb.pos.domain.PassagemId;
import br.edu.ifpb.pos.json.Mapper;
import br.edu.ifpb.pos.json.MapperException;
import br.edu.ifpb.pos.model.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import br.edu.ifpb.pos.service.PassagemService;
import br.edu.ifpb.pos.service.ReservaPassagemService;

/**
 *
 * @author ajp
 */
@Named
@javax.enterprise.context.SessionScoped
public class ControladorCadastroPassagem implements Serializable {

    private Passagem passagem;

    @Inject
    private PassagemService servicoPassagem;

    private ReservaPassagem reservaPassagem;

    @Inject
    private ReservaPassagemService servicoReservaPassagem;

    private ClienteId clienteId;

    private PassagemId passagemId;

    private String codigo;

    private final Mapper mapper = new Mapper();
    private final String uri = "http://localhost:8080/pos-micro-todeferias-cliente/todeferiasc/cliente";
    private final Client client = ClientBuilder.newClient();
    private final WebTarget root = client.target(uri);

    public String novaPassagem() {
        String url;
        url = "index?faces-redirect=true";
        passagem = new Passagem();
        return url;
    }

    public String novoReservaPassagem() {
        String url;
        url = "indexp?faces-redirect=true";
        reservaPassagem = new ReservaPassagem();
        codigo = new String();
        clienteId = new ClienteId();
        passagemId = new PassagemId(passagemId.getCnpjEmpresa());
        return url;
    }

    public String cadastrar() {
        String url;
        if (this.passagem.getCnpjEmpresa() == null) {
            this.servicoPassagem.create(passagem);
            url = "index?faces-redirect=true";
        } else {
            servicoPassagem.edit(passagem);
        }
        url = "gerenciamento?faces-redirect=true";
        passagem = new Passagem();
        return url;
    }

    public String cadastrarRH() {
        String url;
        if (this.reservaPassagem.getCodigo() == null) {
            this.reservaPassagem = new ReservaPassagem(codigo, clienteId, passagemId);
            this.servicoReservaPassagem.create(reservaPassagem);
            this.servicoPassagem.edit(passagem);

            if (this.passagem.getCnpjEmpresa() == null) {
                this.servicoPassagem.create(passagem);
            } else {
                this.passagem.addPassagem(reservaPassagem);
                servicoPassagem.edit(passagem);
            }
            url = "indexp?faces-redirect=true";
        } else {
            servicoReservaPassagem.edit(reservaPassagem);
        }
        url = "gerenciamento?faces-redirect=true";
        reservaPassagem = new ReservaPassagem();
        return url;
    }

    public String principal() {
        String url;
        url = "index?faces-redirect=true";
        passagem = new Passagem();
        return url;
    }

    public String gerenciamento() {
        String url;
        url = "gerenciamento?faces-redirect=true";
        passagem = new Passagem();
        return url;
    }

    public List<Passagem> listar() {
        List<Passagem> lista = servicoPassagem.findAll();
        return lista;

    }

    public List<ReservaPassagem> listarReservaPassagem() {
        List<ReservaPassagem> lista = servicoReservaPassagem.findAll();
        return lista;

    }

    public String atualizar(int id) {
        passagem = consultar(id);
        if (passagem != null) {
            return "editar.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String atualizarReservaPassagem(ReservaPassagem rp) {
        reservaPassagem = rp;
        if (reservaPassagem != null) {
            return "editarp.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public Passagem consultar(int id) {
        return servicoPassagem.find(id);
    }

    public ReservaPassagem consultarReservaPassagem(int id) {
        return servicoReservaPassagem.find(id);
    }

    public String mostraPassagem(int id) {
        passagem = servicoPassagem.find(id);
        passagemId = new PassagemId(id);
        return "informacoes";
    }

    public String mostraReservaPassagem(ReservaPassagem rp) {
        reservaPassagem = rp;
        return "informacoesp";
    }

    public String mostraInformacoes(int id) {
        passagem = servicoPassagem.find(id);
        if (passagem != null) {
            return "informacoes.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String remover(int id) {
        System.err.println("controle" + id);
        servicoPassagem.remove(id);
        return null;
    }

    public String removerReservaPassagem(ReservaPassagem rp) {
        System.err.println("controle" + rp);
        passagem.removePassagem(rp);
        servicoPassagem.edit(passagem);
        servicoReservaPassagem.remove(rp);

        return null;
    }

    public List<Cliente> listarCliente() {

        try {

            Response response = root.request().get();
            String json = response.readEntity(String.class);
            List<Cliente> clientes;

            clientes = mapper.toList(json, Cliente.class);
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.toString());
            }

            return clientes;
        } catch (MapperException ex) {
            Logger.getLogger(ControladorCadastroPassagem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    private List<SelectItem> clienteSelect;

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

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passgem) {
        this.passagem = passgem;
    }

    public PassagemService getServicoPassagem() {
        return servicoPassagem;
    }

    public void setServicoPassagem(PassagemService servicoPassagem) {
        this.servicoPassagem = servicoPassagem;
    }

    public ReservaPassagem getReservaPassagem() {
        return reservaPassagem;
    }

    public void setReservaPassagem(ReservaPassagem rp) {
        this.reservaPassagem = rp;
    }

    public ReservaPassagemService getServicoReservaPassagem() {
        return servicoReservaPassagem;
    }

    public void setServicoReservaPassagem(ReservaPassagemService servicoReservaPassagem) {
        this.servicoReservaPassagem = servicoReservaPassagem;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public void setClienteId(ClienteId clienteId) {
        this.clienteId = clienteId;
    }

    public PassagemId getPassagemId() {
        return passagemId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPassagemId(PassagemId passagemId) {
        this.passagemId = passagemId;
    }

    public void limparCampos() {
        this.passagem = new Passagem();
    }

    public void limparReservaPassagem() {
        this.reservaPassagem = new ReservaPassagem();
    }
}
