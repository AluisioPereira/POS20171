package br.edu.ifpb.pos.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

/**
 *
 * @author ajp
 */
@Value.Immutable
@JsonDeserialize(as = ImmutableCliente.class)
@JsonSerialize(as = ImmutableCliente.class)
public interface Cliente {
    public String cpf();    
    public int id();
    public String nome();
    public double renda();
}
