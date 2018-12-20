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

import java.io.File;
import io.swagger.client.model.FileResult;
import io.swagger.client.model.PaginatedListBlobInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StandardsApplicableEvidenceBlobStoreApi
 */
@Ignore
public class StandardsApplicableEvidenceBlobStoreApiTest {

    private final StandardsApplicableEvidenceBlobStoreApi api = new StandardsApplicableEvidenceBlobStoreApi();

    
    /**
     * Upload a file to support a claim  If the file already exists on the server, then a new version is created
     *
     * Server side folder structure is something like:  --Organisation  ----Solution  ------Capability Evidence  --------Appointment Management - Citizen  --------Appointment Management - GP  --------Clinical Decision Support  --------[all other claimed capabilities]  ----------Images  ----------PDF  ----------Videos  ----------RTM  ----------Misc                where subFolder is an optional folder under a claimed capability ie Images, PDF, et al
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiStandardsApplicableEvidenceBlobStoreAddEvidenceForClaimPostTest() {
        String claimId = null;
        File file = null;
        String filename = null;
        String subFolder = null;
        String response = api.apiStandardsApplicableEvidenceBlobStoreAddEvidenceForClaimPost(claimId, file, filename, subFolder);

        // TODO: test validations
    }
    
    /**
     * Download a file which is supporting a claim
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiStandardsApplicableEvidenceBlobStoreDownloadByClaimIdPostTest() {
        String claimId = null;
        String uniqueId = null;
        FileResult response = api.apiStandardsApplicableEvidenceBlobStoreDownloadByClaimIdPost(claimId, uniqueId);

        // TODO: test validations
    }
    
    /**
     * List all files and sub-folders for a claim including folder for claim
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiStandardsApplicableEvidenceBlobStoreEnumerateFolderByClaimIdGetTest() {
        String claimId = null;
        String subFolder = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        PaginatedListBlobInfo response = api.apiStandardsApplicableEvidenceBlobStoreEnumerateFolderByClaimIdGet(claimId, subFolder, pageIndex, pageSize);

        // TODO: test validations
    }
    
}
