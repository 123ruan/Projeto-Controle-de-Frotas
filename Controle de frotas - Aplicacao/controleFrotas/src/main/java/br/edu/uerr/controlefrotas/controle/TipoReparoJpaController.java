/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.controle;

import br.edu.uerr.controlefrotas.controle.exceptions.NonexistentEntityException;
import br.edu.uerr.controlefrotas.modelo.TipoReparo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Ruan PC
 */
public class TipoReparoJpaController implements Serializable {

    public TipoReparoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoReparo tipoReparo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoReparo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoReparo tipoReparo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoReparo = em.merge(tipoReparo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tipoReparo.getId();
                if (findTipoReparo(id) == null) {
                    throw new NonexistentEntityException("The tipoReparo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoReparo tipoReparo;
            try {
                tipoReparo = em.getReference(TipoReparo.class, id);
                tipoReparo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoReparo with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoReparo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoReparo> findTipoReparoEntities() {
        return findTipoReparoEntities(true, -1, -1);
    }

    public List<TipoReparo> findTipoReparoEntities(int maxResults, int firstResult) {
        return findTipoReparoEntities(false, maxResults, firstResult);
    }

    private List<TipoReparo> findTipoReparoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoReparo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TipoReparo findTipoReparo(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoReparo.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoReparoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoReparo> rt = cq.from(TipoReparo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
