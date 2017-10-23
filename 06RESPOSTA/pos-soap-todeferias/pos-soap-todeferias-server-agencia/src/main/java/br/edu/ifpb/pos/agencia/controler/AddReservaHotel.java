/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia.controler;

import br.edu.ifpb.pos.hotel.ClienteId;
import br.edu.ifpb.pos.hotel.Hotel;
import br.edu.ifpb.pos.hotel.HotelId;
import br.edu.ifpb.pos.hotel.ReservaHotel;
import br.edu.ifpb.pos.hotel.ServiceHotel;
import br.edu.ifpb.pos.hotel.ServiceHotelService;

/**
 *
 * @author ajp
 */
public class AddReservaHotel {

    ReservaHotel rh = new ReservaHotel();

    ClienteId cid = new ClienteId();
    HotelId hid = new HotelId();
    Hotel eh = new Hotel();

    public void addReserva(Hotel eh, Long id, String codigo, String cpf, String cnpjHotel) {
        rh.setId(id);
        
        rh.setCodigo(codigo);
        
        cid.setCpf(cpf);
        hid.setCnpjHotel(cnpjHotel);

        rh.setCliente(cid);

        rh.setHotel(hid);       
        
        
        ServiceHotelService proxyh = new ServiceHotelService();
        ServiceHotel serviceh = proxyh.getServiceHotelPort();
        
        
        this.eh = eh;
        this.eh.getReservas().add(rh);
        serviceh.atualizarHotel(eh);
        

    }

}
