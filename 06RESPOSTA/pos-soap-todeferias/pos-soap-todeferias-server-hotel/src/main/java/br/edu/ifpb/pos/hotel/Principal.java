/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.hotel;

import br.edu.ifpb.pos.cliente.Cliente;
import br.edu.ifpb.pos.cliente.ServiceCliente;
import br.edu.ifpb.pos.cliente.ServiceClienteService;
import br.edu.ifpb.pos.hotel.domain.ClienteId;
import br.edu.ifpb.pos.hotel.domain.HotelId;

/**
 *
 * @author ajp
 */
public class Principal {

    public static void main(String[] args) {
        ServiceClienteService proxy = new ServiceClienteService();
        ServiceCliente service = proxy.getServiceClientePort();

        ClienteId cid = new ClienteId("111.222.333-44");

        Cliente c = new Cliente();
        c.setNome("DisciplinaPOS");
        c.setCpf("111.222.333-44");
        c.setRenda(100.0);

        HotelId hid = new HotelId("01.111.0001/22");

        Hotel h = new Hotel("Hotel dos alunos POs", "01.111.0001/22");

        ReservaHotel rh = new ReservaHotel(cid, hid);

        h.addReserva(rh);

//      ServiceHotel sh = new ServiceHotel();
//      RepositoryHotel rh = new RepositoryHotel();
//        
//      rh.salvarNovoHotel(h);
    }
}
