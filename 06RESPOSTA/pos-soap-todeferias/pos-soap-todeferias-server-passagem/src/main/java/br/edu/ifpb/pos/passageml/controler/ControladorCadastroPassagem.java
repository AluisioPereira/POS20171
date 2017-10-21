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
import br.edu.ifpb.pos.passagem.domain.ClienteId;
import br.edu.ifpb.pos.passagem.domain.PassagemId;
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

    private ClienteId clienteId;

    private PassagemId passagemId;
    
    private String codigo;

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

    public String cadastrarRH() {
        String url;
        if (this.reservaPassagem.getId() == null) {
            this.reservaPassagem = new ReservaPassagem(codigo, clienteId, passagemId);
            this.servicoReservaPassagem.salvarReservaPassagem(reservaPassagem);
            this.servicoPassagem.atualizarPassagem(passagem);

            if (this.passagem.getId() == null) {
                this.servicoPassagem.salvarPassagem(passagem);
            } else {
                this.passagem.addPassagem(reservaPassagem);
                servicoPassagem.atualizarPassagem(passagem);
            }
            url = "indexp?faces-redirect=true";
        } else {
            servicoReservaPassagem.atualizarReservaPassagem(reservaPassagem);
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
        Passagem[] lista = servicoPassagem.listarTodasPassagem();
        return Arrays.asList(lista);

    }

    public List<ReservaPassagem> listarReservaPassagem() {
        ReservaPassagem[] lista = servicoReservaPassagem.listarTodasReservaPassagem();
        return Arrays.asList(lista);

    }

//    public List<ReservaPassagem> listarReservaPassagemPorPassagem(Long id) {
//        return servicoReservaPassagem.listarReservaPassagemPorPassagem(id);
//    }

    public String atualizar(String cnpj) {
        passagem = consultar(cnpj);
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

    public Passagem consultar(String codigo) {
        return servicoPassagem.encontrarPassagem(codigo);
    }

    public ReservaPassagem consultarReservaPassagem(String id) {
        return servicoReservaPassagem.encontrarReservaPassagem(id);
    }

    public String mostraPassagem(String id) {
        passagem = servicoPassagem.encontrarPassagem(id);
        passagemId = new PassagemId(id);
        return "informacoes";
    }

    public String mostraReservaPassagem(ReservaPassagem rp) {
        reservaPassagem = rp;
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

    public String removerReservaPassagem(ReservaPassagem rp) {
        System.err.println("controle" + rp);
        passagem.removePassagem(rp); 
        servicoPassagem.atualizarPassagem(passagem);
        servicoReservaPassagem.removerReservaPassagem(rp);
        
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
