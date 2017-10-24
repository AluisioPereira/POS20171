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
 * Immutable implementation of {@link ReservaPassagem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableReservaPassagem.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ReservaPassagem"})
public final class ImmutableReservaPassagem implements ReservaPassagem {
  private final String codigo;
  private final ClienteId cliente;
  private final int id;
  private final PassagemId passagem;

  private ImmutableReservaPassagem(
      String codigo,
      ClienteId cliente,
      int id,
      PassagemId passagem) {
    this.codigo = codigo;
    this.cliente = cliente;
    this.id = id;
    this.passagem = passagem;
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
   * @return The value of the {@code passagem} attribute
   */
  @JsonProperty("passagem")
  @Override
  public PassagemId passagem() {
    return passagem;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReservaPassagem#codigo() codigo} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for codigo
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReservaPassagem withCodigo(String value) {
    if (this.codigo.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "codigo");
    return new ImmutableReservaPassagem(newValue, this.cliente, this.id, this.passagem);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReservaPassagem#cliente() cliente} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cliente
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReservaPassagem withCliente(ClienteId value) {
    if (this.cliente == value) return this;
    ClienteId newValue = Preconditions.checkNotNull(value, "cliente");
    return new ImmutableReservaPassagem(this.codigo, newValue, this.id, this.passagem);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReservaPassagem#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReservaPassagem withId(int value) {
    if (this.id == value) return this;
    return new ImmutableReservaPassagem(this.codigo, this.cliente, value, this.passagem);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReservaPassagem#passagem() passagem} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for passagem
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReservaPassagem withPassagem(PassagemId value) {
    if (this.passagem == value) return this;
    PassagemId newValue = Preconditions.checkNotNull(value, "passagem");
    return new ImmutableReservaPassagem(this.codigo, this.cliente, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableReservaPassagem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableReservaPassagem
        && equalTo((ImmutableReservaPassagem) another);
  }

  private boolean equalTo(ImmutableReservaPassagem another) {
    return codigo.equals(another.codigo)
        && cliente.equals(another.cliente)
        && id == another.id
        && passagem.equals(another.passagem);
  }

  /**
   * Computes a hash code from attributes: {@code codigo}, {@code cliente}, {@code id}, {@code passagem}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + codigo.hashCode();
    h += (h << 5) + cliente.hashCode();
    h += (h << 5) + id;
    h += (h << 5) + passagem.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ReservaPassagem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ReservaPassagem")
        .omitNullValues()
        .add("codigo", codigo)
        .add("cliente", cliente)
        .add("id", id)
        .add("passagem", passagem)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ReservaPassagem {
    String codigo;
    ClienteId cliente;
    int id;
    boolean idIsSet;
    PassagemId passagem;
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
    @JsonProperty("passagem")
    public void setPassagem(PassagemId passagem) {
      this.passagem = passagem;
    }
    @Override
    public String codigo() { throw new UnsupportedOperationException(); }
    @Override
    public ClienteId cliente() { throw new UnsupportedOperationException(); }
    @Override
    public int id() { throw new UnsupportedOperationException(); }
    @Override
    public PassagemId passagem() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableReservaPassagem fromJson(Json json) {
    ImmutableReservaPassagem.Builder builder = ImmutableReservaPassagem.builder();
    if (json.codigo != null) {
      builder.codigo(json.codigo);
    }
    if (json.cliente != null) {
      builder.cliente(json.cliente);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.passagem != null) {
      builder.passagem(json.passagem);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ReservaPassagem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ReservaPassagem instance
   */
  public static ImmutableReservaPassagem copyOf(ReservaPassagem instance) {
    if (instance instanceof ImmutableReservaPassagem) {
      return (ImmutableReservaPassagem) instance;
    }
    return ImmutableReservaPassagem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableReservaPassagem ImmutableReservaPassagem}.
   * @return A new ImmutableReservaPassagem builder
   */
  public static ImmutableReservaPassagem.Builder builder() {
    return new ImmutableReservaPassagem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableReservaPassagem ImmutableReservaPassagem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CODIGO = 0x1L;
    private static final long INIT_BIT_CLIENTE = 0x2L;
    private static final long INIT_BIT_ID = 0x4L;
    private static final long INIT_BIT_PASSAGEM = 0x8L;
    private long initBits = 0xfL;

    private String codigo;
    private ClienteId cliente;
    private int id;
    private PassagemId passagem;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ReservaPassagem} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ReservaPassagem instance) {
      Preconditions.checkNotNull(instance, "instance");
      codigo(instance.codigo());
      cliente(instance.cliente());
      id(instance.id());
      passagem(instance.passagem());
      return this;
    }

    /**
     * Initializes the value for the {@link ReservaPassagem#codigo() codigo} attribute.
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
     * Initializes the value for the {@link ReservaPassagem#cliente() cliente} attribute.
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
     * Initializes the value for the {@link ReservaPassagem#id() id} attribute.
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
     * Initializes the value for the {@link ReservaPassagem#passagem() passagem} attribute.
     * @param passagem The value for passagem 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("passagem")
    public final Builder passagem(PassagemId passagem) {
      this.passagem = Preconditions.checkNotNull(passagem, "passagem");
      initBits &= ~INIT_BIT_PASSAGEM;
      return this;
    }

    /**
     * Builds a new {@link ImmutableReservaPassagem ImmutableReservaPassagem}.
     * @return An immutable instance of ReservaPassagem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableReservaPassagem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableReservaPassagem(codigo, cliente, id, passagem);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CODIGO) != 0) attributes.add("codigo");
      if ((initBits & INIT_BIT_CLIENTE) != 0) attributes.add("cliente");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_PASSAGEM) != 0) attributes.add("passagem");
      return "Cannot build ReservaPassagem, some of required attributes are not set " + attributes;
    }
  }
}
