package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.OrdemServico;
import br.edu.uerr.controlefrotas.modelo.Pessoa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:57")
@StaticMetamodel(Solicitacoes.class)
public class Solicitacoes_ { 

    public static volatile SingularAttribute<Solicitacoes, Date> data;
    public static volatile SingularAttribute<Solicitacoes, String> hora;
    public static volatile SingularAttribute<Solicitacoes, String> localDestino;
    public static volatile ListAttribute<Solicitacoes, OrdemServico> ordemServicoList;
    public static volatile SingularAttribute<Solicitacoes, Integer> id;
    public static volatile SingularAttribute<Solicitacoes, Pessoa> pessoaId;

}