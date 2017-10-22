/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.pos.soap.server.atividade4;

import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author ajp
 */
@WebService
public class Biblioteca {
    
    @EJB
    private RepositoryAutor repositoryAutor;
    
    @EJB
    private RepositoryLivro repositoryLivro;
    
    public void salvarAutor(Autor autor) {
        repositoryAutor.salvarNovoAutor(autor);
    }

    public void encontrarAutor(Long id) {
        repositoryAutor.findAutor(id);
    }

    public Autor[] listarTodasAutor() {
        return repositoryAutor.todasOsAutor();
    }

    public void atualizarAutor(Autor autor) {
        repositoryAutor.atualizarAutor(autor);
    }

    public void removerAutor(Long id) {
        repositoryAutor.removerAutor(id);
    }
    
    public void salvarLivro(Livro livro) {
        repositoryLivro.salvarNovoLivro(livro);
    }

    public void encontrarLivro(Long id) {
        repositoryLivro.findLivro(id);
    }

    public Livro[] listarTodasLivro() {
        return repositoryLivro.todasOsLivro();
    }

    public void atualizarLivro(Livro livro) {
        repositoryLivro.atualizarLivro(livro);
    }

    public void removerLivro(Long id) {
        repositoryLivro.removerLivro(id);
    }
    
}
