/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.pos.soap.server.atividade4;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ajp
 */
@Stateless
public class RepositoryAutor {

    @PersistenceContext
    private EntityManager em;

    public void salvarNovoAutor(Autor autor) {
        em.persist(autor);
    }

    public Autor findAutor(Long id) {
        return em.find(Autor.class, id);
    }

    public Autor[] todasOsAutor() {
        List<Autor> resultList = em.createQuery("FROM Autor a").getResultList();
        return resultList.toArray(new Autor[0]);
    }

    public void atualizarAutor(Autor autor) {
        em.merge(autor);
    }

    public void removerAutor(Long id) {
        Autor autor = em.find(Autor.class, id);
        System.out.println("Excluindo o autor: " + autor.getNome());
        em.remove(autor);
    }
}
