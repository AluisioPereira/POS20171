/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia;

import static br.edu.ifpb.pos.agencia.Pacote_.hotel;
import br.edu.ifpb.pos.agencia.domain.ClienteId;
import br.edu.ifpb.pos.agencia.domain.HotelId;
import br.edu.ifpb.pos.agencia.domain.PassagemId;

/**
 *
 * @author ajp
 */
public class Principal {

    public static void main(String[] args) {
//        ServiceClienteService proxy = new ServiceClienteService();
//        ServiceCliente service = proxy.getServiceClientePort();

        ClienteId cid = new ClienteId("111.222.333-44");

        PassagemId pid = new PassagemId("01.111.0001/22");

        HotelId hid = new HotelId("01.111.0001/22");

        Pacote rp = new Pacote(cid, hid, pid);

    }
}
