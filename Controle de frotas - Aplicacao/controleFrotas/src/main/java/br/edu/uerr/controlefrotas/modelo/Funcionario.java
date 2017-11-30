/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ruan PC
 */
@Entity
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f")
    , @NamedQuery(name = "Funcionario.findById", query = "SELECT f FROM Funcionario f WHERE f.id = :id")
    , @NamedQuery(name = "Funcionario.findByPessoaId", query = "SELECT f FROM Funcionario f WHERE f.pessoaId = :pessoaId")
    , @NamedQuery(name = "Funcionario.findByMatricula", query = "SELECT f FROM Funcionario f WHERE f.matricula = :matricula")
    , @NamedQuery(name = "Funcionario.findByConta", query = "SELECT f FROM Funcionario f WHERE f.conta = :conta")
    , @NamedQuery(name = "Funcionario.findBySenha", query = "SELECT f FROM Funcionario f WHERE f.senha = :senha")
    , @NamedQuery(name = "Funcionario.findByDataIn", query = "SELECT f FROM Funcionario f WHERE f.dataIn = :dataIn")
    , @NamedQuery(name = "Funcionario.findByDataInfo", query = "SELECT f FROM Funcionario f WHERE f.dataInfo = :dataInfo")
    , @NamedQuery(name = "Funcionario.findByHistorico", query = "SELECT f FROM Funcionario f WHERE f.historico = :historico")
    , @NamedQuery(name = "Funcionario.findByStatus", query = "SELECT f FROM Funcionario f WHERE f.status = :status")})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "pessoa_id")
    private Integer pessoaId;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "conta")
    private String conta;
    @Column(name = "senha")
    private String senha;
    @Column(name = "data_in")
    @Temporal(TemporalType.DATE)
    private Date dataIn;
    @Column(name = "data_info")
    @Temporal(TemporalType.DATE)
    private Date dataInfo;
    @Column(name = "historico")
    private String historico;
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "funcionarioId")
    private List<OrdemServico> ordemServicoList;
    @JoinColumn(name = "setor_id", referencedColumnName = "id")
    @ManyToOne
    private Setor setorId;
    @JoinColumn(name = "tipo_funcionario_id", referencedColumnName = "id")
    @ManyToOne
    private TipoFuncionario tipoFuncionarioId;

    public Funcionario() {
    }

    public Funcionario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Integer pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataIn() {
        return dataIn;
    }

    public void setDataIn(Date dataIn) {
        this.dataIn = dataIn;
    }

    public Date getDataInfo() {
        return dataInfo;
    }

    public void setDataInfo(Date dataInfo) {
        this.dataInfo = dataInfo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    public Setor getSetorId() {
        return setorId;
    }

    public void setSetorId(Setor setorId) {
        this.setorId = setorId;
    }

    public TipoFuncionario getTipoFuncionarioId() {
        return tipoFuncionarioId;
    }

    public void setTipoFuncionarioId(TipoFuncionario tipoFuncionarioId) {
        this.tipoFuncionarioId = tipoFuncionarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.controlefrotas.controle.Funcionario[ id=" + id + " ]";
    }
    
}
