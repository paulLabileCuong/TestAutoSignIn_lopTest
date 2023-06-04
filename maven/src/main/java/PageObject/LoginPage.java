package PageObject;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void openLoginPage(){
        this.driver.get("http://localhost:88/login.asp");
        this.driver.manage().window().fullscreen();
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement txtAccount;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//button[@class='submit']")
    public WebElement btnDangNhap;
//    @FindBy(xpath = "//div[@class='toast-message']")
//    public WebElement msgToastMsg;
}
