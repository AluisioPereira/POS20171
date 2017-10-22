package br.edu.ifpb.pos.passagem;

import br.edu.ifpb.pos.passagem.ReservaPassagem;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T23:06:36")
@StaticMetamodel(Passagem.class)
public class Passagem_ { 

    public static volatile ListAttribute<Passagem, ReservaPassagem> reservas;
    public static volatile SingularAttribute<Passagem, Integer> numeroPoutrona;
    public static volatile SingularAttribute<Passagem, String> origem;
    public static volatile SingularAttribute<Passagem, String> dataHoraSaida;
    public static volatile SingularAttribute<Passagem, Long> id;
    public static volatile SingularAttribute<Passagem, String> destino;
    public static volatile SingularAttribute<Passagem, String> dataHoraChegada;
    public static volatile SingularAttribute<Passagem, String> cnpjEmpresa;

}