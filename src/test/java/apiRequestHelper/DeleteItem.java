package apiRequestHelper;

import apiConfig.ApiRequestConfig;
import apiConfig.EndPoint;
import io.restassured.response.Response;

public class DeleteItem {
    public Response deleteCreatedItem(String itemId){
        return ApiRequestConfig.delete(EndPoint.CREATE_ITEM.url, itemId);
    }
}
