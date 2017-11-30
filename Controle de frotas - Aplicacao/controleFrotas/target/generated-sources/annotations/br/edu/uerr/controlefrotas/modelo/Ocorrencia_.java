package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.OrdemServico;
import br.edu.uerr.controlefrotas.modelo.TipoOcorrencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:58")
@StaticMetamodel(Ocorrencia.class)
public class Ocorrencia_ { 

    public static volatile SingularAttribute<Ocorrencia, Date> data;
    public static volatile SingularAttribute<Ocorrencia, String> hora;
    public static volatile SingularAttribute<Ocorrencia, OrdemServico> ordemServicoId;
    public static volatile SingularAttribute<Ocorrencia, String> valor;
    public static volatile SingularAttribute<Ocorrencia, Integer> id;
    public static volatile SingularAttribute<Ocorrencia, String> local;
    public static volatile SingularAttribute<Ocorrencia, TipoOcorrencia> tipoOcorrenciaId;

}