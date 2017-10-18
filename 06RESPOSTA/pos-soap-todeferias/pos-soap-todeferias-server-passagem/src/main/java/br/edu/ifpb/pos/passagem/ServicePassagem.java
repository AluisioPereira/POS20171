/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.passagem;

import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author ajp
 */
@WebService
public class ServicePassagem {

    @EJB
    private RepositoryPassagem repositoryPassagem;

    public void salvarPassagem(Passagem passagem) {
        repositoryPassagem.salvarNovoPassagem(passagem);
    }

    public void encontrarPassagem(String codigo) {
        repositoryPassagem.findPassagem(codigo);
    }

    public Passagem[] listarTodasPassagem() {
        return repositoryPassagem.todasOsPassagem();
    }

    public void atualizarPassagem(Passagem passagem) {
        repositoryPassagem.atualizarPassagem(passagem);
    }

    public void removerPassagem(String codigo) {
        repositoryPassagem.removerPassagem(codigo);
    }

}
