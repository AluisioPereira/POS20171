package br.edu.ifpb.pos.hotel;

import br.edu.ifpb.pos.hotel.ReservaHotel;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-21T18:13:40")
@StaticMetamodel(Hotel.class)
public class Hotel_ { 

    public static volatile ListAttribute<Hotel, ReservaHotel> reservas;
    public static volatile SingularAttribute<Hotel, String> nome;
    public static volatile SingularAttribute<Hotel, Long> id;
    public static volatile SingularAttribute<Hotel, String> cnpj;

}