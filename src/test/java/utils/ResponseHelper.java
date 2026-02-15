package utils;

import apiRequestHelper.DeleteItem;
import io.restassured.response.Response;
import responseModels.CreateItemResponse;
import responseModels.DeleteItemResponse;
import responseModels.GetItemResponse;

public class ResponseHelper {

    public static CreateItemResponse getCreatedItemResponse(Response response){
        return response.as(CreateItemResponse.class);
    }

    public static GetItemResponse getItemResponse(Response response){
        return response.as(GetItemResponse.class);
    }

    public static DeleteItemResponse getDeletedItemResponse(Response response){
        return response.as(DeleteItemResponse.class);
    }

    public static String getCreatedItemId(Response response){
        return getCreatedItemResponse(response).getId();
    }
}
