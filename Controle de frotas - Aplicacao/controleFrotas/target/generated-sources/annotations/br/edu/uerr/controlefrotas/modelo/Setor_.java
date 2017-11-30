package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.Funcionario;
import br.edu.uerr.controlefrotas.modelo.Instituicao;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:57")
@StaticMetamodel(Setor.class)
public class Setor_ { 

    public static volatile SingularAttribute<Setor, Instituicao> instituicaoId;
    public static volatile ListAttribute<Setor, Funcionario> funcionarioList;
    public static volatile SingularAttribute<Setor, String> sigla;
    public static volatile SingularAttribute<Setor, Date> dataInfo;
    public static volatile SingularAttribute<Setor, String> nome;
    public static volatile SingularAttribute<Setor, Integer> id;
    public static volatile SingularAttribute<Setor, String> ramal;
    public static volatile SingularAttribute<Setor, String> email;

}