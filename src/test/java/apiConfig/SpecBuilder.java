package apiConfig;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.EnvironmentLoader;

public class SpecBuilder {

    public static RequestSpecification postRequestSpec(Object requestBody){
        return new RequestSpecBuilder()
                .setBaseUri(EnvironmentLoader.getInstance().getBaseUrl())
                .setBody(requestBody)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    public static RequestSpecification getRequestSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(EnvironmentLoader.getInstance().getBaseUrl())
                .log(LogDetail.ALL)
                .build();
    }

    public static RequestSpecification deleteRequestSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(EnvironmentLoader.getInstance().getBaseUrl())
                .log(LogDetail.ALL)
                .build();
    }


    public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }
}
