/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.controle;

import br.edu.uerr.controlefrotas.controle.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import br.edu.uerr.controlefrotas.modelo.Empresa;
import br.edu.uerr.controlefrotas.modelo.Reparo;
import br.edu.uerr.controlefrotas.modelo.Veiculo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class ReparoJpaController implements Serializable {

    public ReparoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Reparo reparo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(reparo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    public void edit(Reparo reparo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Reparo persistentReparo = em.find(Reparo.class, reparo.getId());
            Empresa empresaIdOld = persistentReparo.getEmpresaId();
            Empresa empresaIdNew = reparo.getEmpresaId();
            Veiculo veiculoIdOld = persistentReparo.getVeiculoId();
            Veiculo veiculoIdNew = reparo.getVeiculoId();
            if (empresaIdNew != null) {
                empresaIdNew = em.getReference(empresaIdNew.getClass(), empresaIdNew.getId());
                reparo.setEmpresaId(empresaIdNew);
            }
            if (veiculoIdNew != null) {
                veiculoIdNew = em.getReference(veiculoIdNew.getClass(), veiculoIdNew.getId());
                reparo.setVeiculoId(veiculoIdNew);
            }
            reparo = em.merge(reparo);
            if (empresaIdOld != null && !empresaIdOld.equals(empresaIdNew)) {
                empresaIdOld.getReparoList().remove(reparo);
                empresaIdOld = em.merge(empresaIdOld);
            }
            if (empresaIdNew != null && !empresaIdNew.equals(empresaIdOld)) {
                empresaIdNew.getReparoList().add(reparo);
                empresaIdNew = em.merge(empresaIdNew);
            }
            if (veiculoIdOld != null && !veiculoIdOld.equals(veiculoIdNew)) {
                veiculoIdOld.getReparoList().remove(reparo);
                veiculoIdOld = em.merge(veiculoIdOld);
            }
            if (veiculoIdNew != null && !veiculoIdNew.equals(veiculoIdOld)) {
                veiculoIdNew.getReparoList().add(reparo);
                veiculoIdNew = em.merge(veiculoIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = reparo.getId();
                if (findReparo(id) == null) {
                    throw new NonexistentEntityException("The reparo with id " + id + " no longer exists.");
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
            Reparo reparo;
            try {
                reparo = em.getReference(Reparo.class, id);
                reparo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reparo with id " + id + " no longer exists.", enfe);
            }
            Empresa empresaId = reparo.getEmpresaId();
            if (empresaId != null) {
                empresaId.getReparoList().remove(reparo);
                empresaId = em.merge(empresaId);
            }
            Veiculo veiculoId = reparo.getVeiculoId();
            if (veiculoId != null) {
                veiculoId.getReparoList().remove(reparo);
                veiculoId = em.merge(veiculoId);
            }
            em.remove(reparo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Reparo> findReparoEntities() {
        return findReparoEntities(true, -1, -1);
    }

    public List<Reparo> findReparoEntities(int maxResults, int firstResult) {
        return findReparoEntities(false, maxResults, firstResult);
    }

    private List<Reparo> findReparoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Reparo.class));
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

    public Reparo findReparo(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reparo.class, id);
        } finally {
            em.close();
        }
    }

    public int getReparoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Reparo> rt = cq.from(Reparo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
