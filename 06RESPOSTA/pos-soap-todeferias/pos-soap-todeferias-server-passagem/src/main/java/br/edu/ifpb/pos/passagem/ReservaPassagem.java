/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.passagem;

import br.edu.ifpb.pos.passagem.domain.ClienteId;
import br.edu.ifpb.pos.passagem.domain.PassagemId;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author ajp
 */
@Entity
public class ReservaPassagem implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    
    private String codigo;
    
    private ClienteId cliente;

    private PassagemId passagem;

    public ReservaPassagem() {
    }

    public ReservaPassagem(ClienteId cliente, PassagemId passagem) {
        this.cliente = cliente;
        this.passagem = passagem;
    }

    public ReservaPassagem(String codigo, ClienteId cliente, PassagemId passagem) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.passagem = passagem;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteId getCliente() {
        return cliente;
    }

    public void setCliente(ClienteId cliente) {
        this.cliente = cliente;
    }

    public PassagemId getPassagem() {
        return passagem;
    }

    public void setPassagem(PassagemId passagem) {
        this.passagem = passagem;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.codigo);
        hash = 97 * hash + Objects.hashCode(this.cliente);
        hash = 97 * hash + Objects.hashCode(this.passagem);
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
        final ReservaPassagem other = (ReservaPassagem) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.passagem, other.passagem)) {
            return false;
        }
        return true;
    }

   

}
