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
import br.edu.uerr.controlefrotas.modelo.Solicitacoes;
import br.edu.uerr.controlefrotas.modelo.Veiculo;
import br.edu.uerr.controlefrotas.modelo.Ocorrencia;
import br.edu.uerr.controlefrotas.modelo.OrdemServico;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ruan PC
 */
public class OrdemServicoJpaController implements Serializable {

    public OrdemServicoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(OrdemServico ordemServico) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();        
            em.persist(ordemServico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(OrdemServico ordemServico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            OrdemServico persistentOrdemServico = em.find(OrdemServico.class, ordemServico.getId());
            Funcionario funcionarioIdOld = persistentOrdemServico.getFuncionarioId();
            Funcionario funcionarioIdNew = ordemServico.getFuncionarioId();
            Solicitacoes solicitacoesIdOld = persistentOrdemServico.getSolicitacoesId();
            Solicitacoes solicitacoesIdNew = ordemServico.getSolicitacoesId();
            Veiculo veiculoIdOld = persistentOrdemServico.getVeiculoId();
            Veiculo veiculoIdNew = ordemServico.getVeiculoId();
            List<Ocorrencia> ocorrenciaListOld = persistentOrdemServico.getOcorrenciaList();
            List<Ocorrencia> ocorrenciaListNew = ordemServico.getOcorrenciaList();
            if (funcionarioIdNew != null) {
                funcionarioIdNew = em.getReference(funcionarioIdNew.getClass(), funcionarioIdNew.getId());
                ordemServico.setFuncionarioId(funcionarioIdNew);
            }
            if (solicitacoesIdNew != null) {
                solicitacoesIdNew = em.getReference(solicitacoesIdNew.getClass(), solicitacoesIdNew.getId());
                ordemServico.setSolicitacoesId(solicitacoesIdNew);
            }
            if (veiculoIdNew != null) {
                veiculoIdNew = em.getReference(veiculoIdNew.getClass(), veiculoIdNew.getId());
                ordemServico.setVeiculoId(veiculoIdNew);
            }
            List<Ocorrencia> attachedOcorrenciaListNew = new ArrayList<Ocorrencia>();
            for (Ocorrencia ocorrenciaListNewOcorrenciaToAttach : ocorrenciaListNew) {
                ocorrenciaListNewOcorrenciaToAttach = em.getReference(ocorrenciaListNewOcorrenciaToAttach.getClass(), ocorrenciaListNewOcorrenciaToAttach.getId());
                attachedOcorrenciaListNew.add(ocorrenciaListNewOcorrenciaToAttach);
            }
            ocorrenciaListNew = attachedOcorrenciaListNew;
            ordemServico.setOcorrenciaList(ocorrenciaListNew);
            ordemServico = em.merge(ordemServico);
            if (funcionarioIdOld != null && !funcionarioIdOld.equals(funcionarioIdNew)) {
                funcionarioIdOld.getOrdemServicoList().remove(ordemServico);
                funcionarioIdOld = em.merge(funcionarioIdOld);
            }
            if (funcionarioIdNew != null && !funcionarioIdNew.equals(funcionarioIdOld)) {
                funcionarioIdNew.getOrdemServicoList().add(ordemServico);
                funcionarioIdNew = em.merge(funcionarioIdNew);
            }
            if (solicitacoesIdOld != null && !solicitacoesIdOld.equals(solicitacoesIdNew)) {
                solicitacoesIdOld.getOrdemServicoList().remove(ordemServico);
                solicitacoesIdOld = em.merge(solicitacoesIdOld);
            }
            if (solicitacoesIdNew != null && !solicitacoesIdNew.equals(solicitacoesIdOld)) {
                solicitacoesIdNew.getOrdemServicoList().add(ordemServico);
                solicitacoesIdNew = em.merge(solicitacoesIdNew);
            }
            if (veiculoIdOld != null && !veiculoIdOld.equals(veiculoIdNew)) {
                veiculoIdOld.getOrdemServicoList().remove(ordemServico);
                veiculoIdOld = em.merge(veiculoIdOld);
            }
            if (veiculoIdNew != null && !veiculoIdNew.equals(veiculoIdOld)) {
                veiculoIdNew.getOrdemServicoList().add(ordemServico);
                veiculoIdNew = em.merge(veiculoIdNew);
            }
            for (Ocorrencia ocorrenciaListOldOcorrencia : ocorrenciaListOld) {
                if (!ocorrenciaListNew.contains(ocorrenciaListOldOcorrencia)) {
                    ocorrenciaListOldOcorrencia.setOrdemServicoId(null);
                    ocorrenciaListOldOcorrencia = em.merge(ocorrenciaListOldOcorrencia);
                }
            }
            for (Ocorrencia ocorrenciaListNewOcorrencia : ocorrenciaListNew) {
                if (!ocorrenciaListOld.contains(ocorrenciaListNewOcorrencia)) {
                    OrdemServico oldOrdemServicoIdOfOcorrenciaListNewOcorrencia = ocorrenciaListNewOcorrencia.getOrdemServicoId();
                    ocorrenciaListNewOcorrencia.setOrdemServicoId(ordemServico);
                    ocorrenciaListNewOcorrencia = em.merge(ocorrenciaListNewOcorrencia);
                    if (oldOrdemServicoIdOfOcorrenciaListNewOcorrencia != null && !oldOrdemServicoIdOfOcorrenciaListNewOcorrencia.equals(ordemServico)) {
                        oldOrdemServicoIdOfOcorrenciaListNewOcorrencia.getOcorrenciaList().remove(ocorrenciaListNewOcorrencia);
                        oldOrdemServicoIdOfOcorrenciaListNewOcorrencia = em.merge(oldOrdemServicoIdOfOcorrenciaListNewOcorrencia);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = ordemServico.getId();
                if (findOrdemServico(id) == null) {
                    throw new NonexistentEntityException("The ordemServico with id " + id + " no longer exists.");
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
            OrdemServico ordemServico;
            try {
                ordemServico = em.getReference(OrdemServico.class, id);
                ordemServico.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ordemServico with id " + id + " no longer exists.", enfe);
            }
            Funcionario funcionarioId = ordemServico.getFuncionarioId();
            if (funcionarioId != null) {
                funcionarioId.getOrdemServicoList().remove(ordemServico);
                funcionarioId = em.merge(funcionarioId);
            }
            Solicitacoes solicitacoesId = ordemServico.getSolicitacoesId();
            if (solicitacoesId != null) {
                solicitacoesId.getOrdemServicoList().remove(ordemServico);
                solicitacoesId = em.merge(solicitacoesId);
            }
            Veiculo veiculoId = ordemServico.getVeiculoId();
            if (veiculoId != null) {
                veiculoId.getOrdemServicoList().remove(ordemServico);
                veiculoId = em.merge(veiculoId);
            }
            List<Ocorrencia> ocorrenciaList = ordemServico.getOcorrenciaList();
            for (Ocorrencia ocorrenciaListOcorrencia : ocorrenciaList) {
                ocorrenciaListOcorrencia.setOrdemServicoId(null);
                ocorrenciaListOcorrencia = em.merge(ocorrenciaListOcorrencia);
            }
            em.remove(ordemServico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<OrdemServico> findOrdemServicoEntities() {
        return findOrdemServicoEntities(true, -1, -1);
    }

    public List<OrdemServico> findOrdemServicoEntities(int maxResults, int firstResult) {
        return findOrdemServicoEntities(false, maxResults, firstResult);
    }

    private List<OrdemServico> findOrdemServicoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(OrdemServico.class));
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

    public OrdemServico findOrdemServico(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(OrdemServico.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrdemServicoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<OrdemServico> rt = cq.from(OrdemServico.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
