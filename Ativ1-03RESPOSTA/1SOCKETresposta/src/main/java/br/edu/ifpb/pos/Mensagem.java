/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ajp
 */
public class Mensagem implements Serializable{
    private String idetidade;
    private String texto;

    public Mensagem(String idetidade, String texto) {
        this.idetidade = idetidade;
        this.texto = texto;
    }

    public Mensagem() {
    }
    

    public String getIdetidade() {
        return idetidade;
    }

    public void setIdetidade(String idetidade) {
        this.idetidade = idetidade;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.idetidade);
        hash = 89 * hash + Objects.hashCode(this.texto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mensagem other = (Mensagem) obj;
        if (!Objects.equals(this.idetidade, other.idetidade)) {
            return false;
        }
        if (!Objects.equals(this.texto, other.texto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idetidade + "- Disse: " + texto;
    }
    
    
}
