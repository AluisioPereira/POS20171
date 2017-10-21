/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.hotel;

import java.util.ArrayList;
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
public class RepositoryReservaHotel {

    @PersistenceContext
    private EntityManager em;

    public void salvarNovoReservaHotel(ReservaHotel rh) {
        em.persist(rh);
    }

    public ReservaHotel findReservaHotel(Long id) {
        TypedQuery<ReservaHotel> q = em.createQuery("SELECT rh FROM reservahotel rh WHERE rh.id=:id", ReservaHotel.class);
        q.setParameter("id", id);
        return q.getSingleResult();
    }

    public ReservaHotel[] todasOsReservaHotel() {
        List<ReservaHotel> resultList = em.createQuery("FROM reservahotel rh").getResultList();
        return resultList.toArray(new ReservaHotel[0]);
    }
    
    
     public List<ReservaHotel> listarReservaHotelPorHotel(Long id) {
        List<Long> resultListp = em.createQuery("FROM hotel_reservahotel ap").getResultList();
        List<ReservaHotel> ap = new ArrayList<>();
        for (Long long1 : resultListp) {
            ap.add(findReservaHotel(long1));
        }
        return ap;
    }
    

    public void atualizarReservaHotel(ReservaHotel rh) {
        em.merge(rh);
    }

    public void removerReservaHotel(Long id) {
        TypedQuery<ReservaHotel> q = em.createQuery("SELECT rh FROM ReservaHotel rh WHERE rh.id=:id", ReservaHotel.class);
        q.setParameter("id", id);
        ReservaHotel rh = q.getSingleResult();
        System.out.println("Excluindo o ReservaHotel: " + rh.getId());
        removerReservaHotelAlternativo(rh);
    }
    

    public void removerReservaHotelAlternativo(ReservaHotel h) {
        em.remove(em.merge(h));
    }
    
    
    

}
