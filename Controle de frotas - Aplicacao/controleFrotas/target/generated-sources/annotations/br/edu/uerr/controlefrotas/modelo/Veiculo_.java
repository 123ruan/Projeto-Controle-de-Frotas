package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.OrdemServico;
import br.edu.uerr.controlefrotas.modelo.Reparo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:58")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile ListAttribute<Veiculo, Reparo> reparoList;
    public static volatile SingularAttribute<Veiculo, String> tipoCombustivel;
    public static volatile SingularAttribute<Veiculo, String> renavam;
    public static volatile ListAttribute<Veiculo, OrdemServico> ordemServicoList;
    public static volatile SingularAttribute<Veiculo, Integer> id;
    public static volatile SingularAttribute<Veiculo, Integer> quilometragem;
    public static volatile SingularAttribute<Veiculo, String> modelo;
    public static volatile SingularAttribute<Veiculo, String> placa;

}