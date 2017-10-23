/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia;

import br.edu.ifpb.pos.domain.AgenciaId1;
import br.edu.ifpb.pos.domain.ClienteId1;
import br.edu.ifpb.pos.domain.HotelId1;
import br.edu.ifpb.pos.domain.PassagemId1;


/**
 *
 * @author ajp
 */
public class Principal {

    public static void main(String[] args) {
        String codigo = "234##234";
        ClienteId1 cid = new ClienteId1("111.222.333-44");

        PassagemId1 pid = new PassagemId1("01.111.0001/22");

        HotelId1 hid = new HotelId1("01.111.0001/22");

        AgenciaId1 aid = new AgenciaId1("01.111.0001/22");

        Pacote rp = new Pacote(codigo, cid, hid, pid, aid);

    }
}
