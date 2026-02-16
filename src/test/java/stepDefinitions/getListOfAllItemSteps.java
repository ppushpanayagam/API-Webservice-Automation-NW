package stepDefinitions;

import apiConfig.StatusCode;
import apiRequestHelper.GetListOfItems;
import context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import responseModels.GetListOfAllItemsResponse;
import utils.ResponseHelper;

import java.util.List;

public class getListOfAllItemSteps {

    GetListOfItems getListOfItems = new GetListOfItems();
    Response  response;
    ScenarioContext scenarioContext = ScenarioContext.getInstance();
    static String itemId;
    private List<GetListOfAllItemsResponse> listOfItems;

   @Given("the GET request to get list of items with valid Id")
    public void the_Get_request_set_with_valid_Id(){

        itemId = scenarioContext.getContext("ItemId").toString();
    }

    @When("the GET request to get all the items called")
    public void the_GET_request_to_get_all_the_items_called(){

        response = getListOfItems.getListOfCreatedItems();
        listOfItems = ResponseHelper.getAllItemResponse(response);
    }

    @Then("the response code to get list of all item should be {int}")
    public void the_response_code_to_get_list_of_all_item_should_be_200(int statusCode){

        Assert.assertEquals(response.statusCode(), StatusCode.expectedCode(statusCode).code);
    }

    @Then("the response should contain item with name {string}")
    public void the_response_should_contain_item_with_name(String itemName){

        boolean itemExist = listOfItems.stream()
                .anyMatch(item->item.getName().equals(itemName));
        Assert.assertTrue(itemExist);
    }
}
