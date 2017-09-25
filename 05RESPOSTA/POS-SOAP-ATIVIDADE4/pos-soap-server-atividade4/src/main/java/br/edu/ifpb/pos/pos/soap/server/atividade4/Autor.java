/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.pos.soap.server.atividade4;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author ajp
 */
@Entity
public class Autor implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String email;
    private String abreviacao;

    public Autor() {
    }

    public Autor(int id, String nome, String email, String abreviacao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.abreviacao = abreviacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }
    
    
}
