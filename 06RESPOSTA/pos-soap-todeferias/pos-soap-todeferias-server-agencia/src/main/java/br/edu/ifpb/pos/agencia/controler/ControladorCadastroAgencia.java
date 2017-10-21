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
public class ControladorCadastroAgencia implements Serializable {

    private Agencia agencia;

    @EJB
    private ServiceAgencia servicoAgencia;

    private Pacote pacote;

    @EJB
    private ServicePacote servicoPacote;

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

    public String cadastrarPacote() {
        String url;
        if (this.pacote.getId() == null) {
            this.servicoPacote.salvarPacote(pacote);
            agencia.addPacote(pacote);
            this.servicoAgencia.atualizarAgencia(agencia);
            url = "informacoes?faces-redirect=true";
        } else {
            servicoPacote.atualizarPacote(pacote);
        }
        url = "indexp?faces-redirect=true";
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

    public List<Pacote> listarPacotePorAgencia(Long id) {
        return servicoPacote.listarPacotePorAgencia(id);
    }

    public String atualizar(String cnpj) {
        agencia = consultar(cnpj);
        if (agencia != null) {
            return "editar.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String atualizarPacote(Long id) {
        pacote = consultarPacote(id);
        if (pacote != null) {
            return "editarp.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public Agencia consultar(String cnpj) {
        return servicoAgencia.encontrarAgencia(cnpj);
    }

    public Pacote consultarPacote(Long id) {
        return servicoPacote.encontrarPacote(id);
    }

    public String mostraAgencia(String id) {
        agencia = servicoAgencia.encontrarAgencia(id);
        return "informacoes";
    }

    public String mostraPacote(Long id) {
        pacote = servicoPacote.encontrarPacote(id);
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

    public Long bucarCliente(String cpf) {
        return pacote.getId();

    }

    public String remover(String cnpj) {
        System.err.println("controle" + cnpj);
        servicoAgencia.removerAgencia(cnpj);
        return null;
    }

    public String removerPacote(Long id) {
        System.err.println("controle" + id);
        servicoPacote.removerPacote(id);
        return null;
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

    public void limparCampos() {
        this.agencia = new Agencia();
    }

    public void limparPacote() {
        this.pacote = new Pacote();
    }
}
