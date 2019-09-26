package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class LoginPageForDM extends BaseClassForDM {


    public LoginPageForDM(WebDriver driver)
    {
        super(driver);
    }


    @FindBy(id = "UserEmail")
    private WebElement txt_userName;

    @FindBy(id = "Password")
    private WebElement txt_PassWord;

    @FindBy(xpath = "//button[text()='Sign In']")
    private WebElement btn_click;

    @FindBy(xpath = "//a[text()='Forgot your password?']")
    private WebElement btn_Forgot;

    @FindBy(xpath = "//a[text()='Create a new user with a DataManager Reporting Key']")
    private WebElement btn_CreateReourtKey;

    @FindBy(xpath = "//span[text()='Proctor a Test Session']")
    private WebElement btn_ProctorSession;




    public void setUserName()
    {
        txt_userName.sendKeys(Constants.PROCTOR_USERID);
    }

    public void setPassword()
    {
        txt_PassWord.sendKeys(Constants.PROCTOR_PWD);
    }

    public void clickOnButton()
    {
        btn_click.click();
    }






}
