package stepDefinitions;

import apiConfig.StatusCode;
import apiRequestHelper.GetCreatedItem;
import context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
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

    @Given("the Get item request set with invalid Id {string}")
    public void the_Get_item_request_set_with_invalid_Id(String getItemId){

        itemId = getItemId;
    }

    @When("the GET request for get item called")
    public void the_GET_request_for_get_item_called(){

        response = getCreatedItem.getCreatedItem(itemId);
        getItemResponse = ResponseHelper.getItemResponse(response);
    }
    @Then("the response code for get item should be {int}")
    public void the_response_code_for_get_item_should_be_200(int statusCode){
        Assert.assertEquals(response.statusCode(), StatusCode.expectedCode(statusCode).code);
    }

    @Then("the response for the get item should be as expected")
    public void the_response_for_the_get_item_should_be_as_expected(){

        String name = scenarioContext.getContext("name").toString();
        String year = scenarioContext.getContext("year").toString();
        String price = scenarioContext.getContext("price").toString();
        String cpuModel = scenarioContext.getContext("cpuModel").toString();
        String hardDiskSize = scenarioContext.getContext("hardDiskSize").toString();

        Assert.assertEquals(getItemResponse.getName(), name);
        Assert.assertEquals(getItemResponse.getData().getYear(), year);
        Assert.assertEquals(getItemResponse.getData().getPrice(), price);
        Assert.assertEquals(getItemResponse.getData().getCpuModel(), cpuModel);
        Assert.assertEquals(getItemResponse.getData().getHardDiskSize(), hardDiskSize);
    }

}
