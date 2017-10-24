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
@JsonDeserialize(as = ImmutablePassagem.class)
@JsonSerialize(as = ImmutablePassagem.class)
public interface Passagem {

    public Integer cnpjEmpresa();

    public String dataHoraChegada();

    public String dataHoraSaida();

    public String destino();

    public int id();

    public int numeroPoutrona();

    public String origem();

    public List<ReservaPassagem> reservas();
}
