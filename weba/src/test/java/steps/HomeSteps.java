package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import library.All;

public class HomeSteps {
    @Given("^Open browser$")
    public void openBrowser() throws Throwable{
        All.browser();

    }
    @When("^I enter link junior$")
    public void iEnterLinkJunior()  {
        System.out.println("success");
    }

    @Then("^Go to page Junior$")
    public void goToPageJunior() throws Throwable {
        System.out.println("success");
    }
}
