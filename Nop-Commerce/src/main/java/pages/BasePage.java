package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserActions;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver,5);

    }
    By commonLoginButton=By.xpath("//a[@href=\"/login?returnUrl=%2F\"]");

    public void  clickOnLoginButton(){

        BrowserActions.clickOn(commonLoginButton,driver);
    }
    By commonRegisterButton=By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");

    public void clickOnRegisterButton(){
        BrowserActions.clickOn(commonRegisterButton,driver);
    }
    By myAccountButton=By.xpath("//a[text()='My account']");
    public String myAccountButtonText(){
        return BrowserActions.getText(myAccountButton,driver);

    }
}
