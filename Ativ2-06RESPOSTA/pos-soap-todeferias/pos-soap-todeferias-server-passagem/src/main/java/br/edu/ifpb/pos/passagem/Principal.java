/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.passagem;

import br.edu.ifpb.pos.domain.ClienteId;
import br.edu.ifpb.pos.domain.PassagemId;

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

        Passagem p = new Passagem("#01.111.0001/22", 32, "Cajazeiras", "João pessoa", "23/10/2017; 6:00hs", "22/10/2017; 22:00hs");

        ReservaPassagem rp = new ReservaPassagem(cid, pid);

        p.addPassagem(rp);

//      ServiceHotel sh = new ServiceHotel();
//      RepositoryHotel rh = new RepositoryHotel();
//        
//      rh.salvarNovoHotel(h);
    }
}
