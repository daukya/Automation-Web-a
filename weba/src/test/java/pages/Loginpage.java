package pages;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;



import java.util.List;

@DefaultUrl("https://juniorviec.com/")
public class Loginpage extends PageObject {


    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElementFacade login_btn_tologin;
    @FindBy(xpath = "//input[@name='email']")
    WebElementFacade email_ip;
    @FindBy(id = "password")
    WebElementFacade pass_ip;
    @FindBy(xpath = "//input[@id='signin']")
    WebElementFacade login_btn;

    public void clickBtntologin() {
        System.out.println("login page");
        login_btn_tologin.click();
    }

    public void enterEmail(String email) {
        email_ip.sendKeys(email);
    }

    public void enterPass(String pass) {
        pass_ip.sendKeys(pass);
    }

    public void loginClick() {
        login_btn.click();
    }

}
