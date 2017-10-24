package br.edu.ifpb.pos.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.ArrayList;
import java.util.List;
import org.immutables.value.Value;

/**
 *
 * @author ajp
 */
@Value.Immutable
@JsonDeserialize(as = ImmutableHotel.class)
@JsonSerialize(as = ImmutableHotel.class)
public interface Hotel {
    public String cnpj();    
    public int id();
    public String nome();    
    public List<ReservaHotel> reservas();
}