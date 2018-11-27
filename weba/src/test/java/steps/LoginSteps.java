package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.serenity.LoginSnt;

public class LoginSteps {

    @Steps
    LoginSnt loginSnt ;

    @Given("^open browser to login$")
    public void openBrowserToLogin(){
        System.out.println("login step");
        loginSnt.openPageToLogin();

    }
    @When("^click login$")
    public void clickLogin(){

        loginSnt.clickBtntoLogin();
    }

    @And("^enter email")
    public void enterEmail(DataTable account){
        loginSnt.enterEmail(account);
    }

    @And("^enter pass")
    public void enterPass(DataTable account){
        loginSnt.enterPass(account);
    }

    @And("^click login button$")
    public void clickLoginButton() {
        loginSnt.loginClick();
    }

    @Then("^redirect home page$")
    public void redirectHomePage(){

    }
}
