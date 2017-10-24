package br.edu.ifpb.pos.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

/**
 *
 * @author ajp
 */
@Value.Immutable
@JsonDeserialize(as = ImmutableHotelId.class)
@JsonSerialize(as = ImmutableHotelId.class)
public interface HotelId {
    public Integer cnpjHotel();    
}
