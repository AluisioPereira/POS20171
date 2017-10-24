/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia;

import br.edu.ifpb.pos.domain.AgenciaId1;
import br.edu.ifpb.pos.domain.ClienteId1;
import br.edu.ifpb.pos.domain.HotelId1;
import br.edu.ifpb.pos.domain.PassagemId1;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
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
    
    @Column(name="codigo")
    private String codigo;
    @Column(name="cliente")
    private ClienteId1 cliente;
    @Column(name="hotel")
    private HotelId1 hotel;
    @Column(name="passagem")
    private PassagemId1 passagem;
    @Column(name="agencia")
    private AgenciaId1 agencia;

    public Pacote() {
    }

    public Pacote(ClienteId1 cliente, HotelId1 hotel, PassagemId1 passagem) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.passagem = passagem;
    }

    public Pacote(String codigo, ClienteId1 cliente, HotelId1 hotel, PassagemId1 passagem, AgenciaId1 agencia) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.hotel = hotel;
        this.passagem = passagem;
        this.agencia = agencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public AgenciaId1 getAgencia() {
        return agencia;
    }

    public void setAgencia(AgenciaId1 agencia) {
        this.agencia = agencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteId1 getCliente() {
        return cliente;
    }

    public void setCliente(ClienteId1 cliente) {
        this.cliente = cliente;
    }

    public HotelId1 getHotel() {
        return hotel;
    }

    public void setHotel(HotelId1 hotel) {
        this.hotel = hotel;
    }

    public PassagemId1 getPassagem() {
        return passagem;
    }

    public void setPassagem(PassagemId1 passagem) {
        this.passagem = passagem;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.codigo);
        hash = 67 * hash + Objects.hashCode(this.cliente);
        hash = 67 * hash + Objects.hashCode(this.hotel);
        hash = 67 * hash + Objects.hashCode(this.passagem);
        hash = 67 * hash + Objects.hashCode(this.agencia);
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
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.hotel, other.hotel)) {
            return false;
        }
        if (!Objects.equals(this.passagem, other.passagem)) {
            return false;
        }
        if (!Objects.equals(this.agencia, other.agencia)) {
            return false;
        }
        return true;
    }

}
