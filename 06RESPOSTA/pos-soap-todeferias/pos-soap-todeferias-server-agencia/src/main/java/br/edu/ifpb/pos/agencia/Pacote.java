/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia;

import br.edu.ifpb.pos.agencia.domain.ClienteId;
import br.edu.ifpb.pos.agencia.domain.HotelId;
import br.edu.ifpb.pos.agencia.domain.PassagemId;
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
public class Pacote implements Serializable {

    @Id
    @GeneratedValue
    private Long id;    
    private ClienteId cliente;
    private HotelId hotel;
    private PassagemId passagem;

    public Pacote() {
    }

    public Pacote(ClienteId cliente, HotelId hotel, PassagemId passagem) {
        this.cliente = cliente;
        this.hotel = hotel;
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

    public HotelId getHotel() {
        return hotel;
    }

    public void setHotel(HotelId hotel) {
        this.hotel = hotel;
    }

    public PassagemId getPassagem() {
        return passagem;
    }

    public void setPassagem(PassagemId passagem) {
        this.passagem = passagem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.cliente);
        hash = 29 * hash + Objects.hashCode(this.hotel);
        hash = 29 * hash + Objects.hashCode(this.passagem);
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
        final Pacote other = (Pacote) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.hotel, other.hotel)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Pacote{" + "id=" + id + ", cliente=" + cliente + ", hotel=" + hotel + ", passagem=" + passagem + '}';
    }

}
