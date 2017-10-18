/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.hotel;

import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author ajp
 */
@WebService
public class ServiceHotel {

    @EJB
    private RepositoryHotel repositoryHotel;

    public void salvarHotel(Hotel hotel) {
        repositoryHotel.salvarNovoHotel(hotel);
    }

    public void encontrarHotel(String cnpj) {
        repositoryHotel.findHotel(cnpj);
    }

    public Hotel[] listarTodasHotel() {
        return repositoryHotel.todasOsHotel();
    }

    public void atualizarHotel(Hotel hotel) {
        repositoryHotel.atualizarHotel(hotel);
    }

    public void removerHotel(String cnpj) {
        repositoryHotel.removerHotel(cnpj);
    }

}
