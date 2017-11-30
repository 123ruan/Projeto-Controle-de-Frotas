/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.controlefrotas.modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ruan PC
 */
@Entity
@Table(name = "solicitacoes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitacoes.findAll", query = "SELECT s FROM Solicitacoes s")
    , @NamedQuery(name = "Solicitacoes.findById", query = "SELECT s FROM Solicitacoes s WHERE s.id = :id")
    , @NamedQuery(name = "Solicitacoes.findByHora", query = "SELECT s FROM Solicitacoes s WHERE s.hora = :hora")
    , @NamedQuery(name = "Solicitacoes.findByData", query = "SELECT s FROM Solicitacoes s WHERE s.data = :data")
    , @NamedQuery(name = "Solicitacoes.findByLocalDestino", query = "SELECT s FROM Solicitacoes s WHERE s.localDestino = :localDestino")})
public class Solicitacoes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "hora")
    private String hora;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "local_destino")
    private String localDestino;
    @OneToMany(mappedBy = "solicitacoesId")
    private List<OrdemServico> ordemServicoList;
    @JoinColumn(name = "pessoa_id", referencedColumnName = "id")
    @ManyToOne
    private Pessoa pessoaId;

    public Solicitacoes() {
    }

    public Solicitacoes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        String oldHora = this.hora;
        this.hora = hora;
        changeSupport.firePropertyChange("hora", oldHora, hora);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        Date oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        String oldLocalDestino = this.localDestino;
        this.localDestino = localDestino;
        changeSupport.firePropertyChange("localDestino", oldLocalDestino, localDestino);
    }

    @XmlTransient
    public List<OrdemServico> getOrdemServicoList() {
        return ordemServicoList;
    }

    public void setOrdemServicoList(List<OrdemServico> ordemServicoList) {
        this.ordemServicoList = ordemServicoList;
    }

    public Pessoa getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Pessoa pessoaId) {
        Pessoa oldPessoaId = this.pessoaId;
        this.pessoaId = pessoaId;
        changeSupport.firePropertyChange("pessoaId", oldPessoaId, pessoaId);
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
        if (!(object instanceof Solicitacoes)) {
            return false;
        }
        Solicitacoes other = (Solicitacoes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.controlefrotas.controle.Solicitacoes[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
