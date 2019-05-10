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

/**
 * An agreement between an ‘organisation’ and NHS which allows a ‘solution’ to be purchased.  There may be more than one active or current ‘framework’ at any point in time  Note that a ‘framework’ has a link to zero or one previous ‘framework’  Generally, only interested in current ‘framework’
 */
@ApiModel(description = "An agreement between an ‘organisation’ and NHS which allows a ‘solution’ to be purchased.  There may be more than one active or current ‘framework’ at any point in time  Note that a ‘framework’ has a link to zero or one previous ‘framework’  Generally, only interested in current ‘framework’")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-10T14:20:36.344Z")
public class Frameworks {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("previousId")
  private String previousId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  public Frameworks id(String id) {
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

  public Frameworks previousId(String previousId) {
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

  public Frameworks name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Framework, as displayed to a user
   * @return name
  **/
  @ApiModelProperty(value = "Name of Framework, as displayed to a user")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Frameworks description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of Framework, as displayed to a user
   * @return description
  **/
  @ApiModelProperty(value = "Description of Framework, as displayed to a user")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Frameworks frameworks = (Frameworks) o;
    return Objects.equals(this.id, frameworks.id) &&
        Objects.equals(this.previousId, frameworks.previousId) &&
        Objects.equals(this.name, frameworks.name) &&
        Objects.equals(this.description, frameworks.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, previousId, name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Frameworks {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    previousId: ").append(toIndentedString(previousId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

