/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia;

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
public class Agencia implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cnpj;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Pacote> pacote = new ArrayList<>();

    public Agencia() {
    }

    public Agencia(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Pacote> getPacote() {
        return pacote;
    }

    public void setPacote(List<Pacote> pacote) {
        this.pacote = pacote;
    }

    public void addPacote(Pacote p) {
        this.pacote.add(p);
    }

    public void removeReservaPassagem(Pacote p) {
        this.pacote.remove(p);
    }
}
