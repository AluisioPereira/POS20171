package br.edu.ifpb.pos.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link ReservaHotel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableReservaHotel.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ReservaHotel"})
public final class ImmutableReservaHotel implements ReservaHotel {
  private final String codigo;
  private final ClienteId cliente;
  private final int id;
  private final HotelId hotel;

  private ImmutableReservaHotel(
      String codigo,
      ClienteId cliente,
      int id,
      HotelId hotel) {
    this.codigo = codigo;
    this.cliente = cliente;
    this.id = id;
    this.hotel = hotel;
  }

  /**
   * @return The value of the {@code codigo} attribute
   */
  @JsonProperty("codigo")
  @Override
  public String codigo() {
    return codigo;
  }

  /**
   * @return The value of the {@code cliente} attribute
   */
  @JsonProperty("cliente")
  @Override
  public ClienteId cliente() {
    return cliente;
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
   * @return The value of the {@code hotel} attribute
   */
  @JsonProperty("hotel")
  @Override
  public HotelId hotel() {
    return hotel;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReservaHotel#codigo() codigo} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for codigo
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReservaHotel withCodigo(String value) {
    if (this.codigo.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "codigo");
    return new ImmutableReservaHotel(newValue, this.cliente, this.id, this.hotel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReservaHotel#cliente() cliente} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cliente
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReservaHotel withCliente(ClienteId value) {
    if (this.cliente == value) return this;
    ClienteId newValue = Preconditions.checkNotNull(value, "cliente");
    return new ImmutableReservaHotel(this.codigo, newValue, this.id, this.hotel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReservaHotel#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReservaHotel withId(int value) {
    if (this.id == value) return this;
    return new ImmutableReservaHotel(this.codigo, this.cliente, value, this.hotel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReservaHotel#hotel() hotel} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hotel
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReservaHotel withHotel(HotelId value) {
    if (this.hotel == value) return this;
    HotelId newValue = Preconditions.checkNotNull(value, "hotel");
    return new ImmutableReservaHotel(this.codigo, this.cliente, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableReservaHotel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableReservaHotel
        && equalTo((ImmutableReservaHotel) another);
  }

  private boolean equalTo(ImmutableReservaHotel another) {
    return codigo.equals(another.codigo)
        && cliente.equals(another.cliente)
        && id == another.id
        && hotel.equals(another.hotel);
  }

  /**
   * Computes a hash code from attributes: {@code codigo}, {@code cliente}, {@code id}, {@code hotel}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + codigo.hashCode();
    h += (h << 5) + cliente.hashCode();
    h += (h << 5) + id;
    h += (h << 5) + hotel.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ReservaHotel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ReservaHotel")
        .omitNullValues()
        .add("codigo", codigo)
        .add("cliente", cliente)
        .add("id", id)
        .add("hotel", hotel)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ReservaHotel {
    String codigo;
    ClienteId cliente;
    int id;
    boolean idIsSet;
    HotelId hotel;
    @JsonProperty("codigo")
    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }
    @JsonProperty("cliente")
    public void setCliente(ClienteId cliente) {
      this.cliente = cliente;
    }
    @JsonProperty("id")
    public void setId(int id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("hotel")
    public void setHotel(HotelId hotel) {
      this.hotel = hotel;
    }
    @Override
    public String codigo() { throw new UnsupportedOperationException(); }
    @Override
    public ClienteId cliente() { throw new UnsupportedOperationException(); }
    @Override
    public int id() { throw new UnsupportedOperationException(); }
    @Override
    public HotelId hotel() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableReservaHotel fromJson(Json json) {
    ImmutableReservaHotel.Builder builder = ImmutableReservaHotel.builder();
    if (json.codigo != null) {
      builder.codigo(json.codigo);
    }
    if (json.cliente != null) {
      builder.cliente(json.cliente);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.hotel != null) {
      builder.hotel(json.hotel);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ReservaHotel} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ReservaHotel instance
   */
  public static ImmutableReservaHotel copyOf(ReservaHotel instance) {
    if (instance instanceof ImmutableReservaHotel) {
      return (ImmutableReservaHotel) instance;
    }
    return ImmutableReservaHotel.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableReservaHotel ImmutableReservaHotel}.
   * @return A new ImmutableReservaHotel builder
   */
  public static ImmutableReservaHotel.Builder builder() {
    return new ImmutableReservaHotel.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableReservaHotel ImmutableReservaHotel}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CODIGO = 0x1L;
    private static final long INIT_BIT_CLIENTE = 0x2L;
    private static final long INIT_BIT_ID = 0x4L;
    private static final long INIT_BIT_HOTEL = 0x8L;
    private long initBits = 0xfL;

    private String codigo;
    private ClienteId cliente;
    private int id;
    private HotelId hotel;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ReservaHotel} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ReservaHotel instance) {
      Preconditions.checkNotNull(instance, "instance");
      codigo(instance.codigo());
      cliente(instance.cliente());
      id(instance.id());
      hotel(instance.hotel());
      return this;
    }

    /**
     * Initializes the value for the {@link ReservaHotel#codigo() codigo} attribute.
     * @param codigo The value for codigo 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("codigo")
    public final Builder codigo(String codigo) {
      this.codigo = Preconditions.checkNotNull(codigo, "codigo");
      initBits &= ~INIT_BIT_CODIGO;
      return this;
    }

    /**
     * Initializes the value for the {@link ReservaHotel#cliente() cliente} attribute.
     * @param cliente The value for cliente 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cliente")
    public final Builder cliente(ClienteId cliente) {
      this.cliente = Preconditions.checkNotNull(cliente, "cliente");
      initBits &= ~INIT_BIT_CLIENTE;
      return this;
    }

    /**
     * Initializes the value for the {@link ReservaHotel#id() id} attribute.
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
     * Initializes the value for the {@link ReservaHotel#hotel() hotel} attribute.
     * @param hotel The value for hotel 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hotel")
    public final Builder hotel(HotelId hotel) {
      this.hotel = Preconditions.checkNotNull(hotel, "hotel");
      initBits &= ~INIT_BIT_HOTEL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableReservaHotel ImmutableReservaHotel}.
     * @return An immutable instance of ReservaHotel
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableReservaHotel build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableReservaHotel(codigo, cliente, id, hotel);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CODIGO) != 0) attributes.add("codigo");
      if ((initBits & INIT_BIT_CLIENTE) != 0) attributes.add("cliente");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_HOTEL) != 0) attributes.add("hotel");
      return "Cannot build ReservaHotel, some of required attributes are not set " + attributes;
    }
  }
}
