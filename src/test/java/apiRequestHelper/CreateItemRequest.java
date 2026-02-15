package apiRequestHelper;

import apiConfig.ApiRequestConfig;
import apiConfig.EndPoint;
import io.restassured.response.Response;

public class CreateItemRequest {

    public Response createItem(Object requestBody){
        return ApiRequestConfig.post(requestBody, EndPoint.CREATE_ITEM.url);
    }
}
