/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author ajp
 */

@Embeddable
public class ClienteId implements Serializable {

    private Integer cpf;

    public ClienteId() {
    }

    public ClienteId(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cpf);
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
        final ClienteId other = (ClienteId) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

}
