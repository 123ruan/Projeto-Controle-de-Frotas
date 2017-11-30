/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.controle;

import br.edu.uerr.controlefrotas.controle.exceptions.NonexistentEntityException;
import br.edu.uerr.controlefrotas.modelo.Ocorrencia;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import br.edu.uerr.controlefrotas.modelo.OrdemServico;
import br.edu.uerr.controlefrotas.modelo.TipoOcorrencia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class OcorrenciaJpaController implements Serializable {

    public OcorrenciaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ocorrencia ocorrencia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(ocorrencia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ocorrencia ocorrencia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ocorrencia persistentOcorrencia = em.find(Ocorrencia.class, ocorrencia.getId());
            OrdemServico ordemServicoIdOld = persistentOcorrencia.getOrdemServicoId();
            OrdemServico ordemServicoIdNew = ocorrencia.getOrdemServicoId();
            TipoOcorrencia tipoOcorrenciaIdOld = persistentOcorrencia.getTipoOcorrenciaId();
            TipoOcorrencia tipoOcorrenciaIdNew = ocorrencia.getTipoOcorrenciaId();
            if (ordemServicoIdNew != null) {
                ordemServicoIdNew = em.getReference(ordemServicoIdNew.getClass(), ordemServicoIdNew.getId());
                ocorrencia.setOrdemServicoId(ordemServicoIdNew);
            }
            if (tipoOcorrenciaIdNew != null) {
                tipoOcorrenciaIdNew = em.getReference(tipoOcorrenciaIdNew.getClass(), tipoOcorrenciaIdNew.getId());
                ocorrencia.setTipoOcorrenciaId(tipoOcorrenciaIdNew);
            }
            ocorrencia = em.merge(ocorrencia);
            if (ordemServicoIdOld != null && !ordemServicoIdOld.equals(ordemServicoIdNew)) {
                ordemServicoIdOld.getOcorrenciaList().remove(ocorrencia);
                ordemServicoIdOld = em.merge(ordemServicoIdOld);
            }
            if (ordemServicoIdNew != null && !ordemServicoIdNew.equals(ordemServicoIdOld)) {
                ordemServicoIdNew.getOcorrenciaList().add(ocorrencia);
                ordemServicoIdNew = em.merge(ordemServicoIdNew);
            }
            if (tipoOcorrenciaIdOld != null && !tipoOcorrenciaIdOld.equals(tipoOcorrenciaIdNew)) {
                tipoOcorrenciaIdOld.getOcorrenciaList().remove(ocorrencia);
                tipoOcorrenciaIdOld = em.merge(tipoOcorrenciaIdOld);
            }
            if (tipoOcorrenciaIdNew != null && !tipoOcorrenciaIdNew.equals(tipoOcorrenciaIdOld)) {
                tipoOcorrenciaIdNew.getOcorrenciaList().add(ocorrencia);
                tipoOcorrenciaIdNew = em.merge(tipoOcorrenciaIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = ocorrencia.getId();
                if (findOcorrencia(id) == null) {
                    throw new NonexistentEntityException("The ocorrencia with id " + id + " no longer exists.");
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
            Ocorrencia ocorrencia;
            try {
                ocorrencia = em.getReference(Ocorrencia.class, id);
                ocorrencia.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ocorrencia with id " + id + " no longer exists.", enfe);
            }
            OrdemServico ordemServicoId = ocorrencia.getOrdemServicoId();
            if (ordemServicoId != null) {
                ordemServicoId.getOcorrenciaList().remove(ocorrencia);
                ordemServicoId = em.merge(ordemServicoId);
            }
            TipoOcorrencia tipoOcorrenciaId = ocorrencia.getTipoOcorrenciaId();
            if (tipoOcorrenciaId != null) {
                tipoOcorrenciaId.getOcorrenciaList().remove(ocorrencia);
                tipoOcorrenciaId = em.merge(tipoOcorrenciaId);
            }
            em.remove(ocorrencia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ocorrencia> findOcorrenciaEntities() {
        return findOcorrenciaEntities(true, -1, -1);
    }

    public List<Ocorrencia> findOcorrenciaEntities(int maxResults, int firstResult) {
        return findOcorrenciaEntities(false, maxResults, firstResult);
    }

    private List<Ocorrencia> findOcorrenciaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ocorrencia.class));
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

    public Ocorrencia findOcorrencia(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ocorrencia.class, id);
        } finally {
            em.close();
        }
    }

    public int getOcorrenciaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ocorrencia> rt = cq.from(Ocorrencia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
