/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ruan PC
 */
@Entity
@Table(name = "tipo_reparo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoReparo.findAll", query = "SELECT t FROM TipoReparo t")
    , @NamedQuery(name = "TipoReparo.findById", query = "SELECT t FROM TipoReparo t WHERE t.id = :id")
    , @NamedQuery(name = "TipoReparo.findByTipoAcao", query = "SELECT t FROM TipoReparo t WHERE t.tipoAcao = :tipoAcao")})
public class TipoReparo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tipo_acao")
    private String tipoAcao;

    public TipoReparo() {
    }

    public TipoReparo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoAcao() {
        return tipoAcao;
    }

    public void setTipoAcao(String tipoAcao) {
        this.tipoAcao = tipoAcao;
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
        if (!(object instanceof TipoReparo)) {
            return false;
        }
        TipoReparo other = (TipoReparo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.controlefrotas.controle.TipoReparo[ id=" + id + " ]";
    }
    
}
