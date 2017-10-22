/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.cliente;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author ajp
 */
@Stateless
@WebService
public class ServiceCliente {

    @EJB
    private RepositoryCliente repositoryCliente;

    public void salvarCliente(Cliente cliente) {
        repositoryCliente.salvarNovoCliente(cliente);
    }

    public Cliente encontrarCliente(String cpf) {
        return repositoryCliente.findCliente(cpf);
    }

    public Cliente[] listarTodasCliente() {
        return repositoryCliente.todasOsCliente();
    }

    public void atualizarCliente(Cliente cliente) {
        repositoryCliente.atualizarCliente(cliente);
    }

    public void removerCliente(String cpf) {
        repositoryCliente.removerCliente(cpf);
    }

}
