package stepDefinitions;

import apiConfig.StatusCode;
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

    @Given("the Delete item request set with invalid {string}")
    public void the_Delete_item_request_set_with_invalid_Id(String deletionId){

        itemId = deletionId;
    }

    @When("the DELETE request to delete item called")
    public void the_DELETE_request_to_delete_item_called(){

        response = deleteItem.deleteCreatedItem(itemId);
        deleteItemResponse = ResponseHelper.getDeletedItemResponse(response);

    }

    @Then("the response message for deletion should be as expected")
        public void the_response_message_for_deletion_should_be_as_expected(){

            if(deleteItemResponse.isSuccess()){
                String responseMessage = deleteItemResponse.getMessage();
                Assert.assertEquals(responseMessage, "Object with id = "+itemId+" has been deleted.");
            } else if (deleteItemResponse.isError()) {
                String responseMessage = deleteItemResponse.getError();
                Assert.assertEquals(responseMessage, "Object with id = "+itemId+" doesn't exist.");
            }

    }

    @Then("the response code for delete item should be {int}")
    public void the_response_code_for_delete_item_should_be_200(int statusCode){
        Assert.assertEquals(response.statusCode(), StatusCode.expectedCode(statusCode).code);
    }

}
