package br.edu.ifpb.pos.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Passagem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePassagem.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Passagem"})
public final class ImmutablePassagem implements Passagem {
  private final Integer cnpjEmpresa;
  private final String dataHoraChegada;
  private final String dataHoraSaida;
  private final String destino;
  private final int id;
  private final int numeroPoutrona;
  private final String origem;
  private final ImmutableList<ReservaPassagem> reservas;

  private ImmutablePassagem(
      Integer cnpjEmpresa,
      String dataHoraChegada,
      String dataHoraSaida,
      String destino,
      int id,
      int numeroPoutrona,
      String origem,
      ImmutableList<ReservaPassagem> reservas) {
    this.cnpjEmpresa = cnpjEmpresa;
    this.dataHoraChegada = dataHoraChegada;
    this.dataHoraSaida = dataHoraSaida;
    this.destino = destino;
    this.id = id;
    this.numeroPoutrona = numeroPoutrona;
    this.origem = origem;
    this.reservas = reservas;
  }

  /**
   * @return The value of the {@code cnpjEmpresa} attribute
   */
  @JsonProperty("cnpjEmpresa")
  @Override
  public Integer cnpjEmpresa() {
    return cnpjEmpresa;
  }

  /**
   * @return The value of the {@code dataHoraChegada} attribute
   */
  @JsonProperty("dataHoraChegada")
  @Override
  public String dataHoraChegada() {
    return dataHoraChegada;
  }

  /**
   * @return The value of the {@code dataHoraSaida} attribute
   */
  @JsonProperty("dataHoraSaida")
  @Override
  public String dataHoraSaida() {
    return dataHoraSaida;
  }

