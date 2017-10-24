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
public class PassagemId implements Serializable {

    private Integer cnpjEmpresa;

    public PassagemId() {
    }

    public PassagemId(Integer cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public Integer getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(Integer cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.cnpjEmpresa);
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
        final PassagemId other = (PassagemId) obj;
        if (!Objects.equals(this.cnpjEmpresa, other.cnpjEmpresa)) {
            return false;
        }
        return true;
    }

}
