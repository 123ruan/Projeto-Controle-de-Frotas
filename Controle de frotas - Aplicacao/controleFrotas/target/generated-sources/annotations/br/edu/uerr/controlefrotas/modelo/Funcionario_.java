package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.OrdemServico;
import br.edu.uerr.controlefrotas.modelo.Setor;
import br.edu.uerr.controlefrotas.modelo.TipoFuncionario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:57")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, String> senha;
    public static volatile SingularAttribute<Funcionario, Date> dataInfo;
    public static volatile SingularAttribute<Funcionario, TipoFuncionario> tipoFuncionarioId;
    public static volatile SingularAttribute<Funcionario, String> conta;
    public static volatile SingularAttribute<Funcionario, String> historico;
    public static volatile SingularAttribute<Funcionario, String> matricula;
    public static volatile ListAttribute<Funcionario, OrdemServico> ordemServicoList;
    public static volatile SingularAttribute<Funcionario, Integer> id;
    public static volatile SingularAttribute<Funcionario, Integer> pessoaId;
    public static volatile SingularAttribute<Funcionario, Setor> setorId;
    public static volatile SingularAttribute<Funcionario, Date> dataIn;
    public static volatile SingularAttribute<Funcionario, String> status;

}