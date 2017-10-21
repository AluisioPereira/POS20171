/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.passagem;

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
public class Passagem implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String cnpjEmpresa;
    private int numeroPoutrona;
    private String origem;
    private String destino;
    private String dataHoraChegada;
    private String dataHoraSaida;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ReservaPassagem> reservas = new ArrayList<>();

    public Passagem() {
    }

    public Passagem(String cnpjEmpresa, int numeroPoutrona, String origem, String destino, String dataHoraChegada, String dataHoraSaida) {
        this.cnpjEmpresa = cnpjEmpresa;
        this.numeroPoutrona = numeroPoutrona;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraChegada = dataHoraChegada;
        this.dataHoraSaida = dataHoraSaida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public int getNumeroPoutrona() {
        return numeroPoutrona;
    }

    public void setNumeroPoutrona(int numeroPoutrona) {
        this.numeroPoutrona = numeroPoutrona;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(String dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public String getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public List<ReservaPassagem> getReservas() {
        return reservas;
    }

    public void setReservas(List<ReservaPassagem> reservas) {
        this.reservas = reservas;
    }

    public void addPassagem(ReservaPassagem rp) {
        this.reservas.add(rp);
    }

    public void removePassagem(ReservaPassagem rp) {
        this.reservas.remove(rp);
    }

}
