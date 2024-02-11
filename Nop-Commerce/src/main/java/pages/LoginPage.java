package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserActions;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }
    WebDriverWait wait=new WebDriverWait(driver,5);
    By emailTextBox=By.xpath("//input[@class='email']") ;
    By passwordTextBox=By.xpath("//input[@class='password']") ;

    By loginButton=By.xpath("//button[text()=\"Log in\"]");
    By errorMessage=By.xpath("//div[@class=\"message-error validation-summary-errors\"]");

    public void sendEmail(String email){
        BrowserActions.sendKeys(emailTextBox,driver,email);
    }
    public void sendPassword(String password){
        BrowserActions.sendKeys(passwordTextBox,driver,password);
    }
    public void clickOnLogInButtonInLoginPage(){
        BrowserActions.clickOn(loginButton,driver);
    }
    public String readErrorMessage(){
        return BrowserActions.getText(errorMessage,driver);
    }

}
