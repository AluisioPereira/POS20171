/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ajp
 */
@Entity
@XmlRootElement
public class Hotel implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cnpj;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ReservaHotel> reservas = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @XmlTransient
    public List<ReservaHotel> getReservas() {
        return reservas;
    }

    public void setReservas(List<ReservaHotel> reservas) {
        this.reservas = reservas;
    }

    public void addReservaHotel(ReservaHotel rh) {
        this.reservas.add(rh);
    }

    public void removeReservaHotel(ReservaHotel rh) {
        this.reservas.remove(rh);
    }
}
