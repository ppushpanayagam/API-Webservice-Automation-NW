package utils;

import io.restassured.response.Response;
import responseModels.CreateItemResponse;
import responseModels.GetItemResponse;

public class ResponseHelper {

    public static CreateItemResponse getCreatedItemResponse(Response response){
        return response.as(CreateItemResponse.class);
    }

    public static GetItemResponse getItemResponse(Response response){
        return response.as(GetItemResponse.class);
    }

    public static String getCreatedItemId(Response response){
        return getCreatedItemResponse(response).getId();
    }
}
