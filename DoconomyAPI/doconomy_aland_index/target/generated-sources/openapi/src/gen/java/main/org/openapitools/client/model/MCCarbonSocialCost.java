/*
 * Doconomy Aland Index
 * OpenAPI Specification for Doconomy Aland Index. For additional documentation and use cases, go to [Mastercard Developers](https://developer.mastercard.com/product/doconomy-aland-index).
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The response object that contains a transaction&#39;s social cost of carbon use.
 */
@ApiModel(description = "The response object that contains a transaction's social cost of carbon use.")

public class MCCarbonSocialCost {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;


  public MCCarbonSocialCost value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Actual value of CarbonSocialCost
   * minimum: -1000000000
   * maximum: 1000000000
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Actual value of CarbonSocialCost")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public MCCarbonSocialCost currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency code as per ISO 4217
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency code as per ISO 4217")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MCCarbonSocialCost mcCarbonSocialCost = (MCCarbonSocialCost) o;
    return Objects.equals(this.value, mcCarbonSocialCost.value) &&
        Objects.equals(this.currencyCode, mcCarbonSocialCost.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MCCarbonSocialCost {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
