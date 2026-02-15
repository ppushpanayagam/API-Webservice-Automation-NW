package apiConfig;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiRequestConfig extends SpecBuilder{

    public static Response post(Object requestBody, String endPoint){
        return given(postRequestSpec(requestBody))
                .when().post(endPoint)
                .then().spec(getResponseSpec())
                .extract().response();
    }

    public static Response get(String endpoint){
        return given(getRequestSpec())
                .when().get(endpoint)
                .then().spec(getResponseSpec())
                .extract().response();
    }

    public static Response get(String endpoint, String id){
        return given(getRequestSpec())
                .when().get(endpoint+"/"+id)
                .then().spec(getResponseSpec())
                .extract().response();
    }

    public static Response delete(String endpoint, String itemId){
        return given(deleteRequestSpec())
                .when().delete(endpoint+"/"+itemId)
                .then().spec(getResponseSpec())
                .extract().response();
    }

}
