package steps.serenity;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Loginpage;

import java.util.List;


public class LoginSnt extends ScenarioSteps {


       private static final long serialVersionUID = 1L;

    Loginpage LoginPage;


    // gọi đến page
    public void openPageToLogin() {
        System.out.println("login serenity");
        LoginPage.open();

    }

    public void clickBtntoLogin() {
        LoginPage.clickBtntologin();
    }
    @Step
    public void enterEmail(DataTable acc) {
        List<List<String>> data = acc.raw();
        LoginPage.enterEmail(data.get(0).get(0));
    }
    @Step
    public void enterPass(DataTable acc) {
        List<List<String>> data = acc.raw();
        LoginPage.enterPass(data.get(0).get(1));

    }

    public void loginClick() {
        LoginPage.loginClick();
    }

}
