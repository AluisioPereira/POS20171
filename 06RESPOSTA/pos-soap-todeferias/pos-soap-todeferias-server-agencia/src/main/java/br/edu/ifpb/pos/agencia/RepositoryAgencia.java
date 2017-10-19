/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia;

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
public class RepositoryAgencia {

    @PersistenceContext
    private EntityManager em;

    public void salvarNovoAgencia(Agencia agencia) {
        em.persist(agencia);
    }

    public Agencia findAgencia(String cnpj) {
        TypedQuery<Agencia> q = em.createQuery("SELECT a FROM Agencia a WHERE a.cnpj=:cnpj", Agencia.class);
        q.setParameter("cnpj", cnpj);
        return q.getSingleResult();
    }

    public Agencia[] todasOsAgencia() {
        List<Agencia> resultList = em.createQuery("FROM Agencia a").getResultList();
        return resultList.toArray(new Agencia[0]);
    }

    public void atualizarAgencia(Agencia agencia) {
        em.merge(agencia);
    }

    public void removerAgencia(String cnpj) {

        TypedQuery<Agencia> q = em.createQuery("SELECT a FROM Agencia a WHERE a.cnpj=:cnpj", Agencia.class);
        q.setParameter("cnpj", cnpj);
        Agencia agencia = q.getSingleResult();
        System.out.println("Excluindo o agencia: " + agencia.getNome());
        removerAgenciaAlternativo(agencia);
        //  em.remove(em.merge(agencia));

    }

    public void removerAgenciaAlternativo(Agencia a) {
        em.remove(em.merge(a));
    }
}
