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


package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.PaginatedListKeywordCount;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KeywordSearchHistoryApi
 */
@Ignore
public class KeywordSearchHistoryApiTest {

    private final KeywordSearchHistoryApi api = new KeywordSearchHistoryApi();

    
    /**
     * Get keywords and how many times they occurred in a specified UTC date range
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiPorcelainKeywordSearchHistoryGetTest() {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        PaginatedListKeywordCount response = api.apiPorcelainKeywordSearchHistoryGet(startDate, endDate, pageIndex, pageSize);

        // TODO: test validations
    }
    
}
