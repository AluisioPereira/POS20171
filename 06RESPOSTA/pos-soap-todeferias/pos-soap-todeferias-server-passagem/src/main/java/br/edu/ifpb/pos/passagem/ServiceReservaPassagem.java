/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.passagem;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author ajp
 */
@Stateless
@WebService
public class ServiceReservaPassagem {
    @EJB
    private RepositoryReservaPassagem repositoryReservaPassagem;

    public void salvarReservaPassagem(ReservaPassagem reservaPassagem) {
        repositoryReservaPassagem.salvarNovoReservaPassagem(reservaPassagem);
    }

    public ReservaPassagem encontrarReservaPassagem(Long id) {
        return repositoryReservaPassagem.findReservaPassagem(id);
    }

    public ReservaPassagem[] listarTodasReservaPassagem() {
        return repositoryReservaPassagem.todasOsReservaPassagem();
    }
    
    
    public List<ReservaPassagem> listarReservaPassagemPorPassagem(Long id) {
        return repositoryReservaPassagem.listarReservaPassagemPorPassagem(id);
    }
    

    public void atualizarReservaPassagem(ReservaPassagem reservaPassagem) {
        repositoryReservaPassagem.atualizarReservaPassagem(reservaPassagem);
    }

    public void removerReservaPassagem(Long id) {
        repositoryReservaPassagem.removerReservaPassagem(id);
    }
    
}
