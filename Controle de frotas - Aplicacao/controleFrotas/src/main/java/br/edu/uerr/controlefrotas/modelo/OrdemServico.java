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
@Table(name = "ordem_servico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdemServico.findAll", query = "SELECT o FROM OrdemServico o")
    , @NamedQuery(name = "OrdemServico.findById", query = "SELECT o FROM OrdemServico o WHERE o.id = :id")
    , @NamedQuery(name = "OrdemServico.findByDataSaida", query = "SELECT o FROM OrdemServico o WHERE o.dataSaida = :dataSaida")
    , @NamedQuery(name = "OrdemServico.findByDataChegada", query = "SELECT o FROM OrdemServico o WHERE o.dataChegada = :dataChegada")
    , @NamedQuery(name = "OrdemServico.findByHoraInicio", query = "SELECT o FROM OrdemServico o WHERE o.horaInicio = :horaInicio")
    , @NamedQuery(name = "OrdemServico.findByHoraFinal", query = "SELECT o FROM OrdemServico o WHERE o.horaFinal = :horaFinal")
    , @NamedQuery(name = "OrdemServico.findByKmInicial", query = "SELECT o FROM OrdemServico o WHERE o.kmInicial = :kmInicial")
    , @NamedQuery(name = "OrdemServico.findByKmFinal", query = "SELECT o FROM OrdemServico o WHERE o.kmFinal = :kmFinal")
    , @NamedQuery(name = "OrdemServico.findBySituacao", query = "SELECT o FROM OrdemServico o WHERE o.situacao = :situacao")})
public class OrdemServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data_saida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Column(name = "data_chegada")
    @Temporal(TemporalType.DATE)
    private Date dataChegada;
    @Column(name = "hora_inicio")
    private String horaInicio;
    @Column(name = "hora_final")
    private String horaFinal;
    @Column(name = "km_inicial")
    private Integer kmInicial;
    @Column(name = "km_final")
    private Integer kmFinal;
    @Column(name = "situacao")
    private String situacao;
    @OneToMany(mappedBy = "ordemServicoId")
    private List<Ocorrencia> ocorrenciaList;
    @JoinColumn(name = "funcionario_id", referencedColumnName = "id")
    @ManyToOne
    private Funcionario funcionarioId;
    @JoinColumn(name = "solicitacoes_id", referencedColumnName = "id")
    @ManyToOne
    private Solicitacoes solicitacoesId;
    @JoinColumn(name = "veiculo_id", referencedColumnName = "id")
    @ManyToOne
    private Veiculo veiculoId;

    public OrdemServico() {
    }

    public OrdemServico(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Integer getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(Integer kmInicial) {
        this.kmInicial = kmInicial;
    }

    public Integer getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(Integer kmFinal) {
        this.kmFinal = kmFinal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @XmlTransient
    public List<Ocorrencia> getOcorrenciaList() {
        return ocorrenciaList;
    }

    public void setOcorrenciaList(List<Ocorrencia> ocorrenciaList) {
        this.ocorrenciaList = ocorrenciaList;
    }

    public Funcionario getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Funcionario funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public Solicitacoes getSolicitacoesId() {
        return solicitacoesId;
    }

    public void setSolicitacoesId(Solicitacoes solicitacoesId) {
        this.solicitacoesId = solicitacoesId;
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
        if (!(object instanceof OrdemServico)) {
            return false;
        }
        OrdemServico other = (OrdemServico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.controlefrotas.controle.OrdemServico[ id=" + id + " ]";
    }
    
}
