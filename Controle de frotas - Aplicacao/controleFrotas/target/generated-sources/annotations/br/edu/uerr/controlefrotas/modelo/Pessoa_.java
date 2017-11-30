package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.Solicitacoes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:58")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, String> telefone;
    public static volatile SingularAttribute<Pessoa, String> cidade;
    public static volatile SingularAttribute<Pessoa, String> endereco;
    public static volatile SingularAttribute<Pessoa, String> numero;
    public static volatile SingularAttribute<Pessoa, String> bairro;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile ListAttribute<Pessoa, Solicitacoes> solicitacoesList;
    public static volatile SingularAttribute<Pessoa, String> cep;
    public static volatile SingularAttribute<Pessoa, String> uf;
    public static volatile SingularAttribute<Pessoa, String> rg;
    public static volatile SingularAttribute<Pessoa, String> cpf;
    public static volatile SingularAttribute<Pessoa, String> celular;
    public static volatile SingularAttribute<Pessoa, Integer> id;
    public static volatile SingularAttribute<Pessoa, Integer> sexo;
    public static volatile SingularAttribute<Pessoa, Date> datadenascimento;
    public static volatile SingularAttribute<Pessoa, String> email;

}