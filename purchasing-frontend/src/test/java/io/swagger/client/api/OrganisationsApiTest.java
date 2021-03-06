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

import io.swagger.client.model.Organisations;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganisationsApi
 */
@Ignore
public class OrganisationsApiTest {

    private final OrganisationsApi api = new OrganisationsApi();

    
    /**
     * Retrieve an Organisation for the given Contact
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiOrganisationsByContactByContactIdGetTest() {
        String contactId = null;
        Organisations response = api.apiOrganisationsByContactByContactIdGet(contactId);

        // TODO: test validations
    }
    
}
