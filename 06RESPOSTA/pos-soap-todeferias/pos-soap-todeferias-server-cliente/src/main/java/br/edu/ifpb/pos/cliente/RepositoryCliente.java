
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.cliente;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author ajp
 */
@Stateless
public class RepositoryCliente {

    @PersistenceContext
    private EntityManager em;

    public void salvarNovoCliente(Cliente cliente) {
        em.persist(cliente);
    }

    public Cliente findCliente(String cpf) {
        TypedQuery<Cliente> q = em.createQuery("SELECT c FROM Cliente c WHERE c.cpf=:cpf", Cliente.class);
        q.setParameter("cpf", cpf);
        return q.getSingleResult();
    }

    public Cliente[] todasOsCliente() {
        List<Cliente> resultList = em.createQuery("FROM Cliente c").getResultList();
        return resultList.toArray(new Cliente[0]);
    }

    public void atualizarCliente(Cliente cliente) {
        em.merge(cliente);
    }

    public void removerCliente(String cpf) {
        TypedQuery<Cliente> q = em.createQuery("SELECT c FROM Cliente c WHERE c.cpf=:cpf", Cliente.class);
        q.setParameter("cpf", cpf);
        Cliente cliente = q.getSingleResult();
        System.out.println("Excluindo o cliente: " + cliente.getNome());
        removerClienteAlternativo(cliente);        
    }

    public void removerClienteAlternativo(Cliente c) {
        em.remove(em.merge(c));
    }

}
