/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.cliente.controler;

import br.edu.ifpb.pos.cliente.Cliente;
import br.edu.ifpb.pos.cliente.ServiceCliente;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 *
 * @author ajp
 */
@Named
@javax.enterprise.context.SessionScoped
public class ControladorCadastroCliente implements Serializable {

    private Cliente cliente;

    @EJB
    private ServiceCliente servicoCliente;

    public String novaCliente() {
        String url;
        url = "index?faces-redirect=true";
        cliente = new Cliente();
        return url;
    }

    public String cadastrar() {
        String url;
        if (this.cliente.getCpf() == null) {
            this.servicoCliente.salvarCliente(cliente);
            url = "index?faces-redirect=true";
        } else {
            servicoCliente.atualizarCliente(cliente);
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
        Cliente[] lista = servicoCliente.listarTodasCliente();
        return Arrays.asList(lista);

    }

    public String atualizar(String cpf) {
        cliente = consultar(cpf);
        if (cliente != null) {
            return "editar.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public Cliente consultar(String cpf) {
        return servicoCliente.encontrarCliente(cpf);
    }

    public String mostraCliente(String id) {
        cliente = servicoCliente.encontrarCliente(id);
        return "informacoes";
    }

    public String mostraInformacoes(String id) {
        cliente = servicoCliente.encontrarCliente(id);
        if (cliente != null) {
            return "informacoes.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String remover(String cnpj) {
        System.err.println("controle" + cnpj);
        servicoCliente.removerCliente(cnpj);
        return null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ServiceCliente getServicoCliente() {
        return servicoCliente;
    }

    public void setServicoCliente(ServiceCliente servicoCliente) {
        this.servicoCliente = servicoCliente;
    }

    public void limparCampos() {
        this.cliente = new Cliente();
    }

}
