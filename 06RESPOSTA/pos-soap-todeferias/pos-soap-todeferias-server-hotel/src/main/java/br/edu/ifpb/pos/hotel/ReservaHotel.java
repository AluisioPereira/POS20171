/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.hotel;

import br.edu.ifpb.pos.hotel.domain.ClienteId;
import br.edu.ifpb.pos.hotel.domain.HotelId;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
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
public class ReservaHotel implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ClienteId cliente;

    @Embedded
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private HotelId hotel;

    public ReservaHotel() {
    }

    public ReservaHotel(ClienteId cliente, HotelId hotel) {
        this.cliente = cliente;
        this.hotel = hotel;
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
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.cliente);
        hash = 17 * hash + Objects.hashCode(this.hotel);
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
