/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.pos.soap.server.atividade4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ajp
 */
@Entity
public class Livro implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String edicao;
    private String titulo;
    private String descricao;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Autor> autores = new ArrayList<>();

    public Livro() {
    }

    public Livro(long id, String edicao, String titulo, String descricao) {
        this.id = id;
        this.edicao = edicao;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void addAutor(Autor a) {
        this.autores.add(a);
    }

    public void removeAutor(Autor a) {
        this.autores.remove(a);
    }
}
