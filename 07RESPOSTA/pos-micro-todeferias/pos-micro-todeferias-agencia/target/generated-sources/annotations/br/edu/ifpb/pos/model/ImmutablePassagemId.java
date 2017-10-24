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
 * Immutable implementation of {@link PassagemId}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePassagemId.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "PassagemId"})
public final class ImmutablePassagemId implements PassagemId {
  private final Integer cnpjEmpresa;

  private ImmutablePassagemId(Integer cnpjEmpresa) {
    this.cnpjEmpresa = cnpjEmpresa;
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
   * Copy the current immutable object by setting a value for the {@link PassagemId#cnpjEmpresa() cnpjEmpresa} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cnpjEmpresa
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePassagemId withCnpjEmpresa(Integer value) {
    if (this.cnpjEmpresa.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "cnpjEmpresa");
    return new ImmutablePassagemId(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePassagemId} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePassagemId
        && equalTo((ImmutablePassagemId) another);
  }

  private boolean equalTo(ImmutablePassagemId another) {
    return cnpjEmpresa.equals(another.cnpjEmpresa);
  }

  /**
   * Computes a hash code from attributes: {@code cnpjEmpresa}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + cnpjEmpresa.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PassagemId} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PassagemId")
        .omitNullValues()
        .add("cnpjEmpresa", cnpjEmpresa)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PassagemId {
    Integer cnpjEmpresa;
    @JsonProperty("cnpjEmpresa")
    public void setCnpjEmpresa(Integer cnpjEmpresa) {
      this.cnpjEmpresa = cnpjEmpresa;
    }
    @Override
    public Integer cnpjEmpresa() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePassagemId fromJson(Json json) {
    ImmutablePassagemId.Builder builder = ImmutablePassagemId.builder();
    if (json.cnpjEmpresa != null) {
      builder.cnpjEmpresa(json.cnpjEmpresa);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PassagemId} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PassagemId instance
   */
  public static ImmutablePassagemId copyOf(PassagemId instance) {
    if (instance instanceof ImmutablePassagemId) {
      return (ImmutablePassagemId) instance;
    }
    return ImmutablePassagemId.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePassagemId ImmutablePassagemId}.
   * @return A new ImmutablePassagemId builder
   */
  public static ImmutablePassagemId.Builder builder() {
    return new ImmutablePassagemId.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePassagemId ImmutablePassagemId}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CNPJ_EMPRESA = 0x1L;
    private long initBits = 0x1L;

    private Integer cnpjEmpresa;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PassagemId} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PassagemId instance) {
      Preconditions.checkNotNull(instance, "instance");
      cnpjEmpresa(instance.cnpjEmpresa());
      return this;
    }

    /**
     * Initializes the value for the {@link PassagemId#cnpjEmpresa() cnpjEmpresa} attribute.
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
     * Builds a new {@link ImmutablePassagemId ImmutablePassagemId}.
     * @return An immutable instance of PassagemId
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePassagemId build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePassagemId(cnpjEmpresa);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CNPJ_EMPRESA) != 0) attributes.add("cnpjEmpresa");
      return "Cannot build PassagemId, some of required attributes are not set " + attributes;
    }
  }
}
