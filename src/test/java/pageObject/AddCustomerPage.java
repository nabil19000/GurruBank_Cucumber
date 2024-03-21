package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
    WebDriver ldriver ;
    public AddCustomerPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")@CacheLookup
    WebElement new_Customer_button;
    @FindBy(xpath = "//input[@name='name']")@CacheLookup
    WebElement customer_name;
    @FindBy(xpath = "//input[@value='m']")@CacheLookup
    WebElement gender_male;
    @FindBy(xpath = "//input[@value='f']")@CacheLookup
    WebElement gender_female ;
    @FindBy(xpath = "//*[@id=\"dob\"]")@CacheLookup
    WebElement dateOfBirth ;
    @FindBy(xpath = "//textarea[@name='addr']")@CacheLookup
    WebElement address ;
    @FindBy(xpath = "//input[@name='city']")@CacheLookup
    WebElement city ;
    @FindBy(xpath = "//input[@name='state']")@CacheLookup
    WebElement state ;
    @FindBy(xpath = "//input[@name='pinno']")@CacheLookup
    WebElement pin ;
    @FindBy(xpath = "//input[@name='telephoneno']")@CacheLookup
    WebElement mobile_number ;
    @FindBy(xpath = "//input[@name='emailid']")@CacheLookup
    WebElement email;
    @FindBy(xpath = "//input[@name='password']")@CacheLookup
    WebElement password;
    @FindBy(xpath = "//input[@name='sub']")@CacheLookup
    WebElement submit_button ;


    public void setNew_Customer_button(){
        new_Customer_button.click();
    }
    public void setCustomer_name(String cname){
        customer_name.sendKeys(cname);
    }
    public void setGender(String gender){
        if(gender.equals("male")){
            gender_male.click();
        }else if(gender.equals("female")){
            gender_female.click();
        }else{
            System.out.println("no gender selected");
        }

    }
    public void setDateOfBirth(String dob){
        dateOfBirth.sendKeys(dob);
    }
    public void setAddress(String adrs){
      address.sendKeys(adrs);
    }
    public void setCity(String cty){
        city.sendKeys(cty);
    }
    public void setState(String stt){
        state.sendKeys(stt);
    }
    public void setPin(String pin1){
        pin.sendKeys(pin1);
    }
    public void setMobile_number(String phone){
        mobile_number.sendKeys(phone);
    }
    public void setEmail(String eml){
        email.sendKeys(eml);
    }
    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }
    public void setSubmit_button() throws InterruptedException {
        submit_button.click();
        Thread.sleep(3000);
    }
}
