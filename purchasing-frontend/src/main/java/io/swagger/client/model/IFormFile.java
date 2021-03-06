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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IFormFile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T11:46:50.314Z")
public class IFormFile {
  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("contentDisposition")
  private String contentDisposition = null;

  @JsonProperty("headers")
  private Map<String, List<String>> headers = null;

  @JsonProperty("length")
  private Long length = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("fileName")
  private String fileName = null;

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }

   /**
   * Get contentDisposition
   * @return contentDisposition
  **/
  @ApiModelProperty(value = "")
  public String getContentDisposition() {
    return contentDisposition;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<String>> getHeaders() {
    return headers;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Long getLength() {
    return length;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IFormFile iformFile = (IFormFile) o;
    return Objects.equals(this.contentType, iformFile.contentType) &&
        Objects.equals(this.contentDisposition, iformFile.contentDisposition) &&
        Objects.equals(this.headers, iformFile.headers) &&
        Objects.equals(this.length, iformFile.length) &&
        Objects.equals(this.name, iformFile.name) &&
        Objects.equals(this.fileName, iformFile.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, contentDisposition, headers, length, name, fileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IFormFile {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

