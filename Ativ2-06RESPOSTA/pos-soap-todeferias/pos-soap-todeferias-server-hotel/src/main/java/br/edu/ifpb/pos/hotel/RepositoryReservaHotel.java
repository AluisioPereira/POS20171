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
public class RepositoryReservaHotel {

    @PersistenceContext
    private EntityManager em;

    public RepositoryReservaHotel() {
    }

    public void salvarNovoReservaHotel(ReservaHotel rh) {
        em.persist(rh);
    }

//    public boolean encontarHotel(ReservaHotel rh) {
//        this.h = this.rp.findHotel(rh.getHotel().getCnpjHotel());
//        if (h != null) {
//            h.addReservaHotel(rh);
//            atualizarHotel(h);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean atualizarHotel(Hotel h) {
//        this.rp.atualizarHotel(h);
//        return true;
//
//    }
    
    
    public ReservaHotel findReservaHotel(String codigo) {
        TypedQuery<ReservaHotel> q = em.createQuery("SELECT rh FROM reservahotel rh WHERE rh.codigo=:codigo", ReservaHotel.class);
        q.setParameter("codigo", codigo);
        return q.getSingleResult();
    }

    public ReservaHotel[] todasOsReservaHotel() {
        List<ReservaHotel> resultList = em.createQuery("FROM reservahotel rh").getResultList();
        return resultList.toArray(new ReservaHotel[0]);
    }

    public void atualizarReservaHotel(ReservaHotel rh) {
        em.merge(rh);
    }

    public void removerReservaHotel(ReservaHotel reservaHotel) {
        em.remove(em.merge(reservaHotel));
    }

}
