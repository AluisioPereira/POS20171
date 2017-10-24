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
 * Immutable implementation of {@link ClienteId}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClienteId.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "ClienteId"})
public final class ImmutableClienteId implements ClienteId {
  private final Integer cpf;

  private ImmutableClienteId(Integer cpf) {
    this.cpf = cpf;
  }

  /**
   * @return The value of the {@code cpf} attribute
   */
  @JsonProperty("cpf")
  @Override
  public Integer cpf() {
    return cpf;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClienteId#cpf() cpf} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cpf
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClienteId withCpf(Integer value) {
    if (this.cpf.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "cpf");
    return new ImmutableClienteId(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClienteId} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClienteId
        && equalTo((ImmutableClienteId) another);
  }

  private boolean equalTo(ImmutableClienteId another) {
    return cpf.equals(another.cpf);
  }

  /**
   * Computes a hash code from attributes: {@code cpf}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + cpf.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ClienteId} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ClienteId")
        .omitNullValues()
        .add("cpf", cpf)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClienteId {
    Integer cpf;
    @JsonProperty("cpf")
    public void setCpf(Integer cpf) {
      this.cpf = cpf;
    }
    @Override
    public Integer cpf() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClienteId fromJson(Json json) {
    ImmutableClienteId.Builder builder = ImmutableClienteId.builder();
    if (json.cpf != null) {
      builder.cpf(json.cpf);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClienteId} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClienteId instance
   */
  public static ImmutableClienteId copyOf(ClienteId instance) {
    if (instance instanceof ImmutableClienteId) {
      return (ImmutableClienteId) instance;
    }
    return ImmutableClienteId.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableClienteId ImmutableClienteId}.
   * @return A new ImmutableClienteId builder
   */
  public static ImmutableClienteId.Builder builder() {
    return new ImmutableClienteId.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableClienteId ImmutableClienteId}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CPF = 0x1L;
    private long initBits = 0x1L;

    private Integer cpf;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ClienteId} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ClienteId instance) {
      Preconditions.checkNotNull(instance, "instance");
      cpf(instance.cpf());
      return this;
    }

    /**
     * Initializes the value for the {@link ClienteId#cpf() cpf} attribute.
     * @param cpf The value for cpf 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cpf")
    public final Builder cpf(Integer cpf) {
      this.cpf = Preconditions.checkNotNull(cpf, "cpf");
      initBits &= ~INIT_BIT_CPF;
      return this;
    }

    /**
     * Builds a new {@link ImmutableClienteId ImmutableClienteId}.
     * @return An immutable instance of ClienteId
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableClienteId build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableClienteId(cpf);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CPF) != 0) attributes.add("cpf");
      return "Cannot build ClienteId, some of required attributes are not set " + attributes;
    }
  }
}
