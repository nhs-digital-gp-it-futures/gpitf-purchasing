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

import io.swagger.client.model.Contacts;
import io.swagger.client.model.PaginatedListContacts;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Ignore
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    
    /**
     * Retrieve a contacts for an organisation, given the contact’s email address  Email address is case insensitive
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiContactsByEmailByEmailGetTest() {
        String email = null;
        Contacts response = api.apiContactsByEmailByEmailGet(email);

        // TODO: test validations
    }
    
    /**
     * Retrieve a contact for an organisation, given the contact’s CRM identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiContactsByIdByIdGetTest() {
        String id = null;
        Contacts response = api.apiContactsByIdByIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve all contacts for an organisation in a paged list, given the organisation’s CRM identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiContactsByOrganisationByOrganisationIdGetTest() {
        String organisationId = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        PaginatedListContacts response = api.apiContactsByOrganisationByOrganisationIdGet(organisationId, pageIndex, pageSize);

        // TODO: test validations
    }
    
}
