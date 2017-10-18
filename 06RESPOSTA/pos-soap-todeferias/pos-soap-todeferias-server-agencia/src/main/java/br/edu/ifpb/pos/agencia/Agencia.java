/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
public class Agencia implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cnpj;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ReservaHotel> reservasHotel = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ReservaPassagem> reservasPassagem = new ArrayList<>();

    public Agencia() {
    }

    public Agencia(String nome, String cnpj) {
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

    public List<ReservaHotel> getReservasHotel() {
        return reservasHotel;
    }

    public void setReservasHotel(List<ReservaHotel> reservasHotel) {
        this.reservasHotel = reservasHotel;
    }

    public List<ReservaPassagem> getReservasPassagem() {
        return reservasPassagem;
    }

    public void setReservasPassagem(List<ReservaPassagem> reservasPassagem) {
        this.reservasPassagem = reservasPassagem;
    }

    public void addReservaHotel(ReservaHotel rh) {
        this.reservasHotel.add(rh);
    }

    public void removeReservaHotel(ReservaHotel rh) {
        this.reservasHotel.remove(rh);
    }

    public void addReservaPassagem(ReservaPassagem rp) {
        this.reservasPassagem.add(rp);
    }

    public void removeReservaPassagem(ReservaPassagem rp) {
        this.reservasPassagem.remove(rp);
    }
}
