package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Google_stepDefinitions {
    @When("user is on the google page")

    public void user_is_on_the_google_page() {
        Driver.getDriver().get("https://www.google.com");
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Google";


    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Google";
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();

    }
}
