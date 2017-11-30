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
@Table(name = "ocorrencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ocorrencia.findAll", query = "SELECT o FROM Ocorrencia o")
    , @NamedQuery(name = "Ocorrencia.findById", query = "SELECT o FROM Ocorrencia o WHERE o.id = :id")
    , @NamedQuery(name = "Ocorrencia.findByData", query = "SELECT o FROM Ocorrencia o WHERE o.data = :data")
    , @NamedQuery(name = "Ocorrencia.findByHora", query = "SELECT o FROM Ocorrencia o WHERE o.hora = :hora")
    , @NamedQuery(name = "Ocorrencia.findByLocal", query = "SELECT o FROM Ocorrencia o WHERE o.local = :local")
    , @NamedQuery(name = "Ocorrencia.findByValor", query = "SELECT o FROM Ocorrencia o WHERE o.valor = :valor")})
public class Ocorrencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "hora")
    private String hora;
    @Column(name = "local")
    private String local;
    @Column(name = "valor")
    private String valor;
    @JoinColumn(name = "ordem_servico_id", referencedColumnName = "id")
    @ManyToOne
    private OrdemServico ordemServicoId;
    @JoinColumn(name = "tipo_ocorrencia_id", referencedColumnName = "id")
    @ManyToOne
    private TipoOcorrencia tipoOcorrenciaId;

    public Ocorrencia() {
    }

    public Ocorrencia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public OrdemServico getOrdemServicoId() {
        return ordemServicoId;
    }

    public void setOrdemServicoId(OrdemServico ordemServicoId) {
        this.ordemServicoId = ordemServicoId;
    }

    public TipoOcorrencia getTipoOcorrenciaId() {
        return tipoOcorrenciaId;
    }

    public void setTipoOcorrenciaId(TipoOcorrencia tipoOcorrenciaId) {
        this.tipoOcorrenciaId = tipoOcorrenciaId;
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
        if (!(object instanceof Ocorrencia)) {
            return false;
        }
        Ocorrencia other = (Ocorrencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.controlefrotas.controle.Ocorrencia[ id=" + id + " ]";
    }
    
}
