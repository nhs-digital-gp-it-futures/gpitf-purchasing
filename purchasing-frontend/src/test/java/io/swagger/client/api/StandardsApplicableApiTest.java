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

import io.swagger.client.model.PaginatedListStandardsApplicable;
import io.swagger.client.model.StandardsApplicable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StandardsApplicableApi
 */
@Ignore
public class StandardsApplicableApiTest {

    private final StandardsApplicableApi api = new StandardsApplicableApi();

    
    /**
     * Retrieve claim, given the claim’s CRM identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiStandardsApplicableByIdGetTest() {
        String id = null;
        StandardsApplicable response = api.apiStandardsApplicableByIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve all claimed standards for a solution in a paged list,   given the solution’s CRM identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiStandardsApplicableBySolutionBySolutionIdGetTest() {
        String solutionId = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        PaginatedListStandardsApplicable response = api.apiStandardsApplicableBySolutionBySolutionIdGet(solutionId, pageIndex, pageSize);

        // TODO: test validations
    }
    
    /**
     * Delete an existing claimed standard for a solution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiStandardsApplicableDeleteTest() {
        StandardsApplicable claimedstandard = null;
        api.apiStandardsApplicableDelete(claimedstandard);

        // TODO: test validations
    }
    
    /**
     * Create a new claimed standard for a solution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiStandardsApplicablePostTest() {
        StandardsApplicable claimedstandard = null;
        StandardsApplicable response = api.apiStandardsApplicablePost(claimedstandard);

        // TODO: test validations
    }
    
    /**
     * Update an existing claimed standard with new information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiStandardsApplicablePutTest() {
        StandardsApplicable claimedstandard = null;
        api.apiStandardsApplicablePut(claimedstandard);

        // TODO: test validations
    }
    
}
