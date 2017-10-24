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
public class HotelId implements Serializable {

    private Integer cnpjHotel;

    public HotelId() {
    }

    public HotelId(Integer cnpjHotel) {
        this.cnpjHotel = cnpjHotel;
    }

    public Integer getCnpjHotel() {
        return cnpjHotel;
    }

    public void setCnpjHotel(Integer cnpjHotel) {
        this.cnpjHotel = cnpjHotel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.cnpjHotel);
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
        final HotelId other = (HotelId) obj;
        if (!Objects.equals(this.cnpjHotel, other.cnpjHotel)) {
            return false;
        }
        return true;
    }

}
