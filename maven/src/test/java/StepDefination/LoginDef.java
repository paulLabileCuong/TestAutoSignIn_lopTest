package StepDefination;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDef {
    WebDriver driver;
    LoginPage loginPage;

    @Given("The login page is shown")
    public void theLoginPageIsShown() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webDriver/chromedriver.exe");
        this.driver = new ChromeDriver();

        this.loginPage = new LoginPage(this.driver);
        this.loginPage.openLoginPage();
    }

    @When("User attempt to login with account is {string} and password is {string}")
    public void userAttemptToLoginWithAccountIsAndPasswordIs(String account, String password) {
        this.loginPage.txtAccount.sendKeys(account);
        this.loginPage.txtPassword.sendKeys(password);
        this.loginPage.btnDangNhap.click();

    }
    @Then("The message {string} is shown")
    public void theMessageIsShown(String expMsg) {
//        String actMsg = this.loginPage.msgToastMsg.getText();
//        Assertions.assertEquals(expMsg,actMsg);
    }

//    @Then("Close Brower")
//    public void closeBrower() {
//        this.driver.close();
//    }
}
