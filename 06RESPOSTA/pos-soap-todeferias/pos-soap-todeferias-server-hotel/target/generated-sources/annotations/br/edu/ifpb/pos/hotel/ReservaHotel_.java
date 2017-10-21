package br.edu.ifpb.pos.hotel;

import br.edu.ifpb.pos.hotel.domain.ClienteId;
import br.edu.ifpb.pos.hotel.domain.HotelId;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T00:09:36")
@StaticMetamodel(ReservaHotel.class)
public class ReservaHotel_ { 

    public static volatile SingularAttribute<ReservaHotel, ClienteId> cliente;
    public static volatile SingularAttribute<ReservaHotel, HotelId> hotel;
    public static volatile SingularAttribute<ReservaHotel, Long> id;

}