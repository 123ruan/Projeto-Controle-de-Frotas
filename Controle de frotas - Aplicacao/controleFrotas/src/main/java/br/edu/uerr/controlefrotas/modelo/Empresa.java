/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ruan PC
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
    , @NamedQuery(name = "Empresa.findById", query = "SELECT e FROM Empresa e WHERE e.id = :id")
    , @NamedQuery(name = "Empresa.findByRazaoSocial", query = "SELECT e FROM Empresa e WHERE e.razaoSocial = :razaoSocial")
    , @NamedQuery(name = "Empresa.findByContato", query = "SELECT e FROM Empresa e WHERE e.contato = :contato")
    , @NamedQuery(name = "Empresa.findByCnpj", query = "SELECT e FROM Empresa e WHERE e.cnpj = :cnpj")
    , @NamedQuery(name = "Empresa.findByCep", query = "SELECT e FROM Empresa e WHERE e.cep = :cep")
    , @NamedQuery(name = "Empresa.findByEndereco", query = "SELECT e FROM Empresa e WHERE e.endereco = :endereco")
    , @NamedQuery(name = "Empresa.findByBairro", query = "SELECT e FROM Empresa e WHERE e.bairro = :bairro")
    , @NamedQuery(name = "Empresa.findByCidade", query = "SELECT e FROM Empresa e WHERE e.cidade = :cidade")
    , @NamedQuery(name = "Empresa.findByNumero", query = "SELECT e FROM Empresa e WHERE e.numero = :numero")
    , @NamedQuery(name = "Empresa.findByUf", query = "SELECT e FROM Empresa e WHERE e.uf = :uf")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "razao_social")
    private String razaoSocial;
    @Column(name = "contato")
    private String contato;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "cep")
    private String cep;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "numero")
    private String numero;
    @Column(name = "uf")
    private String uf;
    @OneToMany(mappedBy = "empresaId")
    private List<Reparo> reparoList;

    public Empresa() {
    }

    public Empresa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @XmlTransient
    public List<Reparo> getReparoList() {
        return reparoList;
    }

    public void setReparoList(List<Reparo> reparoList) {
        this.reparoList = reparoList;
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
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.controlefrotas.controle.Empresa[ id=" + id + " ]";
    }
    
}
