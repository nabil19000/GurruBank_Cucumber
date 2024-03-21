package stepDefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.AddCustomerPage;
import pageObject.LoginPage;



import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;


public class Steps extends BaseClass {
    public static String value;
    public WebDriver driver;
    public LoginPage loginPage;
    public AddCustomerPage addCustomerPage;

    @Given("user launch firefox browser")
    public void user_launch_firefox_browser() {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver");
        driver = new EdgeDriver();
        loginPage = new LoginPage(driver);
    }

    @When("user open URL {string}")
    public void user_open_URL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user enter userId as {string}")
    public void user_enter_userId_as(String uname) {
        loginPage.setTxtUserId(uname);
    }

    @When("user enter password as {string}")
    public void user_enter_password_as(String password) {
        loginPage.setTxtPassword(password);
    }

    @When("user click on login")
    public void user_click_on_login() {
        loginPage.setLoginBtn();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        if (driver.getTitle().equals(expectedTitle)) {
            Assert.assertTrue(true);
        } else {
            fail();
        }

    }

    @When("user click on log out link")
    public void user_click_on_log_out_link() {
        loginPage.setLogOutBtn();
        String allertmsg = "You Have Succesfully Logged Out!!";
        Alert alert = driver.switchTo().alert();
        String actualAlertText = alert.getText();
        alert.accept();
        Assert.assertEquals(allertmsg, actualAlertText);

    }

    @Then("close browser")
    public void close_browser() {
        driver.close();
        driver.quit();

    }

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        String expected = "Guru99 Bank Manager HomePage";
        if (driver.getTitle().equals(expected)) {
            Assert.assertTrue(true);
        } else {
            fail();
        }
    }

    @When("user click on new customer button")
    public void user_click_on_new_customer_button() {
        addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
        addCustomerPage.setNew_Customer_button();
    }

    @When("user enter the new customer infos")
    public void user_enter_the_new_customer_infos() {
        addCustomerPage.setCustomer_name("tecriiop");
        addCustomerPage.setGender("male");
        addCustomerPage.setDateOfBirth("12/12/1989");
        addCustomerPage.setAddress("4545 austin");
        addCustomerPage.setCity("austin");
        addCustomerPage.setState("texas");
        addCustomerPage.setPin("000012");
        addCustomerPage.setMobile_number("4545116600");
        addCustomerPage.setEmail("techridge10@gmail.com");
        addCustomerPage.setPassword("bob5500");
    }

    @When("user click on submit button")
    public void user_click_on_submit_button() throws InterruptedException {
        addCustomerPage.setSubmit_button();
    }

    @Then("user should get login errors message as {string}")
    public void user_should_get_login_errors_message_as(String expectedMsg) {
        Alert alert = driver.switchTo().alert();
        String actualAlertText = alert.getText();
        alert.accept();
        Assert.assertEquals(expectedMsg, actualAlertText);


    }

    @Then("Customer ID should be created")
    public void Customer_ID_should_be_created() {


        value = driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]")).getText();

        System.out.println(value);


    }

    @Then("user Should get allert message as {string} and accepte the allert")
    public void user_Should_get_allert_message_as_and_accepte_the_allert(String expectedMsg) {
        Alert alert = driver.switchTo().alert();
        String actualAlertText = alert.getText();
        alert.accept();
        Assert.assertEquals(expectedMsg, actualAlertText);
    }

    @When("user enter the new customer as emptyinfo")
    public void user_enter_the_new_customer_as_emptyinfo() {
        addCustomerPage.setCustomer_name("");
        addCustomerPage.setGender("");
        addCustomerPage.setDateOfBirth("");
        addCustomerPage.setAddress("");
        addCustomerPage.setCity("");
        addCustomerPage.setState("");
        addCustomerPage.setPin("");
        addCustomerPage.setMobile_number("");
        addCustomerPage.setEmail("");
        addCustomerPage.setPassword("");
    }

    @Then("user get errors msg for each empty field")
    public void user_get_errors_msg_for_each_empty_field() {
        String nameExpected = "Customer name must not be blank";
        String actual = driver.findElement(By.xpath("//label[@id='message']")).getText();
        Assert.assertEquals(nameExpected, actual);
        //
        String dateExpected = "Date Field must not be blank";
        String datemsg = driver.findElement(By.xpath("//label[@id='message24']")).getText();
        Assert.assertEquals(dateExpected, datemsg);
        //
        String adressExpected = "Address Field must not be blank";
        String adressmsg = driver.findElement(By.xpath("//label[@id='message3']")).getText();
        Assert.assertEquals(adressExpected, adressmsg);
        //
        String cityExpected = "City Field must not be blank";
        String citymsg = driver.findElement(By.xpath("//label[@id='message4']")).getText();
        Assert.assertEquals(cityExpected, citymsg);
        //
        String stateExpected = "State must not be blank";
        String statemsg = driver.findElement(By.xpath("//label[@id='message5']")).getText();
        Assert.assertEquals(stateExpected, statemsg);
        //
        String pinExpected = "PIN Code must not be blank";
        String pinmsg = driver.findElement(By.xpath("//label[@id='message6']")).getText();
        Assert.assertEquals(pinExpected, pinmsg);
        //
        String mobileExpected = "Mobile no must not be blank";
        String mobilemsg = driver.findElement(By.xpath("//label[@id='message7']")).getText();
        Assert.assertEquals(mobileExpected, mobilemsg);
        //
        String emailExpected = "Email-ID must not be blank";
        String emailmsg = driver.findElement(By.xpath("//label[@id='message9']")).getText();
        Assert.assertEquals(emailExpected, emailmsg);
        //
        String passwordExpected = "Password must not be blank";
        String passwordmsg = driver.findElement(By.xpath("//label[@id='message18']")).getText();
        Assert.assertEquals(passwordExpected, passwordmsg);

    }
    @Then("user Should see a welcome message and the Manager id")
    public void user_Should_see_a_welcome_message_and_the_Manager_id() {
        String actual = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
         By elementLocator = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td");
         WebElement element = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
         assert element.isDisplayed() : "element is not displayed";
System.out.println(actual);
      }

    }

















