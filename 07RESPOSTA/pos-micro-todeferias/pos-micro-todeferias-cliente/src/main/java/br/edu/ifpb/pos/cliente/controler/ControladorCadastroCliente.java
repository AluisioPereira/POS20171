/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.cliente.controler;

import br.edu.ifpb.pos.cliente.Cliente;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import br.edu.ifpb.pos.service.ClienteService;

/**
 *
 * @author ajp
 */
@Named
@javax.enterprise.context.SessionScoped
public class ControladorCadastroCliente implements Serializable {

    private Cliente cliente;
    
    
    @Inject 
    private ClienteService servicoCliente;

    public String novaCliente() {
        String url;
        url = "index?faces-redirect=true";
        cliente = new Cliente();
        return url;
    }

    public String cadastrar() {
        String url;
        if (this.cliente.getCpf() == null) {
            this.servicoCliente.create(cliente);
            url = "index?faces-redirect=true";
        } else {
            servicoCliente.edit(cliente);
        }
        url = "gerenciamento?faces-redirect=true";
        cliente = new Cliente();
        return url;
    }

    public String principal() {
        String url;
        url = "index?faces-redirect=true";
        cliente = new Cliente();
        return url;
    }

    public String gerenciamento() {
        String url;
        url = "gerenciamento?faces-redirect=true";
        cliente = new Cliente();
        return url;
    }

    public List<Cliente> listar() {
        List<Cliente> lista = servicoCliente.findAll();
        return lista;

    }

    public String atualizar(int id) {
        cliente = consultar(id);
        if (cliente != null) {
            return "editar.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public Cliente consultar(int id) {
        return servicoCliente.find(id);
    }

    public String mostraCliente(int id) {
        cliente = servicoCliente.find(id);
        return "informacoes";
    }

    public String mostraInformacoes(int id) {
        cliente = servicoCliente.find(id);
        if (cliente != null) {
            return "informacoes.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String remover(int id) {
        servicoCliente.remove(id);
        return null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteService getClienteServico() {
        return servicoCliente;
    }

    public void setClienteServico(ClienteService servicoCliente) {
        this.servicoCliente = servicoCliente;
    }

    public void limparCampos() {
        this.cliente = new Cliente();
    }

}
