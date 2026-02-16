package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import responseModels.CreateItemResponse;
import responseModels.DeleteItemResponse;
import responseModels.GetItemResponse;
import responseModels.GetListOfAllItemsResponse;

import java.util.List;

public class ResponseHelper {

    public static final ObjectMapper objectMapper = new ObjectMapper();

    public static CreateItemResponse getCreatedItemResponse(Response response){
        return response.as(CreateItemResponse.class);
    }

    public static GetItemResponse getItemResponse(Response response){
        return response.as(GetItemResponse.class);
    }

    public static DeleteItemResponse getDeletedItemResponse(Response response){
        return response.as(DeleteItemResponse.class);
    }

    public static List<GetListOfAllItemsResponse> getAllItemResponse(Response response){
        try{
            return objectMapper.readValue(response.asString(), new TypeReference<List<GetListOfAllItemsResponse>>() {
            });
        } catch (Exception e) {
            throw new RuntimeException("Failed to deserialize: "+e);
        }
    }

    public static String getCreatedItemId(Response response){
        return getCreatedItemResponse(response).getId();
    }
}
