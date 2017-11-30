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
@Table(name = "tipo_ocorrencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoOcorrencia.findAll", query = "SELECT t FROM TipoOcorrencia t")
    , @NamedQuery(name = "TipoOcorrencia.findById", query = "SELECT t FROM TipoOcorrencia t WHERE t.id = :id")
    , @NamedQuery(name = "TipoOcorrencia.findByTipoOcorrencia", query = "SELECT t FROM TipoOcorrencia t WHERE t.tipoOcorrencia = :tipoOcorrencia")})
public class TipoOcorrencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tipo_ocorrencia")
    private String tipoOcorrencia;
    @OneToMany(mappedBy = "tipoOcorrenciaId")
    private List<Ocorrencia> ocorrenciaList;

    public TipoOcorrencia() {
    }

    public TipoOcorrencia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(String tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    @XmlTransient
    public List<Ocorrencia> getOcorrenciaList() {
        return ocorrenciaList;
    }

    public void setOcorrenciaList(List<Ocorrencia> ocorrenciaList) {
        this.ocorrenciaList = ocorrenciaList;
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
        if (!(object instanceof TipoOcorrencia)) {
            return false;
        }
        TipoOcorrencia other = (TipoOcorrencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.controlefrotas.controle.TipoOcorrencia[ id=" + id + " ]";
    }
    
}
