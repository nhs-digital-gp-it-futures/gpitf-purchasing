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
import io.swagger.client.model.EntityTagHeaderValue;
import org.threeten.bp.OffsetDateTime;

/**
 * FileResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-09T09:44:06.853Z")
public class FileResult {
  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("fileDownloadName")
  private String fileDownloadName = null;

  @JsonProperty("lastModified")
  private OffsetDateTime lastModified = null;

  @JsonProperty("entityTag")
  private EntityTagHeaderValue entityTag = null;

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }

  public FileResult fileDownloadName(String fileDownloadName) {
    this.fileDownloadName = fileDownloadName;
    return this;
  }

   /**
   * Get fileDownloadName
   * @return fileDownloadName
  **/
  @ApiModelProperty(value = "")
  public String getFileDownloadName() {
    return fileDownloadName;
  }

  public void setFileDownloadName(String fileDownloadName) {
    this.fileDownloadName = fileDownloadName;
  }

  public FileResult lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public FileResult entityTag(EntityTagHeaderValue entityTag) {
    this.entityTag = entityTag;
    return this;
  }

   /**
   * Get entityTag
   * @return entityTag
  **/
  @ApiModelProperty(value = "")
  public EntityTagHeaderValue getEntityTag() {
    return entityTag;
  }

  public void setEntityTag(EntityTagHeaderValue entityTag) {
    this.entityTag = entityTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileResult fileResult = (FileResult) o;
    return Objects.equals(this.contentType, fileResult.contentType) &&
        Objects.equals(this.fileDownloadName, fileResult.fileDownloadName) &&
        Objects.equals(this.lastModified, fileResult.lastModified) &&
        Objects.equals(this.entityTag, fileResult.entityTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, fileDownloadName, lastModified, entityTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileResult {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    fileDownloadName: ").append(toIndentedString(fileDownloadName)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    entityTag: ").append(toIndentedString(entityTag)).append("\n");
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

