package br.edu.ifpb.pos.agencia;

import br.edu.ifpb.pos.agencia.domain.ClienteId;
import br.edu.ifpb.pos.agencia.domain.HotelId;
import br.edu.ifpb.pos.agencia.domain.PassagemId;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-19T11:10:22")
@StaticMetamodel(Pacote.class)
public class Pacote_ { 

    public static volatile SingularAttribute<Pacote, PassagemId> passagem;
    public static volatile SingularAttribute<Pacote, ClienteId> cliente;
    public static volatile SingularAttribute<Pacote, HotelId> hotel;
    public static volatile SingularAttribute<Pacote, Long> id;

}