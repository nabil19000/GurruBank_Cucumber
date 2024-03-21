package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver ;

    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(name="uid")@CacheLookup
    WebElement txtUserId;
    @FindBy(name = "password")@CacheLookup
    WebElement txtPassword;
    @FindBy(name = "btnLogin")@CacheLookup
    WebElement loginBtn;
    @FindBy(xpath = "//a[normalize-space()='Log out']")@CacheLookup
    WebElement logOutBtn;

    public void setTxtUserId(String uname){
        txtUserId.clear();
        txtUserId.sendKeys(uname);
    }
    public void setTxtPassword(String pwd){
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }
    public void setLoginBtn(){
        loginBtn.click();
    }
    public void setLogOutBtn(){
        logOutBtn.click();
    }

    private boolean validateWelcomeMessage(String actualMessage , String expectedManagerId){
        String[] words = actualMessage.split(" ");
        String actualManagerId = words[words.length - 1];

        // Validating the extracted manager ID against the expected manager ID
        return actualManagerId.equals(expectedManagerId);
    }

}


