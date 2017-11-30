/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.controle;

import br.edu.uerr.controlefrotas.controle.exceptions.NonexistentEntityException;
import br.edu.uerr.controlefrotas.modelo.Empresa;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import br.edu.uerr.controlefrotas.modelo.Reparo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class EmpresaJpaController implements Serializable {

    public EmpresaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Empresa empresa) {       
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(empresa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Empresa empresa) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empresa persistentEmpresa = em.find(Empresa.class, empresa.getId());
            List<Reparo> reparoListOld = persistentEmpresa.getReparoList();
            List<Reparo> reparoListNew = empresa.getReparoList();
            List<Reparo> attachedReparoListNew = new ArrayList<Reparo>();
            for (Reparo reparoListNewReparoToAttach : reparoListNew) {
                reparoListNewReparoToAttach = em.getReference(reparoListNewReparoToAttach.getClass(), reparoListNewReparoToAttach.getId());
                attachedReparoListNew.add(reparoListNewReparoToAttach);
            }
            reparoListNew = attachedReparoListNew;
            empresa.setReparoList(reparoListNew);
            empresa = em.merge(empresa);
            for (Reparo reparoListOldReparo : reparoListOld) {
                if (!reparoListNew.contains(reparoListOldReparo)) {
                    reparoListOldReparo.setEmpresaId(null);
                    reparoListOldReparo = em.merge(reparoListOldReparo);
                }
            }
            for (Reparo reparoListNewReparo : reparoListNew) {
                if (!reparoListOld.contains(reparoListNewReparo)) {
                    Empresa oldEmpresaIdOfReparoListNewReparo = reparoListNewReparo.getEmpresaId();
                    reparoListNewReparo.setEmpresaId(empresa);
                    reparoListNewReparo = em.merge(reparoListNewReparo);
                    if (oldEmpresaIdOfReparoListNewReparo != null && !oldEmpresaIdOfReparoListNewReparo.equals(empresa)) {
                        oldEmpresaIdOfReparoListNewReparo.getReparoList().remove(reparoListNewReparo);
                        oldEmpresaIdOfReparoListNewReparo = em.merge(oldEmpresaIdOfReparoListNewReparo);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = empresa.getId();
                if (findEmpresa(id) == null) {
                    throw new NonexistentEntityException("The empresa with id " + id + " no longer exists.");
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
            Empresa empresa;
            try {
                empresa = em.getReference(Empresa.class, id);
                empresa.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The empresa with id " + id + " no longer exists.", enfe);
            }
            List<Reparo> reparoList = empresa.getReparoList();
            for (Reparo reparoListReparo : reparoList) {
                reparoListReparo.setEmpresaId(null);
                reparoListReparo = em.merge(reparoListReparo);
            }
            em.remove(empresa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Empresa> findEmpresaEntities() {
        return findEmpresaEntities(true, -1, -1);
    }

    public List<Empresa> findEmpresaEntities(int maxResults, int firstResult) {
        return findEmpresaEntities(false, maxResults, firstResult);
    }

    private List<Empresa> findEmpresaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Empresa.class));
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

    public Empresa findEmpresa(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Empresa.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmpresaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Empresa> rt = cq.from(Empresa.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
