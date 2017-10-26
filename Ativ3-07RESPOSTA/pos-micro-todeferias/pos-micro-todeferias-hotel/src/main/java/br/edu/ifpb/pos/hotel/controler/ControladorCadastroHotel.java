/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.hotel.controler;

import br.edu.ifpb.pos.hotel.Hotel;
import br.edu.ifpb.pos.hotel.ReservaHotel;
import br.edu.ifpb.pos.domain.ClienteId;
import br.edu.ifpb.pos.domain.HotelId;
import br.edu.ifpb.pos.json.Mapper;
import br.edu.ifpb.pos.json.MapperException;
import br.edu.ifpb.pos.model.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import br.edu.ifpb.pos.service.HotelService;
import br.edu.ifpb.pos.service.ReservaHotelService;

/**
 *
 * @author ajp
 */
@Named
@javax.enterprise.context.SessionScoped
public class ControladorCadastroHotel implements Serializable {

    private Hotel hotel;

    @Inject
    private HotelService servicoHotel;

    private ReservaHotel reservaHotel;

    @Inject
    private ReservaHotelService servicoReservaHotel;

    private ClienteId clienteId;

    private HotelId hotelId;

    private String codigo;

    private final Mapper mapper = new Mapper();
    private final String uri = "http://localhost:8080/pos-micro-todeferias-cliente/todeferiasc/cliente";
    private final Client client = ClientBuilder.newClient();
    private final WebTarget root = client.target(uri);

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
        hotelId = new HotelId(hotelId.getCnpjHotel());

        return url;
    }

    public String cadastrar() {
        String url;
        if (this.hotel.getCnpj() == null) {
            this.servicoHotel.create(hotel);
            url = "index?faces-redirect=true";
        } else {
            servicoHotel.edit(hotel);
        }
        url = "gerenciamento?faces-redirect=true";
        hotel = new Hotel();
        return url;
    }

    public String cadastrarRH() {
        String url;
        if (this.reservaHotel.getCodigo() == null) {
            this.reservaHotel = new ReservaHotel(codigo, clienteId, hotelId);
            this.servicoReservaHotel.create(reservaHotel);
            this.servicoHotel.edit(hotel);

            if (this.hotel.getCnpj() == null) {
                this.servicoHotel.create(hotel);
            } else {
                this.hotel.addReservaHotel(reservaHotel);
                servicoHotel.edit(hotel);
            }
            url = "indexp?faces-redirect=true";
        } else {
            servicoReservaHotel.edit(reservaHotel);
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
        List<Hotel> lista = servicoHotel.findAll();
        return lista;

    }

    public List<ReservaHotel> listarReservaHotel() {
        List<ReservaHotel> lista = servicoReservaHotel.findAll();
        return lista;

    }
    private List<SelectItem> clienteSelect;

    public List<SelectItem> getClienteSelect() {
//        if (this.clienteSelect == null) {
        clienteSelect = new ArrayList<>();
        List<Cliente> lista = listarCliente();
        System.out.println("Verfificou lista vazia");
        if ((lista != null) && (!lista.isEmpty())) {
            SelectItem item;
            for (Cliente cliente : lista) {
                item = new SelectItem(cliente.cpf(), cliente.nome());
                this.clienteSelect.add(item);
            }

        }
//        }
        System.out.println("Preencheu valores...");
        return clienteSelect;
    }

    public String atualizar(int cnpj) {
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

    public Hotel consultar(int id) {
        return servicoHotel.find(id);
    }

    public ReservaHotel consultarReservaHotel(int id) {
        return servicoReservaHotel.find(id);
    }

    public String mostraHotel(int id) {
        hotel = servicoHotel.find(id);
        hotelId = new HotelId(id);
        return "informacoes";
    }

    public String mostraReservaHotel(ReservaHotel rh) {
        reservaHotel = rh;
        return "informacoesp";
    }

    public String mostraInformacoes(int id) {
        hotel = servicoHotel.find(id);
        if (hotel != null) {
            return "informacoes.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String remover(int id) {
        servicoHotel.remove(id);
        return null;
    }

    public String removerReservaHotel(ReservaHotel rh) {
        System.err.println("controle" + rh.getCodigo());
        hotel.removeReservaHotel(rh);
        servicoHotel.edit(hotel);
        servicoReservaHotel.remove(rh);

        return null;
    }

    public List<Cliente> listarCliente() {

        try {

            Response response = root.request().get();
            String json = response.readEntity(String.class);
            List<Cliente> clientes;

            clientes = mapper.toList(json, Cliente.class);
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.toString());
            }

           
            return clientes;
        } catch (MapperException ex) {
            Logger.getLogger(ControladorCadastroHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public HotelService getServicoHotel() {
        return servicoHotel;
    }

    public void setServicoHotel(HotelService servicoHotel) {
        this.servicoHotel = servicoHotel;
    }

    public ReservaHotel getReservaHotel() {
        return reservaHotel;
    }

    public void setReservaHotel(ReservaHotel rh) {
        this.reservaHotel = rh;
    }

    public ReservaHotelService getServicoReservaHotel() {
        return servicoReservaHotel;
    }

    public void setServicoReservaHotel(ReservaHotelService servicoReservaHotel) {
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
