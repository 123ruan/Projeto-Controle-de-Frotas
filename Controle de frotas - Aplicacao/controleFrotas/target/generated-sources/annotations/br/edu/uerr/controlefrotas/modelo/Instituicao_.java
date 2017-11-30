package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.Setor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:58")
@StaticMetamodel(Instituicao.class)
public class Instituicao_ { 

    public static volatile SingularAttribute<Instituicao, String> telefone;
    public static volatile SingularAttribute<Instituicao, String> sigla;
    public static volatile SingularAttribute<Instituicao, String> numero;
    public static volatile SingularAttribute<Instituicao, Date> dataInfo;
    public static volatile SingularAttribute<Instituicao, String> bairro;
    public static volatile SingularAttribute<Instituicao, String> localidade;
    public static volatile SingularAttribute<Instituicao, String> nome;
    public static volatile SingularAttribute<Instituicao, String> cnpj;
    public static volatile SingularAttribute<Instituicao, String> cep;
    public static volatile SingularAttribute<Instituicao, String> uf;
    public static volatile SingularAttribute<Instituicao, String> logradouro;
    public static volatile ListAttribute<Instituicao, Setor> setorList;
    public static volatile SingularAttribute<Instituicao, String> celular;
    public static volatile SingularAttribute<Instituicao, Integer> id;
    public static volatile SingularAttribute<Instituicao, String> responsavel;
    public static volatile SingularAttribute<Instituicao, String> email;

}