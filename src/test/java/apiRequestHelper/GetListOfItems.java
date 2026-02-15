package apiRequestHelper;

import apiConfig.ApiRequestConfig;
import apiConfig.EndPoint;
import io.restassured.response.Response;

public class GetListOfItems {
    public Response getListOfCreatedItems(){
        return ApiRequestConfig.get(EndPoint.LIST_OF_ITEMS.url);
    }
}
