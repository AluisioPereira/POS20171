package br.edu.ifpb.pos.agencia;

import br.edu.ifpb.pos.domain.AgenciaId1;
import br.edu.ifpb.pos.domain.ClienteId1;
import br.edu.ifpb.pos.domain.HotelId1;
import br.edu.ifpb.pos.domain.PassagemId1;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-22T16:17:09")
@StaticMetamodel(Pacote.class)
public class Pacote_ { 

    public static volatile SingularAttribute<Pacote, PassagemId1> passagem;
    public static volatile SingularAttribute<Pacote, ClienteId1> cliente;
    public static volatile SingularAttribute<Pacote, String> codigo;
    public static volatile SingularAttribute<Pacote, HotelId1> hotel;
    public static volatile SingularAttribute<Pacote, Long> id;
    public static volatile SingularAttribute<Pacote, AgenciaId1> agencia;

}