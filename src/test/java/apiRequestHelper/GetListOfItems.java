package apiRequestHelper;

import apiConfig.ApiRequestConfig;
import apiConfig.EndPoint;
import io.restassured.response.Response;

public class GetListOfItems {
    public Response getListOfCreatedItems(String endpoint){
        return ApiRequestConfig.get(endpoint);
    }
}
