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
public class RepositoryLivro {

    @PersistenceContext
    private EntityManager em;

    public void salvarNovoLivro(Livro livro) {
        em.persist(livro);
    }

    public Livro findLivro(Long id) {
        return em.find(Livro.class, id);
    }

    public Livro[] todasOsLivro() {
        List<Livro> resultList = em.createQuery("FROM Livro l").getResultList();
        return resultList.toArray(new Livro[0]);
    }

    public void atualizarLivro(Livro livro) {
        em.merge(livro);
    }

    public void removerLivro(Long id) {
        Livro livro = em.find(Livro.class, id);
        System.out.println("Excluindo o livro: " + livro.getTitulo());
        em.remove(livro);
    }

}
