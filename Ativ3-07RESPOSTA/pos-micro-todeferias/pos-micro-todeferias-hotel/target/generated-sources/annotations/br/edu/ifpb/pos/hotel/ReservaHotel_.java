package br.edu.ifpb.pos.hotel;

import br.edu.ifpb.pos.domain.ClienteId;
import br.edu.ifpb.pos.domain.HotelId;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-24T04:13:59")
@StaticMetamodel(ReservaHotel.class)
public class ReservaHotel_ { 

    public static volatile SingularAttribute<ReservaHotel, ClienteId> cliente;
    public static volatile SingularAttribute<ReservaHotel, String> codigo;
    public static volatile SingularAttribute<ReservaHotel, HotelId> hotel;
    public static volatile SingularAttribute<ReservaHotel, Integer> id;

}