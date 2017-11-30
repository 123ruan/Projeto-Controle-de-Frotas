package br.edu.uerr.controlefrotas.modelo;

import br.edu.uerr.controlefrotas.modelo.Empresa;
import br.edu.uerr.controlefrotas.modelo.Veiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T11:53:57")
@StaticMetamodel(Reparo.class)
public class Reparo_ { 

    public static volatile SingularAttribute<Reparo, String> situacao;
    public static volatile SingularAttribute<Reparo, Empresa> empresaId;
    public static volatile SingularAttribute<Reparo, Date> dataEntrada;
    public static volatile SingularAttribute<Reparo, String> hora;
    public static volatile SingularAttribute<Reparo, String> valor;
    public static volatile SingularAttribute<Reparo, Veiculo> veiculoId;
    public static volatile SingularAttribute<Reparo, Integer> id;
    public static volatile SingularAttribute<Reparo, Date> dataSaida;

}