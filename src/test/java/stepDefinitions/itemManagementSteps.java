package stepDefinitions;

import io.cucumber.java.en.Given;
import org.testng.Assert;

public class itemManagementSteps {

    @Given("the POST request set with valid details")
    public void the_post_request_set_with_valid_details(){
        System.out.println("Test");
        Assert.assertTrue(true);
    }
}
