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
import br.edu.uerr.controlefrotas.modelo.Funcionario;
import br.edu.uerr.controlefrotas.modelo.TipoFuncionario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class TipoFuncionarioJpaController implements Serializable {

    public TipoFuncionarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoFuncionario tipoFuncionario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(tipoFuncionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoFuncionario tipoFuncionario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoFuncionario persistentTipoFuncionario = em.find(TipoFuncionario.class, tipoFuncionario.getId());
            List<Funcionario> funcionarioListOld = persistentTipoFuncionario.getFuncionarioList();
            List<Funcionario> funcionarioListNew = tipoFuncionario.getFuncionarioList();
            List<Funcionario> attachedFuncionarioListNew = new ArrayList<Funcionario>();
            for (Funcionario funcionarioListNewFuncionarioToAttach : funcionarioListNew) {
                funcionarioListNewFuncionarioToAttach = em.getReference(funcionarioListNewFuncionarioToAttach.getClass(), funcionarioListNewFuncionarioToAttach.getId());
                attachedFuncionarioListNew.add(funcionarioListNewFuncionarioToAttach);
            }
            funcionarioListNew = attachedFuncionarioListNew;
            tipoFuncionario.setFuncionarioList(funcionarioListNew);
            tipoFuncionario = em.merge(tipoFuncionario);
            for (Funcionario funcionarioListOldFuncionario : funcionarioListOld) {
                if (!funcionarioListNew.contains(funcionarioListOldFuncionario)) {
                    funcionarioListOldFuncionario.setTipoFuncionarioId(null);
                    funcionarioListOldFuncionario = em.merge(funcionarioListOldFuncionario);
                }
            }
            for (Funcionario funcionarioListNewFuncionario : funcionarioListNew) {
                if (!funcionarioListOld.contains(funcionarioListNewFuncionario)) {
                    TipoFuncionario oldTipoFuncionarioIdOfFuncionarioListNewFuncionario = funcionarioListNewFuncionario.getTipoFuncionarioId();
                    funcionarioListNewFuncionario.setTipoFuncionarioId(tipoFuncionario);
                    funcionarioListNewFuncionario = em.merge(funcionarioListNewFuncionario);
                    if (oldTipoFuncionarioIdOfFuncionarioListNewFuncionario != null && !oldTipoFuncionarioIdOfFuncionarioListNewFuncionario.equals(tipoFuncionario)) {
                        oldTipoFuncionarioIdOfFuncionarioListNewFuncionario.getFuncionarioList().remove(funcionarioListNewFuncionario);
                        oldTipoFuncionarioIdOfFuncionarioListNewFuncionario = em.merge(oldTipoFuncionarioIdOfFuncionarioListNewFuncionario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tipoFuncionario.getId();
                if (findTipoFuncionario(id) == null) {
                    throw new NonexistentEntityException("The tipoFuncionario with id " + id + " no longer exists.");
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
            TipoFuncionario tipoFuncionario;
            try {
                tipoFuncionario = em.getReference(TipoFuncionario.class, id);
                tipoFuncionario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoFuncionario with id " + id + " no longer exists.", enfe);
            }
            List<Funcionario> funcionarioList = tipoFuncionario.getFuncionarioList();
            for (Funcionario funcionarioListFuncionario : funcionarioList) {
                funcionarioListFuncionario.setTipoFuncionarioId(null);
                funcionarioListFuncionario = em.merge(funcionarioListFuncionario);
            }
            em.remove(tipoFuncionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoFuncionario> findTipoFuncionarioEntities() {
        return findTipoFuncionarioEntities(true, -1, -1);
    }

    public List<TipoFuncionario> findTipoFuncionarioEntities(int maxResults, int firstResult) {
        return findTipoFuncionarioEntities(false, maxResults, firstResult);
    }

    private List<TipoFuncionario> findTipoFuncionarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoFuncionario.class));
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

    public TipoFuncionario findTipoFuncionario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoFuncionario.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoFuncionarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoFuncionario> rt = cq.from(TipoFuncionario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
