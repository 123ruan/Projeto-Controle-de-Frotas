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
import br.edu.uerr.controlefrotas.modelo.Reparo;
import java.util.ArrayList;
import java.util.List;
import br.edu.uerr.controlefrotas.modelo.OrdemServico;
import br.edu.uerr.controlefrotas.modelo.Veiculo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class VeiculoJpaController implements Serializable {

    public VeiculoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Veiculo veiculo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(veiculo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    public void edit(Veiculo veiculo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Veiculo persistentVeiculo = em.find(Veiculo.class, veiculo.getId());
            List<Reparo> reparoListOld = persistentVeiculo.getReparoList();
            List<Reparo> reparoListNew = veiculo.getReparoList();
            List<OrdemServico> ordemServicoListOld = persistentVeiculo.getOrdemServicoList();
            List<OrdemServico> ordemServicoListNew = veiculo.getOrdemServicoList();
            List<Reparo> attachedReparoListNew = new ArrayList<Reparo>();
            for (Reparo reparoListNewReparoToAttach : reparoListNew) {
                reparoListNewReparoToAttach = em.getReference(reparoListNewReparoToAttach.getClass(), reparoListNewReparoToAttach.getId());
                attachedReparoListNew.add(reparoListNewReparoToAttach);
            }
            reparoListNew = attachedReparoListNew;
            veiculo.setReparoList(reparoListNew);
            List<OrdemServico> attachedOrdemServicoListNew = new ArrayList<OrdemServico>();
            for (OrdemServico ordemServicoListNewOrdemServicoToAttach : ordemServicoListNew) {
                ordemServicoListNewOrdemServicoToAttach = em.getReference(ordemServicoListNewOrdemServicoToAttach.getClass(), ordemServicoListNewOrdemServicoToAttach.getId());
                attachedOrdemServicoListNew.add(ordemServicoListNewOrdemServicoToAttach);
            }
            ordemServicoListNew = attachedOrdemServicoListNew;
            veiculo.setOrdemServicoList(ordemServicoListNew);
            veiculo = em.merge(veiculo);
            for (Reparo reparoListOldReparo : reparoListOld) {
                if (!reparoListNew.contains(reparoListOldReparo)) {
                    reparoListOldReparo.setVeiculoId(null);
                    reparoListOldReparo = em.merge(reparoListOldReparo);
                }
            }
            for (Reparo reparoListNewReparo : reparoListNew) {
                if (!reparoListOld.contains(reparoListNewReparo)) {
                    Veiculo oldVeiculoIdOfReparoListNewReparo = reparoListNewReparo.getVeiculoId();
                    reparoListNewReparo.setVeiculoId(veiculo);
                    reparoListNewReparo = em.merge(reparoListNewReparo);
                    if (oldVeiculoIdOfReparoListNewReparo != null && !oldVeiculoIdOfReparoListNewReparo.equals(veiculo)) {
                        oldVeiculoIdOfReparoListNewReparo.getReparoList().remove(reparoListNewReparo);
                        oldVeiculoIdOfReparoListNewReparo = em.merge(oldVeiculoIdOfReparoListNewReparo);
                    }
                }
            }
            for (OrdemServico ordemServicoListOldOrdemServico : ordemServicoListOld) {
                if (!ordemServicoListNew.contains(ordemServicoListOldOrdemServico)) {
                    ordemServicoListOldOrdemServico.setVeiculoId(null);
                    ordemServicoListOldOrdemServico = em.merge(ordemServicoListOldOrdemServico);
                }
            }
            for (OrdemServico ordemServicoListNewOrdemServico : ordemServicoListNew) {
                if (!ordemServicoListOld.contains(ordemServicoListNewOrdemServico)) {
                    Veiculo oldVeiculoIdOfOrdemServicoListNewOrdemServico = ordemServicoListNewOrdemServico.getVeiculoId();
                    ordemServicoListNewOrdemServico.setVeiculoId(veiculo);
                    ordemServicoListNewOrdemServico = em.merge(ordemServicoListNewOrdemServico);
                    if (oldVeiculoIdOfOrdemServicoListNewOrdemServico != null && !oldVeiculoIdOfOrdemServicoListNewOrdemServico.equals(veiculo)) {
                        oldVeiculoIdOfOrdemServicoListNewOrdemServico.getOrdemServicoList().remove(ordemServicoListNewOrdemServico);
                        oldVeiculoIdOfOrdemServicoListNewOrdemServico = em.merge(oldVeiculoIdOfOrdemServicoListNewOrdemServico);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = veiculo.getId();
                if (findVeiculo(id) == null) {
                    throw new NonexistentEntityException("The veiculo with id " + id + " no longer exists.");
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
            Veiculo veiculo;
            try {
                veiculo = em.getReference(Veiculo.class, id);
                veiculo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The veiculo with id " + id + " no longer exists.", enfe);
            }
            List<Reparo> reparoList = veiculo.getReparoList();
            for (Reparo reparoListReparo : reparoList) {
                reparoListReparo.setVeiculoId(null);
                reparoListReparo = em.merge(reparoListReparo);
            }
            List<OrdemServico> ordemServicoList = veiculo.getOrdemServicoList();
            for (OrdemServico ordemServicoListOrdemServico : ordemServicoList) {
                ordemServicoListOrdemServico.setVeiculoId(null);
                ordemServicoListOrdemServico = em.merge(ordemServicoListOrdemServico);
            }
            em.remove(veiculo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Veiculo> findVeiculoEntities() {
        return findVeiculoEntities(true, -1, -1);
    }

    public List<Veiculo> findVeiculoEntities(int maxResults, int firstResult) {
        return findVeiculoEntities(false, maxResults, firstResult);
    }

    private List<Veiculo> findVeiculoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Veiculo.class));
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

    public Veiculo findVeiculo(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Veiculo.class, id);
        } finally {
            em.close();
        }
    }

    public int getVeiculoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Veiculo> rt = cq.from(Veiculo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
