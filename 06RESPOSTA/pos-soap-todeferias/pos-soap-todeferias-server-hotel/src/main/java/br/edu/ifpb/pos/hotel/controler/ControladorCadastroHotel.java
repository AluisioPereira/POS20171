/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.hotel.controler;

import br.edu.ifpb.pos.hotel.Hotel;
import br.edu.ifpb.pos.hotel.ReservaHotel;
import br.edu.ifpb.pos.hotel.ServiceHotel;
import br.edu.ifpb.pos.hotel.ServiceReservaHotel;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 *
 * @author ajp
 */
@Named
@javax.enterprise.context.SessionScoped
public class ControladorCadastroHotel implements Serializable {

    private Hotel hotel;

    @EJB
    private ServiceHotel servicoHotel;

    private ReservaHotel reservaHotel;

    @EJB
    private ServiceReservaHotel servicoReservaHotel;

    public String novaHotel() {
        String url;
        url = "index?faces-redirect=true";
        hotel = new Hotel();
        return url;
    }

    public String novoReservaHotel() {
        String url;
        url = "indexp?faces-redirect=true";
        reservaHotel = new ReservaHotel();
        return url;
    }

    public String cadastrar() {
        String url;
        if (this.hotel.getId() == null) {
            this.servicoHotel.salvarHotel(hotel);
            url = "index?faces-redirect=true";
        } else {
            servicoHotel.atualizarHotel(hotel);
        }
        url = "gerenciamento?faces-redirect=true";
        hotel = new Hotel();
        return url;
    }

    public String cadastrarRH1() {
        String url;
        if (this.reservaHotel.getId() == null) {
            this.servicoReservaHotel.salvarReservaHotel(reservaHotel);
            url = "indexp?faces-redirect=true";
        } else {
            servicoReservaHotel.atualizarReservaHotel(reservaHotel);
        }
        url = "gerenciamento?faces-redirect=true";
        reservaHotel = new ReservaHotel();
        return url;
    }

    public String cadastrarRH() {
        String url;
        if (this.reservaHotel.getId() == null) {
            this.servicoReservaHotel.salvarReservaHotel(reservaHotel);
            this.servicoHotel.atualizarHotel(hotel);
            url = "informacoes?faces-redirect=true";
        } else {
            servicoReservaHotel.atualizarReservaHotel(reservaHotel);
        }
        url = "indexp?faces-redirect=true";
        reservaHotel = new ReservaHotel();
        return url;
    }

    public String principal() {
        String url;
        url = "index?faces-redirect=true";
        hotel = new Hotel();
        return url;
    }

    public String gerenciamento() {
        String url;
        url = "gerenciamento?faces-redirect=true";
        hotel = new Hotel();
        return url;
    }

    public List<Hotel> listar() {
        Hotel[] lista = servicoHotel.listarTodasHotel();
        return Arrays.asList(lista);

    }

    public List<ReservaHotel> listarReservaHotel() {
        ReservaHotel[] lista = servicoReservaHotel.listarTodasReservaHotel();
        return Arrays.asList(lista);

    }

    public List<ReservaHotel> listarReservaHotelPorHotel(Long id) {
        return servicoReservaHotel.listarReservaHotelPorHotel(id);
    }

    public String atualizar(String cnpj) {
        hotel = consultar(cnpj);
        if (hotel != null) {
            return "editar.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String atualizarReservaHotel(Long id) {
        reservaHotel = consultarReservaHotel(id);
        if (reservaHotel != null) {
            return "editarp.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public Hotel consultar(String cnpj) {
        return servicoHotel.encontrarHotel(cnpj);
    }

    public ReservaHotel consultarReservaHotel(Long id) {
        return servicoReservaHotel.encontrarReservaHotel(id);
    }

    public String mostraHotel(String id) {
        hotel = servicoHotel.encontrarHotel(id);
        return "informacoes";
    }

    public String mostraReservaHotel(Long id) {
        reservaHotel = servicoReservaHotel.encontrarReservaHotel(id);
        return "informacoesp";
    }

    public String mostraInformacoes(String id) {
        hotel = servicoHotel.encontrarHotel(id);
        if (hotel != null) {
            return "informacoes.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String remover(String cnpj) {
        System.err.println("controle" + cnpj);
        servicoHotel.removerHotel(cnpj);
        return null;
    }

    public String removerReservaHotel(Long id) {
        System.err.println("controle" + id);
        servicoReservaHotel.removerReservaHotel(id);
        return null;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public ServiceHotel getServicoHotel() {
        return servicoHotel;
    }

    public void setServicoHotel(ServiceHotel servicoHotel) {
        this.servicoHotel = servicoHotel;
    }

    public ReservaHotel getReservaHotel() {
        return reservaHotel;
    }

    public void setReservaHotel(ReservaHotel rh) {
        this.reservaHotel = rh;
    }

    public ServiceReservaHotel getServicoReservaHotel() {
        return servicoReservaHotel;
    }

    public void setServicoReservaHotel(ServiceReservaHotel servicoReservaHotel) {
        this.servicoReservaHotel = servicoReservaHotel;
    }

    public void limparCampos() {
        this.hotel = new Hotel();
    }

    public void limparReservaHotel() {
        this.reservaHotel = new ReservaHotel();
    }
}
