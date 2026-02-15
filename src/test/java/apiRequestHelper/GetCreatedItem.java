package apiRequestHelper;

import apiConfig.ApiRequestConfig;
import apiConfig.EndPoint;
import io.restassured.response.Response;

public class GetCreatedItem {

    public Response getCreatedItem(String itemId){
        return ApiRequestConfig.get(EndPoint.LIST_OF_ITEMS.url, itemId);
    }
}
