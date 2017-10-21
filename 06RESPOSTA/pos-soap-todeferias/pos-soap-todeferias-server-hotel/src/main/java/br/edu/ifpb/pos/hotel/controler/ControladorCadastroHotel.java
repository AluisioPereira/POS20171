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
import br.edu.ifpb.pos.hotel.domain.ClienteId;
import br.edu.ifpb.pos.hotel.domain.HotelId;
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
    
    
    
    private ClienteId clienteId;

    private HotelId hotelId;
    
    private String codigo;

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
        codigo = new String();
        clienteId = new ClienteId();
        hotelId = new HotelId(hotelId.getCnpj());
        
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

   public String cadastrarRH() {
        String url;
        if (this.reservaHotel.getId() == null) {
            this.reservaHotel = new ReservaHotel(codigo, clienteId, hotelId);
            this.servicoReservaHotel.salvarReservaHotel(reservaHotel);
            this.servicoHotel.atualizarHotel(hotel);

            if (this.hotel.getId() == null) {
                this.servicoHotel.salvarHotel(hotel);
            } else {
                this.hotel.addReservaHotel(reservaHotel);
                servicoHotel.atualizarHotel(hotel);
            }
            url = "indexp?faces-redirect=true";
        } else {
            servicoReservaHotel.atualizarReservaHotel(reservaHotel);
        }
        url = "gerenciamento?faces-redirect=true";
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



    public String atualizar(String cnpj) {
        hotel = consultar(cnpj);
        if (hotel != null) {
            return "editar.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String atualizarReservaHotel(ReservaHotel rh) {
        reservaHotel = rh;
        if (reservaHotel != null) {
            return "editarp.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public Hotel consultar(String cnpj) {
        return servicoHotel.encontrarHotel(cnpj);
    }

    public ReservaHotel consultarReservaHotel(String id) {
        return servicoReservaHotel.encontrarReservaHotel(id);
    }

    public String mostraHotel(String id) {
        hotel = servicoHotel.encontrarHotel(id);
        hotelId = new HotelId(id);
        return "informacoes";
    }

    public String mostraReservaHotel(ReservaHotel rh) {
        reservaHotel = rh;
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
    
    
    public String removerReservaHotel(ReservaHotel rh) {
        System.err.println("controle" + rh);
        hotel.removeReservaHotel(rh); 
        servicoHotel.atualizarHotel(hotel);
        servicoReservaHotel.removerReservaHotel(rh);
        
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

    public ClienteId getClienteId() {
        return clienteId;
    }

    public void setClienteId(ClienteId clienteId) {
        this.clienteId = clienteId;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public void setHotelId(HotelId hotelId) {
        this.hotelId = hotelId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    

    public void limparCampos() {
        this.hotel = new Hotel();
    }

    public void limparReservaHotel() {
        this.reservaHotel = new ReservaHotel();
    }
}
