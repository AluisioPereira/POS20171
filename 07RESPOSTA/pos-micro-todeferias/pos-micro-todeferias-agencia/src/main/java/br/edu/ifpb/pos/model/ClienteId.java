package br.edu.ifpb.pos.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;



/**
 *
 * @author ajp
 */
@Value.Immutable
@JsonDeserialize(as = ImmutableClienteId.class)
@JsonSerialize(as = ImmutableClienteId.class)
public interface ClienteId {
    public Integer cpf(); 
}
