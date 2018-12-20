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

import io.swagger.client.model.CapabilitiesImplementedEvidence;
import io.swagger.client.model.PaginatedListIEnumerableCapabilitiesImplementedEvidence;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CapabilitiesImplementedEvidenceApi
 */
@Ignore
public class CapabilitiesImplementedEvidenceApiTest {

    private final CapabilitiesImplementedEvidenceApi api = new CapabilitiesImplementedEvidenceApi();

    
    /**
     * Get all Evidence for the given Claim  Each list is a distinct &#39;chain&#39; of Evidence ie original Evidence with all subsequent Evidence  The first item in each &#39;chain&#39; is the most current Evidence.  The last item in each &#39;chain&#39; is the original Evidence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiCapabilitiesImplementedEvidenceByClaimByClaimIdGetTest() {
        String claimId = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        PaginatedListIEnumerableCapabilitiesImplementedEvidence response = api.apiCapabilitiesImplementedEvidenceByClaimByClaimIdGet(claimId, pageIndex, pageSize);

        // TODO: test validations
    }
    
    /**
     * Create a new evidence
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiCapabilitiesImplementedEvidencePostTest() {
        CapabilitiesImplementedEvidence evidence = null;
        CapabilitiesImplementedEvidence response = api.apiCapabilitiesImplementedEvidencePost(evidence);

        // TODO: test validations
    }
    
}
