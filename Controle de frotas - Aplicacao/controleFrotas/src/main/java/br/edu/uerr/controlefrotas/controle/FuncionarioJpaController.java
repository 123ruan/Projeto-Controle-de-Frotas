/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.controle;

import br.edu.uerr.controlefrotas.controle.exceptions.NonexistentEntityException;
import br.edu.uerr.controlefrotas.modelo.Funcionario;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import br.edu.uerr.controlefrotas.modelo.Setor;
import br.edu.uerr.controlefrotas.modelo.TipoFuncionario;
import br.edu.uerr.controlefrotas.modelo.OrdemServico;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class FuncionarioJpaController implements Serializable {

    public FuncionarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Funcionario funcionario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(funcionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Funcionario funcionario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Funcionario persistentFuncionario = em.find(Funcionario.class, funcionario.getId());
            Setor setorIdOld = persistentFuncionario.getSetorId();
            Setor setorIdNew = funcionario.getSetorId();
            TipoFuncionario tipoFuncionarioIdOld = persistentFuncionario.getTipoFuncionarioId();
            TipoFuncionario tipoFuncionarioIdNew = funcionario.getTipoFuncionarioId();
            List<OrdemServico> ordemServicoListOld = persistentFuncionario.getOrdemServicoList();
            List<OrdemServico> ordemServicoListNew = funcionario.getOrdemServicoList();
            if (setorIdNew != null) {
                setorIdNew = em.getReference(setorIdNew.getClass(), setorIdNew.getId());
                funcionario.setSetorId(setorIdNew);
            }
            if (tipoFuncionarioIdNew != null) {
                tipoFuncionarioIdNew = em.getReference(tipoFuncionarioIdNew.getClass(), tipoFuncionarioIdNew.getId());
                funcionario.setTipoFuncionarioId(tipoFuncionarioIdNew);
            }
            List<OrdemServico> attachedOrdemServicoListNew = new ArrayList<OrdemServico>();
            for (OrdemServico ordemServicoListNewOrdemServicoToAttach : ordemServicoListNew) {
                ordemServicoListNewOrdemServicoToAttach = em.getReference(ordemServicoListNewOrdemServicoToAttach.getClass(), ordemServicoListNewOrdemServicoToAttach.getId());
                attachedOrdemServicoListNew.add(ordemServicoListNewOrdemServicoToAttach);
            }
            ordemServicoListNew = attachedOrdemServicoListNew;
            funcionario.setOrdemServicoList(ordemServicoListNew);
            funcionario = em.merge(funcionario);
            if (setorIdOld != null && !setorIdOld.equals(setorIdNew)) {
                setorIdOld.getFuncionarioList().remove(funcionario);
                setorIdOld = em.merge(setorIdOld);
            }
            if (setorIdNew != null && !setorIdNew.equals(setorIdOld)) {
                setorIdNew.getFuncionarioList().add(funcionario);
                setorIdNew = em.merge(setorIdNew);
            }
            if (tipoFuncionarioIdOld != null && !tipoFuncionarioIdOld.equals(tipoFuncionarioIdNew)) {
                tipoFuncionarioIdOld.getFuncionarioList().remove(funcionario);
                tipoFuncionarioIdOld = em.merge(tipoFuncionarioIdOld);
            }
            if (tipoFuncionarioIdNew != null && !tipoFuncionarioIdNew.equals(tipoFuncionarioIdOld)) {
                tipoFuncionarioIdNew.getFuncionarioList().add(funcionario);
                tipoFuncionarioIdNew = em.merge(tipoFuncionarioIdNew);
            }
            for (OrdemServico ordemServicoListOldOrdemServico : ordemServicoListOld) {
                if (!ordemServicoListNew.contains(ordemServicoListOldOrdemServico)) {
                    ordemServicoListOldOrdemServico.setFuncionarioId(null);
                    ordemServicoListOldOrdemServico = em.merge(ordemServicoListOldOrdemServico);
                }
            }
            for (OrdemServico ordemServicoListNewOrdemServico : ordemServicoListNew) {
                if (!ordemServicoListOld.contains(ordemServicoListNewOrdemServico)) {
                    Funcionario oldFuncionarioIdOfOrdemServicoListNewOrdemServico = ordemServicoListNewOrdemServico.getFuncionarioId();
                    ordemServicoListNewOrdemServico.setFuncionarioId(funcionario);
                    ordemServicoListNewOrdemServico = em.merge(ordemServicoListNewOrdemServico);
                    if (oldFuncionarioIdOfOrdemServicoListNewOrdemServico != null && !oldFuncionarioIdOfOrdemServicoListNewOrdemServico.equals(funcionario)) {
                        oldFuncionarioIdOfOrdemServicoListNewOrdemServico.getOrdemServicoList().remove(ordemServicoListNewOrdemServico);
                        oldFuncionarioIdOfOrdemServicoListNewOrdemServico = em.merge(oldFuncionarioIdOfOrdemServicoListNewOrdemServico);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = funcionario.getId();
                if (findFuncionario(id) == null) {
                    throw new NonexistentEntityException("The funcionario with id " + id + " no longer exists.");
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
            Funcionario funcionario;
            try {
                funcionario = em.getReference(Funcionario.class, id);
                funcionario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The funcionario with id " + id + " no longer exists.", enfe);
            }
            Setor setorId = funcionario.getSetorId();
            if (setorId != null) {
                setorId.getFuncionarioList().remove(funcionario);
                setorId = em.merge(setorId);
            }
            TipoFuncionario tipoFuncionarioId = funcionario.getTipoFuncionarioId();
            if (tipoFuncionarioId != null) {
                tipoFuncionarioId.getFuncionarioList().remove(funcionario);
                tipoFuncionarioId = em.merge(tipoFuncionarioId);
            }
            List<OrdemServico> ordemServicoList = funcionario.getOrdemServicoList();
            for (OrdemServico ordemServicoListOrdemServico : ordemServicoList) {
                ordemServicoListOrdemServico.setFuncionarioId(null);
                ordemServicoListOrdemServico = em.merge(ordemServicoListOrdemServico);
            }
            em.remove(funcionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Funcionario> findFuncionarioEntities() {
        return findFuncionarioEntities(true, -1, -1);
    }

    public List<Funcionario> findFuncionarioEntities(int maxResults, int firstResult) {
        return findFuncionarioEntities(false, maxResults, firstResult);
    }

    private List<Funcionario> findFuncionarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Funcionario.class));
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

    public Funcionario findFuncionario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Funcionario.class, id);
        } finally {
            em.close();
        }
    }

    public int getFuncionarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Funcionario> rt = cq.from(Funcionario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
