package br.edu.ifpb.pos.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Cliente}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCliente.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Cliente"})
public final class ImmutableCliente implements Cliente {
  private final String cpf;
  private final int id;
  private final String nome;
  private final double renda;

  private ImmutableCliente(String cpf, int id, String nome, double renda) {
    this.cpf = cpf;
    this.id = id;
    this.nome = nome;
    this.renda = renda;
  }

  /**
   * @return The value of the {@code cpf} attribute
   */
  @JsonProperty("cpf")
  @Override
  public String cpf() {
    return cpf;
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
   * @return The value of the {@code renda} attribute
   */
  @JsonProperty("renda")
  @Override
  public double renda() {
    return renda;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Cliente#cpf() cpf} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cpf
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCliente withCpf(String value) {
    if (this.cpf.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "cpf");
    return new ImmutableCliente(newValue, this.id, this.nome, this.renda);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Cliente#id() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCliente withId(int value) {
    if (this.id == value) return this;
    return new ImmutableCliente(this.cpf, value, this.nome, this.renda);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Cliente#nome() nome} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCliente withNome(String value) {
    if (this.nome.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "nome");
    return new ImmutableCliente(this.cpf, this.id, newValue, this.renda);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Cliente#renda() renda} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for renda
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCliente withRenda(double value) {
    if (Double.doubleToLongBits(this.renda) == Double.doubleToLongBits(value)) return this;
    return new ImmutableCliente(this.cpf, this.id, this.nome, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCliente} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCliente
        && equalTo((ImmutableCliente) another);
  }

  private boolean equalTo(ImmutableCliente another) {
    return cpf.equals(another.cpf)
        && id == another.id
        && nome.equals(another.nome)
        && Double.doubleToLongBits(renda) == Double.doubleToLongBits(another.renda);
  }

  /**
   * Computes a hash code from attributes: {@code cpf}, {@code id}, {@code nome}, {@code renda}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + cpf.hashCode();
    h += (h << 5) + id;
    h += (h << 5) + nome.hashCode();
    h += (h << 5) + Double.valueOf(renda).hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Cliente} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Cliente{"
        + "cpf=" + cpf
        + ", id=" + id
        + ", nome=" + nome
        + ", renda=" + renda
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Cliente {
    String cpf;
    int id;
    boolean idIsSet;
    String nome;
    double renda;
    boolean rendaIsSet;
    @JsonProperty("cpf")
    public void setCpf(String cpf) {
      this.cpf = cpf;
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
    @JsonProperty("renda")
    public void setRenda(double renda) {
      this.renda = renda;
      this.rendaIsSet = true;
    }
    @Override
    public String cpf() { throw new UnsupportedOperationException(); }
    @Override
    public int id() { throw new UnsupportedOperationException(); }
    @Override
    public String nome() { throw new UnsupportedOperationException(); }
    @Override
    public double renda() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCliente fromJson(Json json) {
    ImmutableCliente.Builder builder = ImmutableCliente.builder();
    if (json.cpf != null) {
      builder.cpf(json.cpf);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nome != null) {
      builder.nome(json.nome);
    }
    if (json.rendaIsSet) {
      builder.renda(json.renda);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Cliente} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Cliente instance
   */
  public static ImmutableCliente copyOf(Cliente instance) {
    if (instance instanceof ImmutableCliente) {
      return (ImmutableCliente) instance;
    }
    return ImmutableCliente.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCliente ImmutableCliente}.
   * @return A new ImmutableCliente builder
   */
  public static ImmutableCliente.Builder builder() {
    return new ImmutableCliente.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCliente ImmutableCliente}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CPF = 0x1L;
    private static final long INIT_BIT_ID = 0x2L;
    private static final long INIT_BIT_NOME = 0x4L;
    private static final long INIT_BIT_RENDA = 0x8L;
    private long initBits = 0xfL;

    private String cpf;
    private int id;
    private String nome;
    private double renda;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Cliente} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Cliente instance) {
      Objects.requireNonNull(instance, "instance");
      cpf(instance.cpf());
      id(instance.id());
      nome(instance.nome());
      renda(instance.renda());
      return this;
    }

    /**
     * Initializes the value for the {@link Cliente#cpf() cpf} attribute.
     * @param cpf The value for cpf 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cpf")
    public final Builder cpf(String cpf) {
      this.cpf = Objects.requireNonNull(cpf, "cpf");
      initBits &= ~INIT_BIT_CPF;
      return this;
    }

    /**
     * Initializes the value for the {@link Cliente#id() id} attribute.
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
     * Initializes the value for the {@link Cliente#nome() nome} attribute.
     * @param nome The value for nome 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nome")
    public final Builder nome(String nome) {
      this.nome = Objects.requireNonNull(nome, "nome");
      initBits &= ~INIT_BIT_NOME;
      return this;
    }

    /**
     * Initializes the value for the {@link Cliente#renda() renda} attribute.
     * @param renda The value for renda 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("renda")
    public final Builder renda(double renda) {
      this.renda = renda;
      initBits &= ~INIT_BIT_RENDA;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCliente ImmutableCliente}.
     * @return An immutable instance of Cliente
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCliente build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCliente(cpf, id, nome, renda);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_CPF) != 0) attributes.add("cpf");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_NOME) != 0) attributes.add("nome");
      if ((initBits & INIT_BIT_RENDA) != 0) attributes.add("renda");
      return "Cannot build Cliente, some of required attributes are not set " + attributes;
    }
  }
}
