package stepDefinitions;

import apiRequestHelper.DeleteItem;
import apiRequestHelper.GetCreatedItem;
import context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import responseModels.DeleteItemResponse;
import responseModels.GetItemResponse;
import utils.ResponseHelper;

public class deleteCreatedItemSteps {

    DeleteItem deleteItem = new DeleteItem();
    Response  response;
    ScenarioContext scenarioContext = ScenarioContext.getInstance();
    static String itemId;
    DeleteItemResponse deleteItemResponse;

    @Given("the Delete item request set with valid Id")
    public void the_Delete_item_request_set_with_valid_Id(){

        itemId = scenarioContext.getContext("ItemId").toString();
    }

    @Given("the Delete item request set with invalid Id")
    public void the_Delete_item_request_set_with_invalid_Id(){

//        itemId = "19999";
    }

    @When("the DELETE request to delete item called")
    public void the_DELETE_request_to_delete_item_called(){

        response = deleteItem.deleteCreatedItem(itemId);
        deleteItemResponse = ResponseHelper.getDeletedItemResponse(response);
    }

    @Then("the response message for deletion should be as expected")
        public void the_response_message_for_deletion_should_be_as_expected(){

            String responseMessage = deleteItemResponse.getMessage();
            Assert.assertEquals(responseMessage, "Object with id = "+itemId+", has been deleted.");
        }

}
