/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.passagem;

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
public class RepositoryReservaPassagem {
    
    @PersistenceContext
    private EntityManager em;
    
    public void salvarNovoReservaPassagem(ReservaPassagem rp) {
        em.persist(rp);
    }
    
    public ReservaPassagem findReservaPassagem(String codigo) {
        TypedQuery<ReservaPassagem> q = em.createQuery("SELECT rp FROM reservapassagem rp WHERE rp.codigo=:codigo", ReservaPassagem.class);
        q.setParameter("codigo", codigo);
        return q.getSingleResult();
    }
    
    public ReservaPassagem[] todasOsReservaPassagem() {
        List<ReservaPassagem> resultList = em.createQuery("FROM reservaPassagem rp").getResultList();
        return resultList.toArray(new ReservaPassagem[0]);
    }

//    public List<ReservaPassagem> listarReservaPassagemPorPassagem(Long id) {
//        List<Long> resultListp = em.createQuery("FROM passagem_reservaPassagem rp").getResultList();
//        List<ReservaPassagem> rp = new ArrayList<>();
//        for (Long long1 : resultListp) {
//            rp.add(findReservaPassagem(long1));
//        }
//        return rp;
//    }
    public void atualizarReservaPassagem(ReservaPassagem rp) {
        em.merge(rp);
    }
    
    public void removerReservaPassagem(ReservaPassagem reservaPassagem) {  
        em.remove(em.merge(reservaPassagem));
//        TypedQuery<ReservaPassagem> q = em.createQuery("SELECT rp FROM reservaPassagem rp WHERE rp.codigo=:codigo", ReservaPassagem.class);
//        q.setParameter("codigo", reservaPassagem.getCodigo());
//        ReservaPassagem rp = q.getSingleResult();
//        System.out.println("Excluindo o ReservaPassagem: " + rp.getId());
//        removerReservaPassagemAlternativo(rp);
    }
    
    public void removerReservaPassagemAlternativo(ReservaPassagem p) {
        em.remove(em.merge(p));
    }
    
}
