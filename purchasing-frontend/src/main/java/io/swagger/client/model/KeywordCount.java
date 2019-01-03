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
 * How may times a keyword has appeared in a search
 */
@ApiModel(description = "How may times a keyword has appeared in a search")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-11T12:47:15.885Z")
public class KeywordCount {
  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("count")
  private Integer count = null;

  public KeywordCount keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Keyword
   * @return keyword
  **/
  @ApiModelProperty(value = "Keyword")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public KeywordCount count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of times this keyword has occurred
   * @return count
  **/
  @ApiModelProperty(value = "Number of times this keyword has occurred")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordCount keywordCount = (KeywordCount) o;
    return Objects.equals(this.keyword, keywordCount.keyword) &&
        Objects.equals(this.count, keywordCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordCount {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
