/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia;

import br.edu.ifpb.pos.agencia.domain.AgenciaId;
import br.edu.ifpb.pos.model.PassagemId;
import br.edu.ifpb.pos.model.ClienteId;
import br.edu.ifpb.pos.model.HotelId;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ajp
 */
@Entity
@XmlRootElement
public class Pacote implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "codigo")
    private String codigo;
    @Column(name = "cliente")
    private ClienteId cliente;
    @Column(name = "hotel")
    private HotelId hotel;
    @Column(name = "passagem")
    private PassagemId passagem;
    @Column(name = "agencia")
    private AgenciaId agencia;

    public Pacote() {
    }

    public Pacote(ClienteId cliente, HotelId hotel, PassagemId passagem) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.passagem = passagem;
    }

    public Pacote(String codigo, ClienteId cliente, HotelId hotel, PassagemId passagem, AgenciaId agencia) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.hotel = hotel;
        this.passagem = passagem;
        this.agencia = agencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public AgenciaId getAgencia() {
        return agencia;
    }

    public void setAgencia(AgenciaId agencia) {
        this.agencia = agencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.codigo);
        hash = 97 * hash + Objects.hashCode(this.cliente);
        hash = 97 * hash + Objects.hashCode(this.hotel);
        hash = 97 * hash + Objects.hashCode(this.passagem);
        hash = 97 * hash + Objects.hashCode(this.agencia);
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
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
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
