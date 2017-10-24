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
 * Immutable implementation of {@link HotelId}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHotelId.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "HotelId"})
public final class ImmutableHotelId implements HotelId {
  private final Integer cnpjHotel;

  private ImmutableHotelId(Integer cnpjHotel) {
    this.cnpjHotel = cnpjHotel;
  }

  /**
   * @return The value of the {@code cnpjHotel} attribute
   */
  @JsonProperty("cnpjHotel")
  @Override
  public Integer cnpjHotel() {
    return cnpjHotel;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HotelId#cnpjHotel() cnpjHotel} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cnpjHotel
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHotelId withCnpjHotel(Integer value) {
    if (this.cnpjHotel.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "cnpjHotel");
    return new ImmutableHotelId(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHotelId} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHotelId
        && equalTo((ImmutableHotelId) another);
  }

  private boolean equalTo(ImmutableHotelId another) {
    return cnpjHotel.equals(another.cnpjHotel);
  }

  /**
   * Computes a hash code from attributes: {@code cnpjHotel}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + cnpjHotel.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code HotelId} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HotelId")
        .omitNullValues()
        .add("cnpjHotel", cnpjHotel)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements HotelId {
    Integer cnpjHotel;
    @JsonProperty("cnpjHotel")
    public void setCnpjHotel(Integer cnpjHotel) {
      this.cnpjHotel = cnpjHotel;
    }
    @Override
    public Integer cnpjHotel() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableHotelId fromJson(Json json) {
    ImmutableHotelId.Builder builder = ImmutableHotelId.builder();
    if (json.cnpjHotel != null) {
      builder.cnpjHotel(json.cnpjHotel);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link HotelId} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HotelId instance
   */
  public static ImmutableHotelId copyOf(HotelId instance) {
    if (instance instanceof ImmutableHotelId) {
      return (ImmutableHotelId) instance;
    }
    return ImmutableHotelId.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHotelId ImmutableHotelId}.
   * @return A new ImmutableHotelId builder
   */
  public static ImmutableHotelId.Builder builder() {
    return new ImmutableHotelId.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHotelId ImmutableHotelId}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CNPJ_HOTEL = 0x1L;
    private long initBits = 0x1L;

    private Integer cnpjHotel;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HotelId} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(HotelId instance) {
      Preconditions.checkNotNull(instance, "instance");
      cnpjHotel(instance.cnpjHotel());
      return this;
    }

    /**
     * Initializes the value for the {@link HotelId#cnpjHotel() cnpjHotel} attribute.
     * @param cnpjHotel The value for cnpjHotel 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cnpjHotel")
    public final Builder cnpjHotel(Integer cnpjHotel) {
      this.cnpjHotel = Preconditions.checkNotNull(cnpjHotel, "cnpjHotel");
      initBits &= ~INIT_BIT_CNPJ_HOTEL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHotelId ImmutableHotelId}.
     * @return An immutable instance of HotelId
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHotelId build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHotelId(cnpjHotel);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CNPJ_HOTEL) != 0) attributes.add("cnpjHotel");
      return "Cannot build HotelId, some of required attributes are not set " + attributes;
    }
  }
}
