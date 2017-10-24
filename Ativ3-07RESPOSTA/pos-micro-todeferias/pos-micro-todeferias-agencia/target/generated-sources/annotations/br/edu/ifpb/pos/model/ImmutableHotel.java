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
 * Immutable implementation of {@link Hotel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHotel.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Hotel"})
public final class ImmutableHotel implements Hotel {
  private final String cnpj;
  private final int id;
  private final String nome;
  private final ImmutableList<ReservaHotel> reservas;

  private ImmutableHotel(
      String cnpj,
      int id,
      String nome,
      ImmutableList<ReservaHotel> reservas) {
    this.cnpj = cnpj;
    this.id = id;
    this.nome = nome;
    this.reservas = reservas;
  }

  /**
   * @return The value of the {@code cnpj} attribute
   */
  @JsonProperty("cnpj")
  @Override
  public String cnpj() {
    return cnpj;
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
   * @return The value of the {@code nome} attribute
   */
  @JsonProperty("nome")
  @Override
  public String nome() {
    return nome;
  }

  /**
   * @return The value of the {@code reservas} attribute
   */
  @JsonProperty("reservas")
  @Override
  public ImmutableList<ReservaHotel> reservas() {
    return reservas;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Hotel#cnpj() cnpj} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cnpj
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHotel withCnpj(String value) {
    if (this.cnpj.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "cnpj");
    return new ImmutableHotel(newValue, this.id, this.nome, this.reservas);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Hotel#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHotel withId(int value) {
    if (this.id == value) return this;
    return new ImmutableHotel(this.cnpj, value, this.nome, this.reservas);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Hotel#nome() nome} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHotel withNome(String value) {
    if (this.nome.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "nome");
    return new ImmutableHotel(this.cnpj, this.id, newValue, this.reservas);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Hotel#reservas() reservas}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHotel withReservas(ReservaHotel... elements) {
    ImmutableList<ReservaHotel> newValue = ImmutableList.copyOf(elements);
    return new ImmutableHotel(this.cnpj, this.id, this.nome, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Hotel#reservas() reservas}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of reservas elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHotel withReservas(Iterable<? extends ReservaHotel> elements) {
    if (this.reservas == elements) return this;
    ImmutableList<ReservaHotel> newValue = ImmutableList.copyOf(elements);
    return new ImmutableHotel(this.cnpj, this.id, this.nome, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHotel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHotel
        && equalTo((ImmutableHotel) another);
  }

  private boolean equalTo(ImmutableHotel another) {
    return cnpj.equals(another.cnpj)
        && id == another.id
        && nome.equals(another.nome)
        && reservas.equals(another.reservas);
  }

  /**
   * Computes a hash code from attributes: {@code cnpj}, {@code id}, {@code nome}, {@code reservas}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + cnpj.hashCode();
    h += (h << 5) + id;
    h += (h << 5) + nome.hashCode();
    h += (h << 5) + reservas.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Hotel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Hotel")
        .omitNullValues()
        .add("cnpj", cnpj)
        .add("id", id)
        .add("nome", nome)
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
  static final class Json implements Hotel {
    String cnpj;
    int id;
    boolean idIsSet;
    String nome;
    List<ReservaHotel> reservas = ImmutableList.of();
    @JsonProperty("cnpj")
    public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
    }
    @JsonProperty("id")
    public void setId(int id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("nome")
    public void setNome(String nome) {
      this.nome = nome;
    }
    @JsonProperty("reservas")
    public void setReservas(List<ReservaHotel> reservas) {
      this.reservas = reservas;
    }
    @Override
    public String cnpj() { throw new UnsupportedOperationException(); }
    @Override
    public int id() { throw new UnsupportedOperationException(); }
    @Override
    public String nome() { throw new UnsupportedOperationException(); }
    @Override
    public List<ReservaHotel> reservas() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableHotel fromJson(Json json) {
    ImmutableHotel.Builder builder = ImmutableHotel.builder();
    if (json.cnpj != null) {
      builder.cnpj(json.cnpj);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nome != null) {
      builder.nome(json.nome);
    }
    if (json.reservas != null) {
      builder.addAllReservas(json.reservas);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Hotel} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Hotel instance
   */
  public static ImmutableHotel copyOf(Hotel instance) {
    if (instance instanceof ImmutableHotel) {
      return (ImmutableHotel) instance;
    }
    return ImmutableHotel.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHotel ImmutableHotel}.
   * @return A new ImmutableHotel builder
   */
  public static ImmutableHotel.Builder builder() {
    return new ImmutableHotel.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHotel ImmutableHotel}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CNPJ = 0x1L;
    private static final long INIT_BIT_ID = 0x2L;
    private static final long INIT_BIT_NOME = 0x4L;
    private long initBits = 0x7L;

    private String cnpj;
    private int id;
    private String nome;
    private ImmutableList.Builder<ReservaHotel> reservas = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Hotel} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Hotel instance) {
      Preconditions.checkNotNull(instance, "instance");
      cnpj(instance.cnpj());
      id(instance.id());
      nome(instance.nome());
      addAllReservas(instance.reservas());
      return this;
    }

    /**
     * Initializes the value for the {@link Hotel#cnpj() cnpj} attribute.
     * @param cnpj The value for cnpj 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cnpj")
    public final Builder cnpj(String cnpj) {
      this.cnpj = Preconditions.checkNotNull(cnpj, "cnpj");
      initBits &= ~INIT_BIT_CNPJ;
      return this;
    }

    /**
     * Initializes the value for the {@link Hotel#id() id} attribute.
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
     * Initializes the value for the {@link Hotel#nome() nome} attribute.
     * @param nome The value for nome 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nome")
    public final Builder nome(String nome) {
      this.nome = Preconditions.checkNotNull(nome, "nome");
      initBits &= ~INIT_BIT_NOME;
      return this;
    }

    /**
     * Adds one element to {@link Hotel#reservas() reservas} list.
     * @param element A reservas element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addReservas(ReservaHotel element) {
      this.reservas.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Hotel#reservas() reservas} list.
     * @param elements An array of reservas elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addReservas(ReservaHotel... elements) {
      this.reservas.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Hotel#reservas() reservas} list.
     * @param elements An iterable of reservas elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reservas")
    public final Builder reservas(Iterable<? extends ReservaHotel> elements) {
      this.reservas = ImmutableList.builder();
      return addAllReservas(elements);
    }

    /**
     * Adds elements to {@link Hotel#reservas() reservas} list.
     * @param elements An iterable of reservas elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllReservas(Iterable<? extends ReservaHotel> elements) {
      this.reservas.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableHotel ImmutableHotel}.
     * @return An immutable instance of Hotel
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHotel build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHotel(cnpj, id, nome, reservas.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CNPJ) != 0) attributes.add("cnpj");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_NOME) != 0) attributes.add("nome");
      return "Cannot build Hotel, some of required attributes are not set " + attributes;
    }
  }
}
