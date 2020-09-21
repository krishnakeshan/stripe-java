// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ProductCreateParams extends ApiRequestParams {
  /** Whether the product is currently available for purchase. Defaults to {@code true}. */
  @SerializedName("active")
  Boolean active;

  /** A list of up to 5 alphanumeric attributes. Should only be set if type={@code good}. */
  @SerializedName("attributes")
  List<String> attributes;

  /**
   * A short one-line description of the product, meant to be displayable to the customer. May only
   * be set if type={@code good}.
   */
  @SerializedName("caption")
  String caption;

  /**
   * An array of Connect application names or identifiers that should not be able to order the SKUs
   * for this product. May only be set if type={@code good}.
   */
  @SerializedName("deactivate_on")
  List<String> deactivateOn;

  /**
   * The product's description, meant to be displayable to the customer. Use this field to
   * optionally store a long form explanation of the product being sold for your own rendering
   * purposes.
   */
  @SerializedName("description")
  String description;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * An identifier will be randomly generated by Stripe. You can optionally override this ID, but
   * the ID must be unique across all products in your Stripe account.
   */
  @SerializedName("id")
  String id;

  /** A list of up to 8 URLs of images for this product, meant to be displayable to the customer. */
  @SerializedName("images")
  List<String> images;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The product's name, meant to be displayable to the customer. Whenever this product is sold via
   * a subscription, name will show up on associated invoice line item descriptions.
   */
  @SerializedName("name")
  String name;

  /**
   * The dimensions of this product for shipping purposes. A SKU associated with this product can
   * override this value by having its own {@code package_dimensions}. May only be set if
   * type={@code good}.
   */
  @SerializedName("package_dimensions")
  PackageDimensions packageDimensions;

  /**
   * Whether this product is shipped (i.e., physical goods). Defaults to {@code true}. May only be
   * set if type={@code good}.
   */
  @SerializedName("shippable")
  Boolean shippable;

  /**
   * An arbitrary string to be displayed on your customer's credit card or bank statement. While
   * most banks display this information consistently, some may display it incorrectly or not at
   * all.
   *
   * <p>This may be up to 22 characters. The statement description may not include {@code <}, {@code
   * >}, {@code \}, {@code "}, {@code '} characters, and will appear on your customer's statement in
   * capital letters. Non-ASCII characters are automatically stripped. It must contain at least one
   * letter.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * The type of the product. Defaults to {@code service} if not explicitly specified, enabling use
   * of this product with Subscriptions and Plans. Set this parameter to {@code good} to use this
   * product with Orders and SKUs. On API versions before {@code 2018-02-05}, this field defaults to
   * {@code good} for compatibility reasons.
   */
  @SerializedName("type")
  Type type;

  /**
   * A label that represents units of this product in Stripe and on customers’ receipts and
   * invoices. When set, this will be included in associated invoice line item descriptions.
   */
  @SerializedName("unit_label")
  String unitLabel;

  /**
   * A URL of a publicly-accessible webpage for this product. May only be set if type={@code good}.
   */
  @SerializedName("url")
  String url;

  private ProductCreateParams(
      Boolean active,
      List<String> attributes,
      String caption,
      List<String> deactivateOn,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      String id,
      List<String> images,
      Map<String, String> metadata,
      String name,
      PackageDimensions packageDimensions,
      Boolean shippable,
      String statementDescriptor,
      Type type,
      String unitLabel,
      String url) {
    this.active = active;
    this.attributes = attributes;
    this.caption = caption;
    this.deactivateOn = deactivateOn;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.id = id;
    this.images = images;
    this.metadata = metadata;
    this.name = name;
    this.packageDimensions = packageDimensions;
    this.shippable = shippable;
    this.statementDescriptor = statementDescriptor;
    this.type = type;
    this.unitLabel = unitLabel;
    this.url = url;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private List<String> attributes;

    private String caption;

    private List<String> deactivateOn;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String id;

    private List<String> images;

    private Map<String, String> metadata;

    private String name;

    private PackageDimensions packageDimensions;

    private Boolean shippable;

    private String statementDescriptor;

    private Type type;

    private String unitLabel;

    private String url;

    /** Finalize and obtain parameter instance from this builder. */
    public ProductCreateParams build() {
      return new ProductCreateParams(
          this.active,
          this.attributes,
          this.caption,
          this.deactivateOn,
          this.description,
          this.expand,
          this.extraParams,
          this.id,
          this.images,
          this.metadata,
          this.name,
          this.packageDimensions,
          this.shippable,
          this.statementDescriptor,
          this.type,
          this.unitLabel,
          this.url);
    }

    /** Whether the product is currently available for purchase. Defaults to {@code true}. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add an element to `attributes` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ProductCreateParams#attributes} for the field documentation.
     */
    public Builder addAttribute(String element) {
      if (this.attributes == null) {
        this.attributes = new ArrayList<>();
      }
      this.attributes.add(element);
      return this;
    }

    /**
     * Add all elements to `attributes` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ProductCreateParams#attributes} for the field documentation.
     */
    public Builder addAllAttribute(List<String> elements) {
      if (this.attributes == null) {
        this.attributes = new ArrayList<>();
      }
      this.attributes.addAll(elements);
      return this;
    }

    /**
     * A short one-line description of the product, meant to be displayable to the customer. May
     * only be set if type={@code good}.
     */
    public Builder setCaption(String caption) {
      this.caption = caption;
      return this;
    }

    /**
     * Add an element to `deactivateOn` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ProductCreateParams#deactivateOn} for the field documentation.
     */
    public Builder addDeactivateOn(String element) {
      if (this.deactivateOn == null) {
        this.deactivateOn = new ArrayList<>();
      }
      this.deactivateOn.add(element);
      return this;
    }

    /**
     * Add all elements to `deactivateOn` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ProductCreateParams#deactivateOn} for the field documentation.
     */
    public Builder addAllDeactivateOn(List<String> elements) {
      if (this.deactivateOn == null) {
        this.deactivateOn = new ArrayList<>();
      }
      this.deactivateOn.addAll(elements);
      return this;
    }

    /**
     * The product's description, meant to be displayable to the customer. Use this field to
     * optionally store a long form explanation of the product being sold for your own rendering
     * purposes.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProductCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ProductCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * An identifier will be randomly generated by Stripe. You can optionally override this ID, but
     * the ID must be unique across all products in your Stripe account.
     */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /**
     * Add an element to `images` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductCreateParams#images} for the field documentation.
     */
    public Builder addImage(String element) {
      if (this.images == null) {
        this.images = new ArrayList<>();
      }
      this.images.add(element);
      return this;
    }

    /**
     * Add all elements to `images` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductCreateParams#images} for the field documentation.
     */
    public Builder addAllImage(List<String> elements) {
      if (this.images == null) {
        this.images = new ArrayList<>();
      }
      this.images.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProductCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ProductCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The product's name, meant to be displayable to the customer. Whenever this product is sold
     * via a subscription, name will show up on associated invoice line item descriptions.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * The dimensions of this product for shipping purposes. A SKU associated with this product can
     * override this value by having its own {@code package_dimensions}. May only be set if
     * type={@code good}.
     */
    public Builder setPackageDimensions(PackageDimensions packageDimensions) {
      this.packageDimensions = packageDimensions;
      return this;
    }

    /**
     * Whether this product is shipped (i.e., physical goods). Defaults to {@code true}. May only be
     * set if type={@code good}.
     */
    public Builder setShippable(Boolean shippable) {
      this.shippable = shippable;
      return this;
    }

    /**
     * An arbitrary string to be displayed on your customer's credit card or bank statement. While
     * most banks display this information consistently, some may display it incorrectly or not at
     * all.
     *
     * <p>This may be up to 22 characters. The statement description may not include {@code <},
     * {@code >}, {@code \}, {@code "}, {@code '} characters, and will appear on your customer's
     * statement in capital letters. Non-ASCII characters are automatically stripped. It must
     * contain at least one letter.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * The type of the product. Defaults to {@code service} if not explicitly specified, enabling
     * use of this product with Subscriptions and Plans. Set this parameter to {@code good} to use
     * this product with Orders and SKUs. On API versions before {@code 2018-02-05}, this field
     * defaults to {@code good} for compatibility reasons.
     */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }

    /**
     * A label that represents units of this product in Stripe and on customers’ receipts and
     * invoices. When set, this will be included in associated invoice line item descriptions.
     */
    public Builder setUnitLabel(String unitLabel) {
      this.unitLabel = unitLabel;
      return this;
    }

    /**
     * A URL of a publicly-accessible webpage for this product. May only be set if type={@code
     * good}.
     */
    public Builder setUrl(String url) {
      this.url = url;
      return this;
    }
  }

  @Getter
  public static class PackageDimensions {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Height, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("height")
    BigDecimal height;

    /** Length, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("length")
    BigDecimal length;

    /** Weight, in ounces. Maximum precision is 2 decimal places. */
    @SerializedName("weight")
    BigDecimal weight;

    /** Width, in inches. Maximum precision is 2 decimal places. */
    @SerializedName("width")
    BigDecimal width;

    private PackageDimensions(
        Map<String, Object> extraParams,
        BigDecimal height,
        BigDecimal length,
        BigDecimal weight,
        BigDecimal width) {
      this.extraParams = extraParams;
      this.height = height;
      this.length = length;
      this.weight = weight;
      this.width = width;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private BigDecimal height;

      private BigDecimal length;

      private BigDecimal weight;

      private BigDecimal width;

      /** Finalize and obtain parameter instance from this builder. */
      public PackageDimensions build() {
        return new PackageDimensions(
            this.extraParams, this.height, this.length, this.weight, this.width);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ProductCreateParams.PackageDimensions#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link ProductCreateParams.PackageDimensions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Height, in inches. Maximum precision is 2 decimal places. */
      public Builder setHeight(BigDecimal height) {
        this.height = height;
        return this;
      }

      /** Length, in inches. Maximum precision is 2 decimal places. */
      public Builder setLength(BigDecimal length) {
        this.length = length;
        return this;
      }

      /** Weight, in ounces. Maximum precision is 2 decimal places. */
      public Builder setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
      }

      /** Width, in inches. Maximum precision is 2 decimal places. */
      public Builder setWidth(BigDecimal width) {
        this.width = width;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("good")
    GOOD("good"),

    @SerializedName("service")
    SERVICE("service");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
