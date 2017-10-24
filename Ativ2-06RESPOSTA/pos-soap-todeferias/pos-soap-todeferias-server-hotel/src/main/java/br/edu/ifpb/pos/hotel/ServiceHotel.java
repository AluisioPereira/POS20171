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
public class ServiceHotel {

    @EJB
    private RepositoryHotel repositoryHotel;

    public void salvarHotel(Hotel hotel) {
        repositoryHotel.salvarNovoHotel(hotel);
    }

    public Hotel encontrarHotel(String cnpj) {
        return repositoryHotel.findHotel(cnpj);
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
