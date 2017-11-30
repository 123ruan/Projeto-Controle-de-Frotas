/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ruan PC
 */
@Entity
@Table(name = "reparo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reparo.findAll", query = "SELECT r FROM Reparo r")
    , @NamedQuery(name = "Reparo.findById", query = "SELECT r FROM Reparo r WHERE r.id = :id")
    , @NamedQuery(name = "Reparo.findByDataEntrada", query = "SELECT r FROM Reparo r WHERE r.dataEntrada = :dataEntrada")
    , @NamedQuery(name = "Reparo.findByDataSaida", query = "SELECT r FROM Reparo r WHERE r.dataSaida = :dataSaida")
    , @NamedQuery(name = "Reparo.findByHora", query = "SELECT r FROM Reparo r WHERE r.hora = :hora")
    , @NamedQuery(name = "Reparo.findBySituacao", query = "SELECT r FROM Reparo r WHERE r.situacao = :situacao")
    , @NamedQuery(name = "Reparo.findByValor", query = "SELECT r FROM Reparo r WHERE r.valor = :valor")})
public class Reparo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data_entrada")
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    @Column(name = "data_saida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Column(name = "hora")
    private String hora;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "valor")
    private String valor;
    @JoinColumn(name = "empresa_id", referencedColumnName = "id")
    @ManyToOne
    private Empresa empresaId;
    @JoinColumn(name = "veiculo_id", referencedColumnName = "id")
    @ManyToOne
    private Veiculo veiculoId;

    public Reparo() {
    }

    public Reparo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Empresa getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Empresa empresaId) {
        this.empresaId = empresaId;
    }

    public Veiculo getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Veiculo veiculoId) {
        this.veiculoId = veiculoId;
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
        if (!(object instanceof Reparo)) {
            return false;
        }
        Reparo other = (Reparo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.controlefrotas.controle.Reparo[ id=" + id + " ]";
    }
    
}
