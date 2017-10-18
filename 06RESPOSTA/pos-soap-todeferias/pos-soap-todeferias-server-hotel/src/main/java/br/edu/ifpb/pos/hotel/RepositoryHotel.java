/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.hotel;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author ajp
 */
@Stateless
public class RepositoryHotel {

    @PersistenceContext
    private EntityManager em;

    public void salvarNovoHotel(Hotel hotel) {
        em.persist(hotel);
    }

    public Hotel findHotel(String cnpj) {
        TypedQuery<Hotel> q = em.createQuery("SELECT h FROM Hotel h WHERE h.cnpj=:cnpj", Hotel.class);
        q.setParameter("cnpj", cnpj);
        return q.getSingleResult();
    }

    public Hotel[] todasOsHotel() {
        List<Hotel> resultList = em.createQuery("FROM Hotel h").getResultList();
        return resultList.toArray(new Hotel[0]);
    }

    public void atualizarHotel(Hotel hotel) {
        em.merge(hotel);
    }

    public void removerHotel(String cnpj) {
        TypedQuery<Hotel> q = em.createQuery("SELECT h FROM Hotel h WHERE h.cnpj=:cnpj", Hotel.class);
        Hotel hotel = q.getSingleResult();
        System.out.println("Excluindo o hotel: " + hotel.getNome());
        em.remove(hotel);
    }
}
