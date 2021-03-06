/*
 * catalogue-api
 * NHS Digital GP IT Futures Buying Catalog API
 *
 * OpenAPI spec version: 1.0.0-private-beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * Initially, a &#39;message&#39; or response to &#39;evidence&#39; which supports a claim to a ‘capability’.  Thereafter, this will be a response to a previous message/response.
 */
@ApiModel(description = "Initially, a 'message' or response to 'evidence' which supports a claim to a ‘capability’.  Thereafter, this will be a response to a previous message/response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T11:46:50.314Z")
public class CapabilitiesImplementedReviews {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("previousId")
  private String previousId = null;

  @JsonProperty("evidenceId")
  private String evidenceId = null;

  @JsonProperty("createdById")
  private String createdById = null;

  @JsonProperty("createdOn")
  private OffsetDateTime createdOn = null;

  @JsonProperty("message")
  private String message = null;

  public CapabilitiesImplementedReviews id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of entity
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of entity")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CapabilitiesImplementedReviews previousId(String previousId) {
    this.previousId = previousId;
    return this;
  }

   /**
   * Unique identifier of previous version of entity
   * @return previousId
  **/
  @ApiModelProperty(value = "Unique identifier of previous version of entity")
  public String getPreviousId() {
    return previousId;
  }

  public void setPreviousId(String previousId) {
    this.previousId = previousId;
  }

  public CapabilitiesImplementedReviews evidenceId(String evidenceId) {
    this.evidenceId = evidenceId;
    return this;
  }

   /**
   * Unique identifier of associated Evidence
   * @return evidenceId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of associated Evidence")
  public String getEvidenceId() {
    return evidenceId;
  }

  public void setEvidenceId(String evidenceId) {
    this.evidenceId = evidenceId;
  }

  public CapabilitiesImplementedReviews createdById(String createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Unique identifier of Contact who created record  Derived from calling context  SET ON SERVER
   * @return createdById
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of Contact who created record  Derived from calling context  SET ON SERVER")
  public String getCreatedById() {
    return createdById;
  }

  public void setCreatedById(String createdById) {
    this.createdById = createdById;
  }

  public CapabilitiesImplementedReviews createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * UTC date and time at which record created  Set by server when creating record  SET ON SERVER
   * @return createdOn
  **/
  @ApiModelProperty(value = "UTC date and time at which record created  Set by server when creating record  SET ON SERVER")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public CapabilitiesImplementedReviews message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Serialised message data
   * @return message
  **/
  @ApiModelProperty(value = "Serialised message data")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapabilitiesImplementedReviews capabilitiesImplementedReviews = (CapabilitiesImplementedReviews) o;
    return Objects.equals(this.id, capabilitiesImplementedReviews.id) &&
        Objects.equals(this.previousId, capabilitiesImplementedReviews.previousId) &&
        Objects.equals(this.evidenceId, capabilitiesImplementedReviews.evidenceId) &&
        Objects.equals(this.createdById, capabilitiesImplementedReviews.createdById) &&
        Objects.equals(this.createdOn, capabilitiesImplementedReviews.createdOn) &&
        Objects.equals(this.message, capabilitiesImplementedReviews.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, previousId, evidenceId, createdById, createdOn, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapabilitiesImplementedReviews {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    previousId: ").append(toIndentedString(previousId)).append("\n");
    sb.append("    evidenceId: ").append(toIndentedString(evidenceId)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

