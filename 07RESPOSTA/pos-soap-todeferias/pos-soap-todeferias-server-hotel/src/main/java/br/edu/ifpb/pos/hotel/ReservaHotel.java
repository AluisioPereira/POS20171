/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.hotel;

import br.edu.ifpb.pos.domain.ClienteId;
import br.edu.ifpb.pos.domain.HotelId;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author ajp
 */
@Entity
public class ReservaHotel implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String codigo;
    @Embedded
    private ClienteId cliente;
    @Embedded
    private HotelId hotel;

    public ReservaHotel() {
    }

    public ReservaHotel(ClienteId cliente, HotelId hotel) {
        this.cliente = cliente;
        this.hotel = hotel;
    }

    public ReservaHotel(String codigo, ClienteId cliente, HotelId hotel) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.hotel = hotel;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.codigo);
        hash = 79 * hash + Objects.hashCode(this.cliente);
        hash = 79 * hash + Objects.hashCode(this.hotel);
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
        final ReservaHotel other = (ReservaHotel) obj;
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
        return true;
    }

}
