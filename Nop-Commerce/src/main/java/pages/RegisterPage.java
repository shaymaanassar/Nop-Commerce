package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserActions;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver){
        super(driver);
    }
    WebDriverWait wait=new WebDriverWait(driver,5);
    By firstName=By.xpath("//div[@class='inputs']//input[@name=\"FirstName\"]");
    By lastName=By.xpath("//div[@class='inputs']//input[@name=\"LastName\"]");
    By email=By.id("Email");
    By password=By.xpath("//input[@id='Password']");
    By confirmPassword=By.xpath("//input[@id='ConfirmPassword']");

    By registerButton=By.xpath("//button[@id='register-button']");

    By registerConfirmMessage=By.xpath("//div[@class='result']");

    By emailExistMessage=By.xpath("//ul//li[text()='The specified email already exists']");
    public void enterFirstName(String fName){

        BrowserActions.sendKeys(firstName,driver,fName);
    }

    public void enterLastName(String lName){

        BrowserActions.sendKeys(lastName,driver,lName);
    }

    public void enterEmail(String emaail){
        BrowserActions.sendKeys(email,driver,emaail);
    }

    public void enterPassword(String pass){

        BrowserActions.sendKeys(password,driver,pass);
    }

    public void enterConfirmPassword(String confirmPass){
        BrowserActions.sendKeys(confirmPassword,driver,confirmPass);
    }

    public void clickOnRegisterButton(){
        BrowserActions.clickOn(registerButton,driver);
    }
    public String emailAlreadyExistMessage(){
        return BrowserActions.getText(emailExistMessage,driver);
    }

    public String readRegisteratinConfirmMessage(){
        return BrowserActions.getText(registerConfirmMessage,driver);
    }
}
