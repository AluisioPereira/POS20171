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
@JsonDeserialize(as = ImmutableReservaPassagem.class)
@JsonSerialize(as = ImmutableReservaPassagem.class)
public interface ReservaPassagem {


    public String codigo();

    @Embedded
    public ClienteId cliente();
    
    public int id();

    @Embedded
    public PassagemId passagem();
}
