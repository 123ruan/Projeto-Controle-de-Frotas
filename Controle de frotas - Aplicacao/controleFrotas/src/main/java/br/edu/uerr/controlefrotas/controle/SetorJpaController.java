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
import br.edu.uerr.controlefrotas.modelo.Instituicao;
import br.edu.uerr.controlefrotas.modelo.Funcionario;
import br.edu.uerr.controlefrotas.modelo.Setor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class SetorJpaController implements Serializable {

    public SetorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Setor setor) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(setor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Setor setor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Setor persistentSetor = em.find(Setor.class, setor.getId());
            Instituicao instituicaoIdOld = persistentSetor.getInstituicaoId();
            Instituicao instituicaoIdNew = setor.getInstituicaoId();
            List<Funcionario> funcionarioListOld = persistentSetor.getFuncionarioList();
            List<Funcionario> funcionarioListNew = setor.getFuncionarioList();
            if (instituicaoIdNew != null) {
                instituicaoIdNew = em.getReference(instituicaoIdNew.getClass(), instituicaoIdNew.getId());
                setor.setInstituicaoId(instituicaoIdNew);
            }
            List<Funcionario> attachedFuncionarioListNew = new ArrayList<Funcionario>();
            for (Funcionario funcionarioListNewFuncionarioToAttach : funcionarioListNew) {
                funcionarioListNewFuncionarioToAttach = em.getReference(funcionarioListNewFuncionarioToAttach.getClass(), funcionarioListNewFuncionarioToAttach.getId());
                attachedFuncionarioListNew.add(funcionarioListNewFuncionarioToAttach);
            }
            funcionarioListNew = attachedFuncionarioListNew;
            setor.setFuncionarioList(funcionarioListNew);
            setor = em.merge(setor);
            if (instituicaoIdOld != null && !instituicaoIdOld.equals(instituicaoIdNew)) {
                instituicaoIdOld.getSetorList().remove(setor);
                instituicaoIdOld = em.merge(instituicaoIdOld);
            }
            if (instituicaoIdNew != null && !instituicaoIdNew.equals(instituicaoIdOld)) {
                instituicaoIdNew.getSetorList().add(setor);
                instituicaoIdNew = em.merge(instituicaoIdNew);
            }
            for (Funcionario funcionarioListOldFuncionario : funcionarioListOld) {
                if (!funcionarioListNew.contains(funcionarioListOldFuncionario)) {
                    funcionarioListOldFuncionario.setSetorId(null);
                    funcionarioListOldFuncionario = em.merge(funcionarioListOldFuncionario);
                }
            }
            for (Funcionario funcionarioListNewFuncionario : funcionarioListNew) {
                if (!funcionarioListOld.contains(funcionarioListNewFuncionario)) {
                    Setor oldSetorIdOfFuncionarioListNewFuncionario = funcionarioListNewFuncionario.getSetorId();
                    funcionarioListNewFuncionario.setSetorId(setor);
                    funcionarioListNewFuncionario = em.merge(funcionarioListNewFuncionario);
                    if (oldSetorIdOfFuncionarioListNewFuncionario != null && !oldSetorIdOfFuncionarioListNewFuncionario.equals(setor)) {
                        oldSetorIdOfFuncionarioListNewFuncionario.getFuncionarioList().remove(funcionarioListNewFuncionario);
                        oldSetorIdOfFuncionarioListNewFuncionario = em.merge(oldSetorIdOfFuncionarioListNewFuncionario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = setor.getId();
                if (findSetor(id) == null) {
                    throw new NonexistentEntityException("The setor with id " + id + " no longer exists.");
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
            Setor setor;
            try {
                setor = em.getReference(Setor.class, id);
                setor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The setor with id " + id + " no longer exists.", enfe);
            }
            Instituicao instituicaoId = setor.getInstituicaoId();
            if (instituicaoId != null) {
                instituicaoId.getSetorList().remove(setor);
                instituicaoId = em.merge(instituicaoId);
            }
            List<Funcionario> funcionarioList = setor.getFuncionarioList();
            for (Funcionario funcionarioListFuncionario : funcionarioList) {
                funcionarioListFuncionario.setSetorId(null);
                funcionarioListFuncionario = em.merge(funcionarioListFuncionario);
            }
            em.remove(setor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Setor> findSetorEntities() {
        return findSetorEntities(true, -1, -1);
    }

    public List<Setor> findSetorEntities(int maxResults, int firstResult) {
        return findSetorEntities(false, maxResults, firstResult);
    }

    private List<Setor> findSetorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Setor.class));
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

    public Setor findSetor(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Setor.class, id);
        } finally {
            em.close();
        }
    }

    public int getSetorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Setor> rt = cq.from(Setor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
