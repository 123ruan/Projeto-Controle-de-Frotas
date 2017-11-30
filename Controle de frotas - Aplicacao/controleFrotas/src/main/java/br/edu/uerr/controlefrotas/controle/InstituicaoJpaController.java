/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.controle;

import br.edu.uerr.controlefrotas.controle.exceptions.NonexistentEntityException;
import br.edu.uerr.controlefrotas.modelo.Instituicao;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import br.edu.uerr.controlefrotas.modelo.Setor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class InstituicaoJpaController implements Serializable {

    public InstituicaoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Instituicao instituicao) {
       EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(instituicao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Instituicao instituicao) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Instituicao persistentInstituicao = em.find(Instituicao.class, instituicao.getId());
            List<Setor> setorListOld = persistentInstituicao.getSetorList();
            List<Setor> setorListNew = instituicao.getSetorList();
            List<Setor> attachedSetorListNew = new ArrayList<Setor>();
            for (Setor setorListNewSetorToAttach : setorListNew) {
                setorListNewSetorToAttach = em.getReference(setorListNewSetorToAttach.getClass(), setorListNewSetorToAttach.getId());
                attachedSetorListNew.add(setorListNewSetorToAttach);
            }
            setorListNew = attachedSetorListNew;
            instituicao.setSetorList(setorListNew);
            instituicao = em.merge(instituicao);
            for (Setor setorListOldSetor : setorListOld) {
                if (!setorListNew.contains(setorListOldSetor)) {
                    setorListOldSetor.setInstituicaoId(null);
                    setorListOldSetor = em.merge(setorListOldSetor);
                }
            }
            for (Setor setorListNewSetor : setorListNew) {
                if (!setorListOld.contains(setorListNewSetor)) {
                    Instituicao oldInstituicaoIdOfSetorListNewSetor = setorListNewSetor.getInstituicaoId();
                    setorListNewSetor.setInstituicaoId(instituicao);
                    setorListNewSetor = em.merge(setorListNewSetor);
                    if (oldInstituicaoIdOfSetorListNewSetor != null && !oldInstituicaoIdOfSetorListNewSetor.equals(instituicao)) {
                        oldInstituicaoIdOfSetorListNewSetor.getSetorList().remove(setorListNewSetor);
                        oldInstituicaoIdOfSetorListNewSetor = em.merge(oldInstituicaoIdOfSetorListNewSetor);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = instituicao.getId();
                if (findInstituicao(id) == null) {
                    throw new NonexistentEntityException("The instituicao with id " + id + " no longer exists.");
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
            Instituicao instituicao;
            try {
                instituicao = em.getReference(Instituicao.class, id);
                instituicao.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The instituicao with id " + id + " no longer exists.", enfe);
            }
            List<Setor> setorList = instituicao.getSetorList();
            for (Setor setorListSetor : setorList) {
                setorListSetor.setInstituicaoId(null);
                setorListSetor = em.merge(setorListSetor);
            }
            em.remove(instituicao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Instituicao> findInstituicaoEntities() {
        return findInstituicaoEntities(true, -1, -1);
    }

    public List<Instituicao> findInstituicaoEntities(int maxResults, int firstResult) {
        return findInstituicaoEntities(false, maxResults, firstResult);
    }

    private List<Instituicao> findInstituicaoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Instituicao.class));
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

    public Instituicao findInstituicao(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Instituicao.class, id);
        } finally {
            em.close();
        }
    }

    public int getInstituicaoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Instituicao> rt = cq.from(Instituicao.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
