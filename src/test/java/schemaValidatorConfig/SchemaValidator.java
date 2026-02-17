package schemaValidatorConfig;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class SchemaValidator {

    public static void verify(Response response, String fileName){

        try{
            response.then().assertThat()
                    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("SchemaData/"+fileName));
        } catch (AssertionError e) {
            throw new RuntimeException("Schema Validation Failed: "+e.getMessage());
        }
    }
}
