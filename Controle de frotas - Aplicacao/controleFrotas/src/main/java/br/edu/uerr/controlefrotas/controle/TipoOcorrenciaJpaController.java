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
import br.edu.uerr.controlefrotas.modelo.Ocorrencia;
import br.edu.uerr.controlefrotas.modelo.TipoOcorrencia;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class TipoOcorrenciaJpaController implements Serializable {

    public TipoOcorrenciaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoOcorrencia tipoOcorrencia) {
       EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(tipoOcorrencia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoOcorrencia tipoOcorrencia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoOcorrencia persistentTipoOcorrencia = em.find(TipoOcorrencia.class, tipoOcorrencia.getId());
            List<Ocorrencia> ocorrenciaListOld = persistentTipoOcorrencia.getOcorrenciaList();
            List<Ocorrencia> ocorrenciaListNew = tipoOcorrencia.getOcorrenciaList();
            List<Ocorrencia> attachedOcorrenciaListNew = new ArrayList<Ocorrencia>();
            for (Ocorrencia ocorrenciaListNewOcorrenciaToAttach : ocorrenciaListNew) {
                ocorrenciaListNewOcorrenciaToAttach = em.getReference(ocorrenciaListNewOcorrenciaToAttach.getClass(), ocorrenciaListNewOcorrenciaToAttach.getId());
                attachedOcorrenciaListNew.add(ocorrenciaListNewOcorrenciaToAttach);
            }
            ocorrenciaListNew = attachedOcorrenciaListNew;
            tipoOcorrencia.setOcorrenciaList(ocorrenciaListNew);
            tipoOcorrencia = em.merge(tipoOcorrencia);
            for (Ocorrencia ocorrenciaListOldOcorrencia : ocorrenciaListOld) {
                if (!ocorrenciaListNew.contains(ocorrenciaListOldOcorrencia)) {
                    ocorrenciaListOldOcorrencia.setTipoOcorrenciaId(null);
                    ocorrenciaListOldOcorrencia = em.merge(ocorrenciaListOldOcorrencia);
                }
            }
            for (Ocorrencia ocorrenciaListNewOcorrencia : ocorrenciaListNew) {
                if (!ocorrenciaListOld.contains(ocorrenciaListNewOcorrencia)) {
                    TipoOcorrencia oldTipoOcorrenciaIdOfOcorrenciaListNewOcorrencia = ocorrenciaListNewOcorrencia.getTipoOcorrenciaId();
                    ocorrenciaListNewOcorrencia.setTipoOcorrenciaId(tipoOcorrencia);
                    ocorrenciaListNewOcorrencia = em.merge(ocorrenciaListNewOcorrencia);
                    if (oldTipoOcorrenciaIdOfOcorrenciaListNewOcorrencia != null && !oldTipoOcorrenciaIdOfOcorrenciaListNewOcorrencia.equals(tipoOcorrencia)) {
                        oldTipoOcorrenciaIdOfOcorrenciaListNewOcorrencia.getOcorrenciaList().remove(ocorrenciaListNewOcorrencia);
                        oldTipoOcorrenciaIdOfOcorrenciaListNewOcorrencia = em.merge(oldTipoOcorrenciaIdOfOcorrenciaListNewOcorrencia);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tipoOcorrencia.getId();
                if (findTipoOcorrencia(id) == null) {
                    throw new NonexistentEntityException("The tipoOcorrencia with id " + id + " no longer exists.");
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
            TipoOcorrencia tipoOcorrencia;
            try {
                tipoOcorrencia = em.getReference(TipoOcorrencia.class, id);
                tipoOcorrencia.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoOcorrencia with id " + id + " no longer exists.", enfe);
            }
            List<Ocorrencia> ocorrenciaList = tipoOcorrencia.getOcorrenciaList();
            for (Ocorrencia ocorrenciaListOcorrencia : ocorrenciaList) {
                ocorrenciaListOcorrencia.setTipoOcorrenciaId(null);
                ocorrenciaListOcorrencia = em.merge(ocorrenciaListOcorrencia);
            }
            em.remove(tipoOcorrencia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoOcorrencia> findTipoOcorrenciaEntities() {
        return findTipoOcorrenciaEntities(true, -1, -1);
    }

    public List<TipoOcorrencia> findTipoOcorrenciaEntities(int maxResults, int firstResult) {
        return findTipoOcorrenciaEntities(false, maxResults, firstResult);
    }

    private List<TipoOcorrencia> findTipoOcorrenciaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoOcorrencia.class));
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

    public TipoOcorrencia findTipoOcorrencia(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoOcorrencia.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoOcorrenciaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoOcorrencia> rt = cq.from(TipoOcorrencia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
