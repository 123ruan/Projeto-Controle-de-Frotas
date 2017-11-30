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
@Table(name = "pessoa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p")
    , @NamedQuery(name = "Pessoa.findById", query = "SELECT p FROM Pessoa p WHERE p.id = :id")
    , @NamedQuery(name = "Pessoa.findByBairro", query = "SELECT p FROM Pessoa p WHERE p.bairro = :bairro")
    , @NamedQuery(name = "Pessoa.findByCelular", query = "SELECT p FROM Pessoa p WHERE p.celular = :celular")
    , @NamedQuery(name = "Pessoa.findByCep", query = "SELECT p FROM Pessoa p WHERE p.cep = :cep")
    , @NamedQuery(name = "Pessoa.findByCpf", query = "SELECT p FROM Pessoa p WHERE p.cpf = :cpf")
    , @NamedQuery(name = "Pessoa.findByEmail", query = "SELECT p FROM Pessoa p WHERE p.email = :email")
    , @NamedQuery(name = "Pessoa.findByEndereco", query = "SELECT p FROM Pessoa p WHERE p.endereco = :endereco")
    , @NamedQuery(name = "Pessoa.findByNome", query = "SELECT p FROM Pessoa p WHERE p.nome = :nome")
    , @NamedQuery(name = "Pessoa.findByNumero", query = "SELECT p FROM Pessoa p WHERE p.numero = :numero")
    , @NamedQuery(name = "Pessoa.findByRg", query = "SELECT p FROM Pessoa p WHERE p.rg = :rg")
    , @NamedQuery(name = "Pessoa.findBySexo", query = "SELECT p FROM Pessoa p WHERE p.sexo = :sexo")
    , @NamedQuery(name = "Pessoa.findByTelefone", query = "SELECT p FROM Pessoa p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "Pessoa.findByUf", query = "SELECT p FROM Pessoa p WHERE p.uf = :uf")
    , @NamedQuery(name = "Pessoa.findByCidade", query = "SELECT p FROM Pessoa p WHERE p.cidade = :cidade")
    , @NamedQuery(name = "Pessoa.findByDatadenascimento", query = "SELECT p FROM Pessoa p WHERE p.datadenascimento = :datadenascimento")})
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "celular")
    private String celular;
    @Column(name = "cep")
    private String cep;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "email")
    private String email;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "nome")
    private String nome;
    @Column(name = "numero")
    private String numero;
    @Column(name = "rg")
    private String rg;
    @Column(name = "sexo")
    private Integer sexo;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "uf")
    private String uf;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "datadenascimento")
    @Temporal(TemporalType.DATE)
    private Date datadenascimento;
    @OneToMany(mappedBy = "pessoaId")
    private List<Solicitacoes> solicitacoesList;

    public Pessoa() {
    }

    public Pessoa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(Date datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    @XmlTransient
    public List<Solicitacoes> getSolicitacoesList() {
        return solicitacoesList;
    }

    public void setSolicitacoesList(List<Solicitacoes> solicitacoesList) {
        this.solicitacoesList = solicitacoesList;
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
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.controlefrotas.controle.Pessoa[ id=" + id + " ]";
    }
    
}
