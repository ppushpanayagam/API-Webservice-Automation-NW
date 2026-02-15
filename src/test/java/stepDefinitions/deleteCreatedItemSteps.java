package stepDefinitions;

import apiRequestHelper.GetCreatedItem;
import context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import responseModels.GetItemResponse;
import utils.ResponseHelper;

public class deleteCreatedItemSteps {

    GetCreatedItem getCreatedItem = new GetCreatedItem();
    Response  response;
    ScenarioContext scenarioContext = ScenarioContext.getInstance();
    static String itemId;
    GetItemResponse getItemResponse;

    @Given("the Delete item request set with valid Id")
    public void the_Delete_item_request_set_with_valid_Id(){

        itemId = scenarioContext.getContext("ItemId").toString();
    }

    @Given("the Delete item request set with invalid Id")
    public void the_Delete_item_request_set_with_invalid_Id(){

        itemId = "19999";
    }

    @When("the DELETE request to delete item called")
    public void the_DELETE_request_to_delete_item_called(){

        response = getCreatedItem.getCreatedItem(itemId);
        getItemResponse = ResponseHelper.getItemResponse(response);
    }
}
