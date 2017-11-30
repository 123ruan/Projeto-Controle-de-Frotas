package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.Funcionario;
import br.edu.uerr.controlefrotas.modelo.Ocorrencia;
import br.edu.uerr.controlefrotas.modelo.Solicitacoes;
import br.edu.uerr.controlefrotas.modelo.Veiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:57")
@StaticMetamodel(OrdemServico.class)
public class OrdemServico_ { 

    public static volatile SingularAttribute<OrdemServico, String> situacao;
    public static volatile SingularAttribute<OrdemServico, Integer> kmFinal;
    public static volatile SingularAttribute<OrdemServico, Funcionario> funcionarioId;
    public static volatile SingularAttribute<OrdemServico, String> horaFinal;
    public static volatile SingularAttribute<OrdemServico, Solicitacoes> solicitacoesId;
    public static volatile SingularAttribute<OrdemServico, Veiculo> veiculoId;
    public static volatile SingularAttribute<OrdemServico, Date> dataChegada;
    public static volatile SingularAttribute<OrdemServico, Date> dataSaida;
    public static volatile SingularAttribute<OrdemServico, Integer> id;
    public static volatile SingularAttribute<OrdemServico, String> horaInicio;
    public static volatile ListAttribute<OrdemServico, Ocorrencia> ocorrenciaList;
    public static volatile SingularAttribute<OrdemServico, Integer> kmInicial;

}