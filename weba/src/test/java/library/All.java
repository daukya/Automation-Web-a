package library;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class All {
    public static void browser(){
        System.setProperty("webdriver.chrome.driver", "/Users/tuyenle/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://juniorviec.com");

    }
}
