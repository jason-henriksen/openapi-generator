/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Client;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeClassnameTags123Api {
    private ApiClient localVarApiClient;

    public FakeClassnameTags123Api() {
        this(Configuration.getDefaultApiClient());
    }

    public FakeClassnameTags123Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for testClassname
     * @param body client model (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call testClassnameCall(Client body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/fake_classname_test";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api_key_query" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call testClassnameValidateBeforeCall(Client body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling testClassname(Async)");
        }
        

        okhttp3.Call localVarCall = testClassnameCall(body, _callback);
        return localVarCall;

    }

    /**
     * To test class name in snake case
     * To test class name in snake case
     * @param body client model (required)
     * @return Client
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Client testClassname(Client body) throws ApiException {
        ApiResponse<Client> localVarResp = testClassnameWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * To test class name in snake case
     * To test class name in snake case
     * @param body client model (required)
     * @return ApiResponse&lt;Client&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Client> testClassnameWithHttpInfo(Client body) throws ApiException {
        okhttp3.Call localVarCall = testClassnameValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Client>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * To test class name in snake case (asynchronously)
     * To test class name in snake case
     * @param body client model (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call testClassnameAsync(Client body, final ApiCallback<Client> _callback) throws ApiException {

        okhttp3.Call localVarCall = testClassnameValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<Client>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
