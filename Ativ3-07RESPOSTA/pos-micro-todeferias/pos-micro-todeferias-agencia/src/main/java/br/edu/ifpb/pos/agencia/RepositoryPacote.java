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
        em.persist(p);
    }

    public Pacote findPacote(String codigo) {
        TypedQuery<Pacote> q = em.createQuery("SELECT p FROM Pacote p WHERE p.codigo=:codigo", Pacote.class);
        q.setParameter("codigo", codigo);
        return q.getSingleResult();
    }

    public Pacote[] todasOsPacote() {
        List<Pacote> resultList = em.createQuery("FROM Pacote p").getResultList();
        return resultList.toArray(new Pacote[0]);
    }


    public void atualizarPacote(Pacote p) {
        em.merge(p);
    }

    public void removerPacote(Pacote p) {
        em.remove(em.merge(p));
    }

 

}
