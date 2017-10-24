package br.edu.ifpb.pos.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.persistence.Embedded;
import org.immutables.value.Value;

/**
 *
 * @author ajp
 */
@Value.Immutable
@JsonDeserialize(as = ImmutableReservaHotel.class)
@JsonSerialize(as = ImmutableReservaHotel.class)
public interface ReservaHotel {

    public String codigo();

    @Embedded
    public ClienteId cliente();

    public int id();

    @Embedded
    public HotelId hotel();
}
