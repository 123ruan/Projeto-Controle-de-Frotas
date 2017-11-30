package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.Funcionario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:58")
@StaticMetamodel(TipoFuncionario.class)
public class TipoFuncionario_ { 

    public static volatile ListAttribute<TipoFuncionario, Funcionario> funcionarioList;
    public static volatile SingularAttribute<TipoFuncionario, Date> dataInfo;
    public static volatile SingularAttribute<TipoFuncionario, String> nome;
    public static volatile SingularAttribute<TipoFuncionario, Integer> id;

}