  /**
   * @return The value of the {@code destino} attribute
   */
  @JsonProperty("destino")
  @Override
  public String destino() {
    return destino;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public int id() {
    return id;
  }

  /**
   * @return The value of the {@code numeroPoutrona} attribute
   */
  @JsonProperty("numeroPoutrona")
  @Override
  public int numeroPoutrona() {
    return numeroPoutrona;
  }

  /**
   * @return The value of the {@code origem} attribute
   */
  @JsonProperty("origem")
  @Override
  public String origem() {
    return origem;
  }

  /**
   * @return The value of the {@code reservas} attribute
   */
  @JsonProperty("reservas")
  @Override
  public ImmutableList<ReservaPassagem> reservas() {
    return reservas;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Passagem#cnpjEmpresa() cnpjEmpresa} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cnpjEmpresa
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePassagem withCnpjEmpresa(Integer value) {
    if (this.cnpjEmpresa.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "cnpjEmpresa");
    return new ImmutablePassagem(
        newValue,
        this.dataHoraChegada,
        this.dataHoraSaida,
        this.destino,
        this.id,
        this.numeroPoutrona,
        this.origem,
        this.reservas);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Passagem#dataHoraChegada() dataHoraChegada} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataHoraChegada
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePassagem withDataHoraChegada(String value) {
    if (this.dataHoraChegada.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "dataHoraChegada");
    return new ImmutablePassagem(
        this.cnpjEmpresa,
        newValue,
        this.dataHoraSaida,
        this.destino,
        this.id,
        this.numeroPoutrona,
        this.origem,
        this.reservas);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Passagem#dataHoraSaida() dataHoraSaida} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataHoraSaida
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePassagem withDataHoraSaida(String value) {
    if (this.dataHoraSaida.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "dataHoraSaida");
    return new ImmutablePassagem(
        this.cnpjEmpresa,
        this.dataHoraChegada,
        newValue,
        this.destino,
        this.id,
        this.numeroPoutrona,
        this.origem,
        this.reservas);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Passagem#destino() destino} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for destino
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePassagem withDestino(String value) {
    if (this.destino.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "destino");
    return new ImmutablePassagem(
        this.cnpjEmpresa,
        this.dataHoraChegada,
        this.dataHoraSaida,
        newValue,
        this.id,
        this.numeroPoutrona,
        this.origem,
        this.reservas);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Passagem#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePassagem withId(int value) {
    if (this.id == value) return this;
    return new ImmutablePassagem(
        this.cnpjEmpresa,
        this.dataHoraChegada,
        this.dataHoraSaida,
        this.destino,
        value,
        this.numeroPoutrona,
        this.origem,
        this.reservas);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Passagem#numeroPoutrona() numeroPoutrona} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for numeroPoutrona
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePassagem withNumeroPoutrona(int value) {
    if (this.numeroPoutrona == value) return this;
    return new ImmutablePassagem(
        this.cnpjEmpresa,
        this.dataHoraChegada,
        this.dataHoraSaida,
        this.destino,
        this.id,
        value,
        this.origem,
        this.reservas);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Passagem#origem() origem} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for origem
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePassagem withOrigem(String value) {
    if (this.origem.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "origem");
    return new ImmutablePassagem(
        this.cnpjEmpresa,
        this.dataHoraChegada,
        this.dataHoraSaida,
        this.destino,
        this.id,
        this.numeroPoutrona,
        newValue,
        this.reservas);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Passagem#reservas() reservas}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePassagem withReservas(ReservaPassagem... elements) {
    ImmutableList<ReservaPassagem> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePassagem(
        this.cnpjEmpresa,
        this.dataHoraChegada,
        this.dataHoraSaida,
        this.destino,
        this.id,
        this.numeroPoutrona,
        this.origem,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Passagem#reservas() reservas}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of reservas elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePassagem withReservas(Iterable<? extends ReservaPassagem> elements) {
    if (this.reservas == elements) return this;
    ImmutableList<ReservaPassagem> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePassagem(
        this.cnpjEmpresa,
        this.dataHoraChegada,
        this.dataHoraSaida,
        this.destino,
        this.id,
        this.numeroPoutrona,
        this.origem,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePassagem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePassagem
        && equalTo((ImmutablePassagem) another);
  }

  private boolean equalTo(ImmutablePassagem another) {
    return cnpjEmpresa.equals(another.cnpjEmpresa)
        && dataHoraChegada.equals(another.dataHoraChegada)
        && dataHoraSaida.equals(another.dataHoraSaida)
        && destino.equals(another.destino)
        && id == another.id
        && numeroPoutrona == another.numeroPoutrona
        && origem.equals(another.origem)
        && reservas.equals(another.reservas);
  }

  /**
   * Computes a hash code from attributes: {@code cnpjEmpresa}, {@code dataHoraChegada}, {@code dataHoraSaida}, {@code destino}, {@code id}, {@code numeroPoutrona}, {@code origem}, {@code reservas}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + cnpjEmpresa.hashCode();
    h += (h << 5) + dataHoraChegada.hashCode();
    h += (h << 5) + dataHoraSaida.hashCode();
    h += (h << 5) + destino.hashCode();
    h += (h << 5) + id;
    h += (h << 5) + numeroPoutrona;
    h += (h << 5) + origem.hashCode();
    h += (h << 5) + reservas.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Passagem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Passagem")
        .omitNullValues()
        .add("cnpjEmpresa", cnpjEmpresa)
        .add("dataHoraChegada", dataHoraChegada)
        .add("dataHoraSaida", dataHoraSaida)
        .add("destino", destino)
        .add("id", id)
        .add("numeroPoutrona", numeroPoutrona)
        .add("origem", origem)
        .add("reservas", reservas)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Passagem {
    Integer cnpjEmpresa;
    String dataHoraChegada;
    String dataHoraSaida;
    String destino;
    int id;
    boolean idIsSet;
    int numeroPoutrona;
    boolean numeroPoutronaIsSet;
    String origem;
    List<ReservaPassagem> reservas = ImmutableList.of();
    @JsonProperty("cnpjEmpresa")
    public void setCnpjEmpresa(Integer cnpjEmpresa) {
      this.cnpjEmpresa = cnpjEmpresa;
    }
    @JsonProperty("dataHoraChegada")
    public void setDataHoraChegada(String dataHoraChegada) {
      this.dataHoraChegada = dataHoraChegada;
    }
    @JsonProperty("dataHoraSaida")
    public void setDataHoraSaida(String dataHoraSaida) {
      this.dataHoraSaida = dataHoraSaida;
    }
    @JsonProperty("destino")
    public void setDestino(String destino) {
      this.destino = destino;
    }
    @JsonProperty("id")
    public void setId(int id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("numeroPoutrona")
    public void setNumeroPoutrona(int numeroPoutrona) {
      this.numeroPoutrona = numeroPoutrona;
      this.numeroPoutronaIsSet = true;
    }
    @JsonProperty("origem")
    public void setOrigem(String origem) {
      this.origem = origem;
    }
    @JsonProperty("reservas")
    public void setReservas(List<ReservaPassagem> reservas) {
      this.reservas = reservas;
    }
    @Override
    public Integer cnpjEmpresa() { throw new UnsupportedOperationException(); }
    @Override
    public String dataHoraChegada() { throw new UnsupportedOperationException(); }
    @Override
    public String dataHoraSaida() { throw new UnsupportedOperationException(); }
    @Override
    public String destino() { throw new UnsupportedOperationException(); }
    @Override
    public int id() { throw new UnsupportedOperationException(); }
    @Override
    public int numeroPoutrona() { throw new UnsupportedOperationException(); }
    @Override
    public String origem() { throw new UnsupportedOperationException(); }
    @Override
    public List<ReservaPassagem> reservas() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePassagem fromJson(Json json) {
    ImmutablePassagem.Builder builder = ImmutablePassagem.builder();
    if (json.cnpjEmpresa != null) {
      builder.cnpjEmpresa(json.cnpjEmpresa);
    }
    if (json.dataHoraChegada != null) {
      builder.dataHoraChegada(json.dataHoraChegada);
    }
    if (json.dataHoraSaida != null) {
      builder.dataHoraSaida(json.dataHoraSaida);
    }
    if (json.destino != null) {
      builder.destino(json.destino);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.numeroPoutronaIsSet) {
      builder.numeroPoutrona(json.numeroPoutrona);
    }
    if (json.origem != null) {
      builder.origem(json.origem);
    }
    if (json.reservas != null) {
      builder.addAllReservas(json.reservas);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Passagem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Passagem instance
   */
  public static ImmutablePassagem copyOf(Passagem instance) {
    if (instance instanceof ImmutablePassagem) {
      return (ImmutablePassagem) instance;
    }
    return ImmutablePassagem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePassagem ImmutablePassagem}.
   * @return A new ImmutablePassagem builder
   */
  public static ImmutablePassagem.Builder builder() {
    return new ImmutablePassagem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePassagem ImmutablePassagem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CNPJ_EMPRESA = 0x1L;
    private static final long INIT_BIT_DATA_HORA_CHEGADA = 0x2L;
    private static final long INIT_BIT_DATA_HORA_SAIDA = 0x4L;
    private static final long INIT_BIT_DESTINO = 0x8L;
    private static final long INIT_BIT_ID = 0x10L;
    private static final long INIT_BIT_NUMERO_POUTRONA = 0x20L;
    private static final long INIT_BIT_ORIGEM = 0x40L;
    private long initBits = 0x7fL;

    private Integer cnpjEmpresa;
    private String dataHoraChegada;
    private String dataHoraSaida;
    private String destino;
    private int id;
    private int numeroPoutrona;
    private String origem;
    private ImmutableList.Builder<ReservaPassagem> reservas = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Passagem} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Passagem instance) {
      Preconditions.checkNotNull(instance, "instance");
      cnpjEmpresa(instance.cnpjEmpresa());
      dataHoraChegada(instance.dataHoraChegada());
      dataHoraSaida(instance.dataHoraSaida());
      destino(instance.destino());
      id(instance.id());
      numeroPoutrona(instance.numeroPoutrona());
      origem(instance.origem());
      addAllReservas(instance.reservas());
      return this;
    }

    /**
     * Initializes the value for the {@link Passagem#cnpjEmpresa() cnpjEmpresa} attribute.
     * @param cnpjEmpresa The value for cnpjEmpresa 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cnpjEmpresa")
    public final Builder cnpjEmpresa(Integer cnpjEmpresa) {
      this.cnpjEmpresa = Preconditions.checkNotNull(cnpjEmpresa, "cnpjEmpresa");
      initBits &= ~INIT_BIT_CNPJ_EMPRESA;
      return this;
    }

    /**
     * Initializes the value for the {@link Passagem#dataHoraChegada() dataHoraChegada} attribute.
     * @param dataHoraChegada The value for dataHoraChegada 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataHoraChegada")
    public final Builder dataHoraChegada(String dataHoraChegada) {
      this.dataHoraChegada = Preconditions.checkNotNull(dataHoraChegada, "dataHoraChegada");
      initBits &= ~INIT_BIT_DATA_HORA_CHEGADA;
      return this;
    }

    /**
     * Initializes the value for the {@link Passagem#dataHoraSaida() dataHoraSaida} attribute.
     * @param dataHoraSaida The value for dataHoraSaida 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataHoraSaida")
    public final Builder dataHoraSaida(String dataHoraSaida) {
      this.dataHoraSaida = Preconditions.checkNotNull(dataHoraSaida, "dataHoraSaida");
      initBits &= ~INIT_BIT_DATA_HORA_SAIDA;
      return this;
    }

    /**
     * Initializes the value for the {@link Passagem#destino() destino} attribute.
     * @param destino The value for destino 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("destino")
    public final Builder destino(String destino) {
      this.destino = Preconditions.checkNotNull(destino, "destino");
      initBits &= ~INIT_BIT_DESTINO;
      return this;
    }

    /**
     * Initializes the value for the {@link Passagem#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(int id) {
      this.id = id;
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Passagem#numeroPoutrona() numeroPoutrona} attribute.
     * @param numeroPoutrona The value for numeroPoutrona 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numeroPoutrona")
    public final Builder numeroPoutrona(int numeroPoutrona) {
      this.numeroPoutrona = numeroPoutrona;
      initBits &= ~INIT_BIT_NUMERO_POUTRONA;
      return this;
    }

    /**
     * Initializes the value for the {@link Passagem#origem() origem} attribute.
     * @param origem The value for origem 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("origem")
    public final Builder origem(String origem) {
      this.origem = Preconditions.checkNotNull(origem, "origem");
      initBits &= ~INIT_BIT_ORIGEM;
      return this;
    }

    /**
     * Adds one element to {@link Passagem#reservas() reservas} list.
     * @param element A reservas element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addReservas(ReservaPassagem element) {
      this.reservas.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Passagem#reservas() reservas} list.
     * @param elements An array of reservas elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addReservas(ReservaPassagem... elements) {
      this.reservas.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Passagem#reservas() reservas} list.
     * @param elements An iterable of reservas elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reservas")
    public final Builder reservas(Iterable<? extends ReservaPassagem> elements) {
      this.reservas = ImmutableList.builder();
      return addAllReservas(elements);
    }

    /**
     * Adds elements to {@link Passagem#reservas() reservas} list.
     * @param elements An iterable of reservas elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllReservas(Iterable<? extends ReservaPassagem> elements) {
      this.reservas.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePassagem ImmutablePassagem}.
     * @return An immutable instance of Passagem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePassagem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePassagem(
          cnpjEmpresa,
          dataHoraChegada,
          dataHoraSaida,
          destino,
          id,
          numeroPoutrona,
          origem,
          reservas.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CNPJ_EMPRESA) != 0) attributes.add("cnpjEmpresa");
      if ((initBits & INIT_BIT_DATA_HORA_CHEGADA) != 0) attributes.add("dataHoraChegada");
      if ((initBits & INIT_BIT_DATA_HORA_SAIDA) != 0) attributes.add("dataHoraSaida");
      if ((initBits & INIT_BIT_DESTINO) != 0) attributes.add("destino");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_NUMERO_POUTRONA) != 0) attributes.add("numeroPoutrona");
      if ((initBits & INIT_BIT_ORIGEM) != 0) attributes.add("origem");
      return "Cannot build Passagem, some of required attributes are not set " + attributes;
    }
  }
}
