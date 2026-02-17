package stepDefinitions;

import apiConfig.EndPoint;
import apiConfig.StatusCode;
import apiRequestHelper.CreateItemRequest;
import context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import requestModels.Item;
import org.testng.Assert;
import responseModels.CreateItemResponse;
import schemaValidatorConfig.SchemaFiles;
import schemaValidatorConfig.SchemaValidator;
import utils.ItemBuilder;
import utils.ResponseHelper;


public class createItemSteps {

    private Response response;
    ScenarioContext scenarioContext = ScenarioContext.getInstance();
    CreateItemResponse createItemResponse;
    CreateItemRequest createItemRequest;
    Item item;
    String ENDPOINT;

    @Given("the Create Item POST request set with valid {string} {string} {string} {string} {string}")
    public void the_post_request_set_with_valid_details(
            String name, String year, String price, String cpuModel, String hardDiskSize
    ){
        scenarioContext.setContext("name", name);
        scenarioContext.setContext("year", year);
        scenarioContext.setContext("price", price);
        scenarioContext.setContext("cpuModel", cpuModel);
        scenarioContext.setContext("hardDiskSize", hardDiskSize);

        item = ItemBuilder.buildItem(name, year, price, cpuModel, hardDiskSize);
        ENDPOINT = EndPoint.CREATE_ITEM.url;
    }

    @Given("the Create Item POST request set with invalid endpoint")
    public void the_Create_Item_POST_request_set_with_invalid_endpoint(){
        ENDPOINT = EndPoint.INVALID_CREATE_ITEM.url;
    }

    @When("the POST request to add the item is called")
    public void the_POST_request_to_add_the_item_is_called(){

        createItemRequest = new CreateItemRequest();
        response = createItemRequest.createItem(item, ENDPOINT);
        createItemResponse = ResponseHelper.getCreatedItemResponse(response);
        scenarioContext.setContext("ItemId", createItemResponse.getId());
    }

    @Then("the response code for create item should be {int}")
    public void the_response_code_for_create_item_should_be_200(int statusCode){
        Assert.assertEquals(response.statusCode(), StatusCode.expectedCode(statusCode).code);
    }

    @Then("the response status for create item should be {string}")
    public void the_response_code_for_create_item_should_be_200(String statusMessage){
        Assert.assertEquals(createItemResponse.getError(), statusMessage);
    }

    @Then("the item {string} is created successfully")
    public void the_item_is_created_successfully(String itemName){
        createItemResponse = ResponseHelper.getCreatedItemResponse(response);
        Assert.assertEquals(createItemResponse.getName(), itemName);
        SchemaValidator.verify(response, SchemaFiles.CREATE_ITEM_FILE.fileName);
    }
}
