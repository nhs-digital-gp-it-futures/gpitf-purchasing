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
import io.swagger.client.model.CapabilitiesImplementedReviews;
import java.util.ArrayList;
import java.util.List;

/**
 * A paged list of objects
 */
@ApiModel(description = "A paged list of objects")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-09T09:44:06.853Z")
public class PaginatedListIEnumerableCapabilitiesImplementedReviews {
  @JsonProperty("pageIndex")
  private Integer pageIndex = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("items")
  private List<List<CapabilitiesImplementedReviews>> items = null;

  @JsonProperty("hasPreviousPage")
  private Boolean hasPreviousPage = null;

  @JsonProperty("hasNextPage")
  private Boolean hasNextPage = null;

  public PaginatedListIEnumerableCapabilitiesImplementedReviews pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * 1-based index of which page this page  Defaults to 1
   * @return pageIndex
  **/
  @ApiModelProperty(value = "1-based index of which page this page  Defaults to 1")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public PaginatedListIEnumerableCapabilitiesImplementedReviews totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total number of pages based on NHSD.GPITF.BuyingCatalog.Models.PaginatedList&#x60;1.PageSize
   * @return totalPages
  **/
  @ApiModelProperty(value = "Total number of pages based on NHSD.GPITF.BuyingCatalog.Models.PaginatedList`1.PageSize")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public PaginatedListIEnumerableCapabilitiesImplementedReviews pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Maximum number of items in this page  Defaults to 20
   * @return pageSize
  **/
  @ApiModelProperty(value = "Maximum number of items in this page  Defaults to 20")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PaginatedListIEnumerableCapabilitiesImplementedReviews items(List<List<CapabilitiesImplementedReviews>> items) {
    this.items = items;
    return this;
  }

  public PaginatedListIEnumerableCapabilitiesImplementedReviews addItemsItem(List<CapabilitiesImplementedReviews> itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<List<CapabilitiesImplementedReviews>>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of items
   * @return items
  **/
  @ApiModelProperty(value = "List of items")
  public List<List<CapabilitiesImplementedReviews>> getItems() {
    return items;
  }

  public void setItems(List<List<CapabilitiesImplementedReviews>> items) {
    this.items = items;
  }

   /**
   * true if there is a page of items previous to this page
   * @return hasPreviousPage
  **/
  @ApiModelProperty(value = "true if there is a page of items previous to this page")
  public Boolean isHasPreviousPage() {
    return hasPreviousPage;
  }

   /**
   * true if there is a page of items after this page
   * @return hasNextPage
  **/
  @ApiModelProperty(value = "true if there is a page of items after this page")
  public Boolean isHasNextPage() {
    return hasNextPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedListIEnumerableCapabilitiesImplementedReviews paginatedListIEnumerableCapabilitiesImplementedReviews = (PaginatedListIEnumerableCapabilitiesImplementedReviews) o;
    return Objects.equals(this.pageIndex, paginatedListIEnumerableCapabilitiesImplementedReviews.pageIndex) &&
        Objects.equals(this.totalPages, paginatedListIEnumerableCapabilitiesImplementedReviews.totalPages) &&
        Objects.equals(this.pageSize, paginatedListIEnumerableCapabilitiesImplementedReviews.pageSize) &&
        Objects.equals(this.items, paginatedListIEnumerableCapabilitiesImplementedReviews.items) &&
        Objects.equals(this.hasPreviousPage, paginatedListIEnumerableCapabilitiesImplementedReviews.hasPreviousPage) &&
        Objects.equals(this.hasNextPage, paginatedListIEnumerableCapabilitiesImplementedReviews.hasNextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageIndex, totalPages, pageSize, items, hasPreviousPage, hasNextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedListIEnumerableCapabilitiesImplementedReviews {\n");
    
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    hasPreviousPage: ").append(toIndentedString(hasPreviousPage)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
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

