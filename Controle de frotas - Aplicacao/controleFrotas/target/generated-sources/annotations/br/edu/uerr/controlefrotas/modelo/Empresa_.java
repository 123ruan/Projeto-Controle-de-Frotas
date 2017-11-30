package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.Reparo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:57")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile SingularAttribute<Empresa, String> uf;
    public static volatile SingularAttribute<Empresa, String> cidade;
    public static volatile ListAttribute<Empresa, Reparo> reparoList;
    public static volatile SingularAttribute<Empresa, String> endereco;
    public static volatile SingularAttribute<Empresa, String> numero;
    public static volatile SingularAttribute<Empresa, String> bairro;
    public static volatile SingularAttribute<Empresa, Integer> id;
    public static volatile SingularAttribute<Empresa, String> cnpj;
    public static volatile SingularAttribute<Empresa, String> razaoSocial;
    public static volatile SingularAttribute<Empresa, String> contato;
    public static volatile SingularAttribute<Empresa, String> cep;

}