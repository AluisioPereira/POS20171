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
public class RepositoryPacote {

    @PersistenceContext
    private EntityManager em;

    public void salvarNovoPacote(Pacote p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public Pacote findPacote(Long id) {
        TypedQuery<Pacote> q = em.createQuery("SELECT p FROM Pacote p WHERE p.id=:id", Pacote.class);
        q.setParameter("id", id);
        return q.getSingleResult();
    }

    public Pacote[] todasOsPacote() {
        List<Pacote> resultList = em.createQuery("FROM Pacote p").getResultList();
        return resultList.toArray(new Pacote[0]);
    }

    public void atualizarPacote(Pacote p) {
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }

    public void removerPacote(Long id) {
        em.getTransaction().begin();
        TypedQuery<Pacote> q = em.createQuery("SELECT p FROM Pacote p WHERE p.id=:id", Pacote.class);
        Pacote pacote = q.getSingleResult();
        System.out.println("Excluindo o Pacote: " + pacote.getId());
        em.remove(pacote);
        em.getTransaction().commit();

    }

}
