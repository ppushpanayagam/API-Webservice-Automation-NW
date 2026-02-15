package stepDefinitions;

import apiRequestHelper.GetCreatedItem;
import context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import responseModels.GetItemResponse;
import utils.ResponseHelper;

public class getSelectedItemSteps {

    GetCreatedItem getCreatedItem = new GetCreatedItem();
    Response  response;
    ScenarioContext scenarioContext = ScenarioContext.getInstance();
    static String itemId;
    GetItemResponse getItemResponse;

    @Given("the Get item request set with valid Id")
    public void the_Get_item_request_set_with_valid_Id(){

        itemId = scenarioContext.getContext("ItemId").toString();
    }

    @Given("the Get item request set with invalid Id")
    public void the_Get_item_request_set_with_invalid_Id(){

        itemId = "19999";
    }

    @When("the GET request for get item called")
    public void the_GET_request_for_get_item_called(){

        response = getCreatedItem.getCreatedItem(itemId);
        getItemResponse = ResponseHelper.getItemResponse(response);
    }
}
