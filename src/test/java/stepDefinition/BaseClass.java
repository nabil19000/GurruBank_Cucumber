package stepDefinition;

import org.openqa.selenium.WebDriver;
import pageObject.AddCustomerPage;
import pageObject.LoginPage;

public class BaseClass {

    public WebDriver ldriver;
    public LoginPage loginPage;
    public AddCustomerPage addCustomerPage;

//    public static String randomstring(){
//
//    }
    public  void  getTitle(){
        ldriver.getTitle();

    }
}
