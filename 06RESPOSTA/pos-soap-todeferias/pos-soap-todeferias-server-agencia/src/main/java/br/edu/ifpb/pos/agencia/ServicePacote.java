/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author ajp
 */
@Stateless
@WebService
public class ServicePacote implements Serializable {

    @EJB
    private RepositoryPacote repositoryPacote;

    public void salvarPacote(Pacote p) {
        repositoryPacote.salvarNovoPacote(p);
    }

    public Pacote encontrarPacote(String id) {
        return repositoryPacote.findPacote(id);
    }

    public Pacote[] listarTodasPacote() {
        return repositoryPacote.todasOsPacote();
    }

    public void atualizarPacote(Pacote p) {
        repositoryPacote.atualizarPacote(p);
    }

    public void removerPacote(Pacote id) {
        repositoryPacote.removerPacote(id);
    }
}
