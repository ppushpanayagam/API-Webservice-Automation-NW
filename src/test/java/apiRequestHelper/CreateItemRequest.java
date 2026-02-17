package apiRequestHelper;

import apiConfig.ApiRequestConfig;
import apiConfig.EndPoint;
import io.restassured.response.Response;

public class CreateItemRequest {

    public Response createItem(Object requestBody, String endPoint){
        return ApiRequestConfig.post(requestBody, endPoint);
    }
}
