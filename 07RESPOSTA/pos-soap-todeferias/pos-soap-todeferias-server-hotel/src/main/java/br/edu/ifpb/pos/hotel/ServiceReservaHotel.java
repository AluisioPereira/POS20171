/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.hotel;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author ajp
 */
@Stateless
@WebService
public class ServiceReservaHotel {
    @EJB
    private RepositoryReservaHotel repositoryReservaHotel;

    public void salvarReservaHotel(ReservaHotel reservaHotel) {
        repositoryReservaHotel.salvarNovoReservaHotel(reservaHotel);
    }

    public ReservaHotel encontrarReservaHotel(String id) {
        return repositoryReservaHotel.findReservaHotel(id);
    }

    public ReservaHotel[] listarTodasReservaHotel() {
        return repositoryReservaHotel.todasOsReservaHotel();
    }
    
  

    public void atualizarReservaHotel(ReservaHotel reservaHotel) {
        repositoryReservaHotel.atualizarReservaHotel(reservaHotel);
    }

    
    public void removerReservaHotel(ReservaHotel id) {
        repositoryReservaHotel.removerReservaHotel(id);
    }
    
}
