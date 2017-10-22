/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.passagem;

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
public class RepositoryPassagem {

    @PersistenceContext
    private EntityManager em;

    public void salvarNovoPassagem(Passagem passagem) {
        em.persist(passagem);
    }

    public Passagem findPassagem(String cnpjEmpresa) {
        TypedQuery<Passagem> q = em.createQuery("SELECT p FROM Passagem p WHERE p.cnpjEmpresa=:cnpjEmpresa", Passagem.class);
        q.setParameter("cnpjEmpresa", cnpjEmpresa);
        return q.getSingleResult();
    }

    public Passagem[] todasOsPassagem() {
        List<Passagem> resultList = em.createQuery("FROM Passagem p").getResultList();
        return resultList.toArray(new Passagem[0]);
    }

    public void atualizarPassagem(Passagem Passagem) {
        em.merge(Passagem);
    }

    public void removerPassagem(String cnpjEmpresa) {
        TypedQuery<Passagem> q = em.createQuery("SELECT p FROM Passagem p WHERE p.cnpjEmpresa=:cnpjEmpresa", Passagem.class);
        q.setParameter("cnpjEmpresa", cnpjEmpresa);
        Passagem passagem = q.getSingleResult();
        System.out.println("Excluindo o passagem: " + passagem.getCnpjEmpresa());
        removerPassagemAlternativo(passagem);
    }

    public void removerPassagemAlternativo(Passagem p) {
        em.remove(em.merge(p));
    }
}
