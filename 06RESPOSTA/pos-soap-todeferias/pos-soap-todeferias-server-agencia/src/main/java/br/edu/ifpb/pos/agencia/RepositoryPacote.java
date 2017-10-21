/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia;

import java.util.ArrayList;
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
        em.persist(p);
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

    public List<Pacote> listarPacotePorAgencia(Long id) {
        List<Long> resultListp = em.createQuery("FROM agencia_pacote ap").getResultList();
        List<Pacote> ap = new ArrayList<>();
        for (Long long1 : resultListp) {
            ap.add(findPacote(long1));
        }
        return ap;
    }

    public void atualizarPacote(Pacote p) {
        em.merge(p);
    }

    public void removerPacote(Long id) {
        TypedQuery<Pacote> q = em.createQuery("SELECT p FROM Pacote p WHERE p.id=:id", Pacote.class);
        q.setParameter("id", id);
        Pacote pacote = q.getSingleResult();
        System.out.println("Excluindo o Pacote: " + pacote.getId());
        removerPacoteAlternativo(pacote);
    }

    public void removerPacoteAlternativo(Pacote p) {
        em.remove(em.merge(p));
    }

}
