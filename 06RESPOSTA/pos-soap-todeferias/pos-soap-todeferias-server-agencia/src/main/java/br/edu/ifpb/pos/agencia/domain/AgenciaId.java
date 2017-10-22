/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author ajp
 */

@Embeddable
public class AgenciaId implements Serializable {

    private String cnpjAgencia;

    public AgenciaId() {
    }

    public AgenciaId(String cnpjAgencia) {
        this.cnpjAgencia = cnpjAgencia;
    }

    public String getCnpjAgencia() {
        return cnpjAgencia;
    }

    public void setCnpjAgencia(String cnpjAgencia) {
        this.cnpjAgencia = cnpjAgencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.cnpjAgencia);
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
        final AgenciaId other = (AgenciaId) obj;
        if (!Objects.equals(this.cnpjAgencia, other.cnpjAgencia)) {
            return false;
        }
        return true;
    }

    
}
