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

import io.swagger.client.model.Capabilities;
import io.swagger.client.model.PaginatedListCapabilities;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CapabilitiesApi
 */
@Ignore
public class CapabilitiesApiTest {

    private final CapabilitiesApi api = new CapabilitiesApi();

    
    /**
     * Get existing Capability/s which are in the given Framework
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiCapabilitiesByFrameworkByFrameworkIdGetTest() {
        String frameworkId = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        PaginatedListCapabilities response = api.apiCapabilitiesByFrameworkByFrameworkIdGet(frameworkId, pageIndex, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get an existing capability given its CRM identifier  Typically used to retrieve previous version
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiCapabilitiesByIdByIdGetTest() {
        String id = null;
        Capabilities response = api.apiCapabilitiesByIdByIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Get several existing capabilities given their CRM identifiers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiCapabilitiesByIdsPostTest() {
        List<String> ids = null;
        List<Capabilities> response = api.apiCapabilitiesByIdsPost(ids);

        // TODO: test validations
    }
    
    /**
     * Get existing Capability/s which require the given/optional Standard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiCapabilitiesByStandardByStandardIdGetTest() {
        String standardId = null;
        Boolean isOptional = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        PaginatedListCapabilities response = api.apiCapabilitiesByStandardByStandardIdGet(standardId, isOptional, pageIndex, pageSize);

        // TODO: test validations
    }
    
    /**
     * Retrieve all current capabilities in a paged list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiCapabilitiesGetTest() {
        Integer pageIndex = null;
        Integer pageSize = null;
        PaginatedListCapabilities response = api.apiCapabilitiesGet(pageIndex, pageSize);

        // TODO: test validations
    }
    
}
