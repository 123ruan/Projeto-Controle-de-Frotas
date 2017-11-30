/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.controle;

import br.edu.uerr.controlefrotas.controle.exceptions.NonexistentEntityException;
import br.edu.uerr.controlefrotas.modelo.Pessoa;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import br.edu.uerr.controlefrotas.modelo.Solicitacoes;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class PessoaJpaController implements Serializable {

    public PessoaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pessoa pessoa) {
       EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(pessoa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pessoa pessoa) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pessoa persistentPessoa = em.find(Pessoa.class, pessoa.getId());
            List<Solicitacoes> solicitacoesListOld = persistentPessoa.getSolicitacoesList();
            List<Solicitacoes> solicitacoesListNew = pessoa.getSolicitacoesList();
            List<Solicitacoes> attachedSolicitacoesListNew = new ArrayList<Solicitacoes>();
            for (Solicitacoes solicitacoesListNewSolicitacoesToAttach : solicitacoesListNew) {
                solicitacoesListNewSolicitacoesToAttach = em.getReference(solicitacoesListNewSolicitacoesToAttach.getClass(), solicitacoesListNewSolicitacoesToAttach.getId());
                attachedSolicitacoesListNew.add(solicitacoesListNewSolicitacoesToAttach);
            }
            solicitacoesListNew = attachedSolicitacoesListNew;
            pessoa.setSolicitacoesList(solicitacoesListNew);
            pessoa = em.merge(pessoa);
            for (Solicitacoes solicitacoesListOldSolicitacoes : solicitacoesListOld) {
                if (!solicitacoesListNew.contains(solicitacoesListOldSolicitacoes)) {
                    solicitacoesListOldSolicitacoes.setPessoaId(null);
                    solicitacoesListOldSolicitacoes = em.merge(solicitacoesListOldSolicitacoes);
                }
            }
            for (Solicitacoes solicitacoesListNewSolicitacoes : solicitacoesListNew) {
                if (!solicitacoesListOld.contains(solicitacoesListNewSolicitacoes)) {
                    Pessoa oldPessoaIdOfSolicitacoesListNewSolicitacoes = solicitacoesListNewSolicitacoes.getPessoaId();
                    solicitacoesListNewSolicitacoes.setPessoaId(pessoa);
                    solicitacoesListNewSolicitacoes = em.merge(solicitacoesListNewSolicitacoes);
                    if (oldPessoaIdOfSolicitacoesListNewSolicitacoes != null && !oldPessoaIdOfSolicitacoesListNewSolicitacoes.equals(pessoa)) {
                        oldPessoaIdOfSolicitacoesListNewSolicitacoes.getSolicitacoesList().remove(solicitacoesListNewSolicitacoes);
                        oldPessoaIdOfSolicitacoesListNewSolicitacoes = em.merge(oldPessoaIdOfSolicitacoesListNewSolicitacoes);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pessoa.getId();
                if (findPessoa(id) == null) {
                    throw new NonexistentEntityException("The pessoa with id " + id + " no longer exists.");
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
            Pessoa pessoa;
            try {
                pessoa = em.getReference(Pessoa.class, id);
                pessoa.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pessoa with id " + id + " no longer exists.", enfe);
            }
            List<Solicitacoes> solicitacoesList = pessoa.getSolicitacoesList();
            for (Solicitacoes solicitacoesListSolicitacoes : solicitacoesList) {
                solicitacoesListSolicitacoes.setPessoaId(null);
                solicitacoesListSolicitacoes = em.merge(solicitacoesListSolicitacoes);
            }
            em.remove(pessoa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pessoa> findPessoaEntities() {
        return findPessoaEntities(true, -1, -1);
    }

    public List<Pessoa> findPessoaEntities(int maxResults, int firstResult) {
        return findPessoaEntities(false, maxResults, firstResult);
    }

    private List<Pessoa> findPessoaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pessoa.class));
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

    public Pessoa findPessoa(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pessoa.class, id);
        } finally {
            em.close();
        }
    }

    public int getPessoaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pessoa> rt = cq.from(Pessoa.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
