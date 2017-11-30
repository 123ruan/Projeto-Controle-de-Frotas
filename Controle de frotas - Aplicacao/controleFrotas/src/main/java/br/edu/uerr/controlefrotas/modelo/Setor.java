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
@Table(name = "setor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Setor.findAll", query = "SELECT s FROM Setor s")
    , @NamedQuery(name = "Setor.findById", query = "SELECT s FROM Setor s WHERE s.id = :id")
    , @NamedQuery(name = "Setor.findByNome", query = "SELECT s FROM Setor s WHERE s.nome = :nome")
    , @NamedQuery(name = "Setor.findBySigla", query = "SELECT s FROM Setor s WHERE s.sigla = :sigla")
    , @NamedQuery(name = "Setor.findByRamal", query = "SELECT s FROM Setor s WHERE s.ramal = :ramal")
    , @NamedQuery(name = "Setor.findByEmail", query = "SELECT s FROM Setor s WHERE s.email = :email")
    , @NamedQuery(name = "Setor.findByDataInfo", query = "SELECT s FROM Setor s WHERE s.dataInfo = :dataInfo")})
public class Setor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "sigla")
    private String sigla;
    @Column(name = "ramal")
    private String ramal;
    @Column(name = "email")
    private String email;
    @Column(name = "data_info")
    @Temporal(TemporalType.DATE)
    private Date dataInfo;
    @JoinColumn(name = "instituicao_id", referencedColumnName = "id")
    @ManyToOne
    private Instituicao instituicaoId;
    @OneToMany(mappedBy = "setorId")
    private List<Funcionario> funcionarioList;

    public Setor() {
    }

    public Setor(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataInfo() {
        return dataInfo;
    }

    public void setDataInfo(Date dataInfo) {
        this.dataInfo = dataInfo;
    }

    public Instituicao getInstituicaoId() {
        return instituicaoId;
    }

    public void setInstituicaoId(Instituicao instituicaoId) {
        this.instituicaoId = instituicaoId;
    }

    @XmlTransient
    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    public void setFuncionarioList(List<Funcionario> funcionarioList) {
        this.funcionarioList = funcionarioList;
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
        if (!(object instanceof Setor)) {
            return false;
        }
        Setor other = (Setor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.controlefrotas.controle.Setor[ id=" + id + " ]";
    }
    
}
