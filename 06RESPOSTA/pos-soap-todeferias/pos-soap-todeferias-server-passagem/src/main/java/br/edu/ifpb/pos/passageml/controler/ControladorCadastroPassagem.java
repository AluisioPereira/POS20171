/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.passageml.controler;

import br.edu.ifpb.pos.passagem.Passagem;
import br.edu.ifpb.pos.passagem.ReservaPassagem;
import br.edu.ifpb.pos.passagem.ServicePassagem;
import br.edu.ifpb.pos.passagem.ServiceReservaPassagem;
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
public class ControladorCadastroPassagem implements Serializable {

    private Passagem passagem;

    @EJB
    private ServicePassagem servicoPassagem;

    private ReservaPassagem reservaPassagem;

    @EJB
    private ServiceReservaPassagem servicoReservaPassagem;

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
        return url;
    }

    public String cadastrar() {
        String url;
        if (this.passagem.getId() == null) {
            this.servicoPassagem.salvarPassagem(passagem);
            url = "index?faces-redirect=true";
        } else {
            servicoPassagem.atualizarPassagem(passagem);
        }
        url = "gerenciamento?faces-redirect=true";
        passagem = new Passagem();
        return url;
    }

    public String cadastrarRH1() {
        String url;
        if (this.reservaPassagem.getId() == null) {
            this.servicoReservaPassagem.salvarReservaPassagem(reservaPassagem);
            url = "indexp?faces-redirect=true";
        } else {
            servicoReservaPassagem.atualizarReservaPassagem(reservaPassagem);
        }
        url = "gerenciamento?faces-redirect=true";
        reservaPassagem = new ReservaPassagem();
        return url;
    }

    public String cadastrarRH() {
        String url;
        if (this.reservaPassagem.getId() == null) {
            this.servicoReservaPassagem.salvarReservaPassagem(reservaPassagem);
            this.servicoPassagem.atualizarPassagem(passagem);
            url = "informacoes?faces-redirect=true";
        } else {
            servicoReservaPassagem.atualizarReservaPassagem(reservaPassagem);
        }
        url = "indexp?faces-redirect=true";
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
        Passagem[] lista = servicoPassagem.listarTodasPassagem();
        return Arrays.asList(lista);

    }

    public List<ReservaPassagem> listarReservaPassagem() {
        ReservaPassagem[] lista = servicoReservaPassagem.listarTodasReservaPassagem();
        return Arrays.asList(lista);

    }

    public List<ReservaPassagem> listarReservaPassagemPorPassagem(Long id) {
        return servicoReservaPassagem.listarReservaPassagemPorPassagem(id);
    }

    public String atualizar(String cnpj) {
        passagem = consultar(cnpj);
        if (passagem != null) {
            return "editar.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String atualizarReservaPassagem(Long id) {
        reservaPassagem = consultarReservaPassagem(id);
        if (reservaPassagem != null) {
            return "editarp.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public Passagem consultar(String codigo) {
        return servicoPassagem.encontrarPassagem(codigo);
    }

    public ReservaPassagem consultarReservaPassagem(Long id) {
        return servicoReservaPassagem.encontrarReservaPassagem(id);
    }

    public String mostraPassagem(String id) {
       passagem = servicoPassagem.encontrarPassagem(id);
        return "informacoes";
    }

    public String mostraReservaPassagem(Long id) {
        reservaPassagem = servicoReservaPassagem.encontrarReservaPassagem(id);
        return "informacoesp";
    }

    public String mostraInformacoes(String id) {
        passagem = servicoPassagem.encontrarPassagem(id);
        if (passagem != null) {
            return "informacoes.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String remover(String cnpj) {
        System.err.println("controle" + cnpj);
        servicoPassagem.removerPassagem(cnpj);
        return null;
    }

    public String removerReservaPassagem(Long id) {
        System.err.println("controle" + id);
        servicoReservaPassagem.removerReservaPassagem(id);
        return null;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passgem) {
        this.passagem = passgem;
    }

    public ServicePassagem getServicoPassagem() {
        return servicoPassagem;
    }

    public void setServicoPassagem(ServicePassagem servicoPassagem) {
        this.servicoPassagem = servicoPassagem;
    }

    public ReservaPassagem getReservaPassagem() {
        return reservaPassagem;
    }

    public void setReservaPassagem(ReservaPassagem rp) {
        this.reservaPassagem = rp;
    }

    public ServiceReservaPassagem getServicoReservaPassagem() {
        return servicoReservaPassagem;
    }

    public void setServicoReservaPassagem(ServiceReservaPassagem servicoReservaPassagem) {
        this.servicoReservaPassagem = servicoReservaPassagem;
    }

    public void limparCampos() {
        this.passagem = new Passagem();
    }

    public void limparReservaPassagem() {
        this.reservaPassagem = new ReservaPassagem();
    }
}
