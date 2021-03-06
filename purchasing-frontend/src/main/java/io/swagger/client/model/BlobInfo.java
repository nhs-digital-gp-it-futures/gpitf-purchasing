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
 * Information about a folder or file in blob datastore,  typically SharePoint
 */
@ApiModel(description = "Information about a folder or file in blob datastore,  typically SharePoint")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T11:46:50.314Z")
public class BlobInfo {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isFolder")
  private Boolean isFolder = null;

  @JsonProperty("length")
  private Long length = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("timeLastModified")
  private OffsetDateTime timeLastModified = null;

  @JsonProperty("blobId")
  private String blobId = null;

  public BlobInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of entity
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of entity")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BlobInfo parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Unique identifier of parent/owner of this entity  Will be null if this is the root entity
   * @return parentId
  **/
  @ApiModelProperty(value = "Unique identifier of parent/owner of this entity  Will be null if this is the root entity")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public BlobInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name
   * @return name
  **/
  @ApiModelProperty(value = "Display name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BlobInfo isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

   /**
   * true if object is a folder
   * @return isFolder
  **/
  @ApiModelProperty(value = "true if object is a folder")
  public Boolean isIsFolder() {
    return isFolder;
  }

  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }

  public BlobInfo length(Long length) {
    this.length = length;
    return this;
  }

   /**
   * size of file in bytes (zero for a folder)
   * @return length
  **/
  @ApiModelProperty(value = "size of file in bytes (zero for a folder)")
  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public BlobInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Externally accessible URL
   * @return url
  **/
  @ApiModelProperty(value = "Externally accessible URL")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public BlobInfo timeLastModified(OffsetDateTime timeLastModified) {
    this.timeLastModified = timeLastModified;
    return this;
  }

   /**
   * UTC when last modified
   * @return timeLastModified
  **/
  @ApiModelProperty(value = "UTC when last modified")
  public OffsetDateTime getTimeLastModified() {
    return timeLastModified;
  }

  public void setTimeLastModified(OffsetDateTime timeLastModified) {
    this.timeLastModified = timeLastModified;
  }

  public BlobInfo blobId(String blobId) {
    this.blobId = blobId;
    return this;
  }

   /**
   * unique identifier of binary file in blob storage system  (null for a folder)  NOTE:  this may not be a GUID eg it may be a URL  NOTE:  this is a GUID for SharePoint
   * @return blobId
  **/
  @ApiModelProperty(value = "unique identifier of binary file in blob storage system  (null for a folder)  NOTE:  this may not be a GUID eg it may be a URL  NOTE:  this is a GUID for SharePoint")
  public String getBlobId() {
    return blobId;
  }

  public void setBlobId(String blobId) {
    this.blobId = blobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlobInfo blobInfo = (BlobInfo) o;
    return Objects.equals(this.id, blobInfo.id) &&
        Objects.equals(this.parentId, blobInfo.parentId) &&
        Objects.equals(this.name, blobInfo.name) &&
        Objects.equals(this.isFolder, blobInfo.isFolder) &&
        Objects.equals(this.length, blobInfo.length) &&
        Objects.equals(this.url, blobInfo.url) &&
        Objects.equals(this.timeLastModified, blobInfo.timeLastModified) &&
        Objects.equals(this.blobId, blobInfo.blobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, name, isFolder, length, url, timeLastModified, blobId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlobInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    timeLastModified: ").append(toIndentedString(timeLastModified)).append("\n");
    sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
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

