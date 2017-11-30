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
import br.edu.uerr.controlefrotas.modelo.Pessoa;
import br.edu.uerr.controlefrotas.modelo.OrdemServico;
import br.edu.uerr.controlefrotas.modelo.Solicitacoes;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class SolicitacoesJpaController implements Serializable {

    public SolicitacoesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Solicitacoes solicitacoes) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(solicitacoes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Solicitacoes solicitacoes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Solicitacoes persistentSolicitacoes = em.find(Solicitacoes.class, solicitacoes.getId());
            Pessoa pessoaIdOld = persistentSolicitacoes.getPessoaId();
            Pessoa pessoaIdNew = solicitacoes.getPessoaId();
            List<OrdemServico> ordemServicoListOld = persistentSolicitacoes.getOrdemServicoList();
            List<OrdemServico> ordemServicoListNew = solicitacoes.getOrdemServicoList();
            if (pessoaIdNew != null) {
                pessoaIdNew = em.getReference(pessoaIdNew.getClass(), pessoaIdNew.getId());
                solicitacoes.setPessoaId(pessoaIdNew);
            }
            List<OrdemServico> attachedOrdemServicoListNew = new ArrayList<OrdemServico>();
            for (OrdemServico ordemServicoListNewOrdemServicoToAttach : ordemServicoListNew) {
                ordemServicoListNewOrdemServicoToAttach = em.getReference(ordemServicoListNewOrdemServicoToAttach.getClass(), ordemServicoListNewOrdemServicoToAttach.getId());
                attachedOrdemServicoListNew.add(ordemServicoListNewOrdemServicoToAttach);
            }
            ordemServicoListNew = attachedOrdemServicoListNew;
            solicitacoes.setOrdemServicoList(ordemServicoListNew);
            solicitacoes = em.merge(solicitacoes);
            if (pessoaIdOld != null && !pessoaIdOld.equals(pessoaIdNew)) {
                pessoaIdOld.getSolicitacoesList().remove(solicitacoes);
                pessoaIdOld = em.merge(pessoaIdOld);
            }
            if (pessoaIdNew != null && !pessoaIdNew.equals(pessoaIdOld)) {
                pessoaIdNew.getSolicitacoesList().add(solicitacoes);
                pessoaIdNew = em.merge(pessoaIdNew);
            }
            for (OrdemServico ordemServicoListOldOrdemServico : ordemServicoListOld) {
                if (!ordemServicoListNew.contains(ordemServicoListOldOrdemServico)) {
                    ordemServicoListOldOrdemServico.setSolicitacoesId(null);
                    ordemServicoListOldOrdemServico = em.merge(ordemServicoListOldOrdemServico);
                }
            }
            for (OrdemServico ordemServicoListNewOrdemServico : ordemServicoListNew) {
                if (!ordemServicoListOld.contains(ordemServicoListNewOrdemServico)) {
                    Solicitacoes oldSolicitacoesIdOfOrdemServicoListNewOrdemServico = ordemServicoListNewOrdemServico.getSolicitacoesId();
                    ordemServicoListNewOrdemServico.setSolicitacoesId(solicitacoes);
                    ordemServicoListNewOrdemServico = em.merge(ordemServicoListNewOrdemServico);
                    if (oldSolicitacoesIdOfOrdemServicoListNewOrdemServico != null && !oldSolicitacoesIdOfOrdemServicoListNewOrdemServico.equals(solicitacoes)) {
                        oldSolicitacoesIdOfOrdemServicoListNewOrdemServico.getOrdemServicoList().remove(ordemServicoListNewOrdemServico);
                        oldSolicitacoesIdOfOrdemServicoListNewOrdemServico = em.merge(oldSolicitacoesIdOfOrdemServicoListNewOrdemServico);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = solicitacoes.getId();
                if (findSolicitacoes(id) == null) {
                    throw new NonexistentEntityException("The solicitacoes with id " + id + " no longer exists.");
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
            Solicitacoes solicitacoes;
            try {
                solicitacoes = em.getReference(Solicitacoes.class, id);
                solicitacoes.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The solicitacoes with id " + id + " no longer exists.", enfe);
            }
            Pessoa pessoaId = solicitacoes.getPessoaId();
            if (pessoaId != null) {
                pessoaId.getSolicitacoesList().remove(solicitacoes);
                pessoaId = em.merge(pessoaId);
            }
            List<OrdemServico> ordemServicoList = solicitacoes.getOrdemServicoList();
            for (OrdemServico ordemServicoListOrdemServico : ordemServicoList) {
                ordemServicoListOrdemServico.setSolicitacoesId(null);
                ordemServicoListOrdemServico = em.merge(ordemServicoListOrdemServico);
            }
            em.remove(solicitacoes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Solicitacoes> findSolicitacoesEntities() {
        return findSolicitacoesEntities(true, -1, -1);
    }

    public List<Solicitacoes> findSolicitacoesEntities(int maxResults, int firstResult) {
        return findSolicitacoesEntities(false, maxResults, firstResult);
    }

    private List<Solicitacoes> findSolicitacoesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Solicitacoes.class));
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

    public Solicitacoes findSolicitacoes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Solicitacoes.class, id);
        } finally {
            em.close();
        }
    }

    public int getSolicitacoesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Solicitacoes> rt = cq.from(Solicitacoes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
