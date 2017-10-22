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
public class HotelId1 implements Serializable {

    private String cnpjHotel;

    public HotelId1() {
    }

    public HotelId1(String cnpjHotel) {
        this.cnpjHotel = cnpjHotel;
    }

    public String getCnpjHotel() {
        return cnpjHotel;
    }

    public void setCnpjHotel(String cnpjHotel) {
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
        final HotelId1 other = (HotelId1) obj;
        if (!Objects.equals(this.cnpjHotel, other.cnpjHotel)) {
            return false;
        }
        return true;
    }

}
