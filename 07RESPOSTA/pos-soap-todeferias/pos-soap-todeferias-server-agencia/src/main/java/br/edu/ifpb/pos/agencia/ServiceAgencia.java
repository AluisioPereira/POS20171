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
public class ServiceAgencia implements Serializable  {

    @EJB
    private RepositoryAgencia repositoryAgencia;

    public void salvarAgencia(Agencia agencia) {
        repositoryAgencia.salvarNovoAgencia(agencia);
    }

    public Agencia encontrarAgencia(String cnpj) {
        return repositoryAgencia.findAgencia(cnpj);
    }

    public Agencia[] listarTodasAgencia() {
        return repositoryAgencia.todasOsAgencia();
    }

    public void atualizarAgencia(Agencia agencia) {
        repositoryAgencia.atualizarAgencia(agencia);
    }

    public void removerAgencia(String cnpj) {
        repositoryAgencia.removerAgencia(cnpj);
    }

}
