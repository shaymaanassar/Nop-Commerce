import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class ParameterizedTest extends BaseTest{

    @Parameters({"username", "password"})
    @Test(priority = 1)
    public void verifySuccessfulLoginWithValidCredentials(String username,String password){
        BasePage basePage=new BasePage(driver);
        basePage.clickOnLoginButton();

        LoginPage loginPage=new LoginPage(driver);
        loginPage.sendEmail(username);
        loginPage.sendPassword(password);
        loginPage.clickOnLogInButtonInLoginPage();
        softAssert.assertEquals(loginPage.myAccountButtonText(),"My account","assertion error");
        softAssert.assertAll();

    }
    @Test(priority = 2)
    public void verifyUnSuccessfulLoginWithInValidCredentials(){
        BasePage basePage=new BasePage(driver);
        basePage.clickOnLoginButton();

        LoginPage loginPage=new LoginPage(driver);
        loginPage.sendEmail("s123n@gmail.com");
        loginPage.sendPassword("012345");
        loginPage.clickOnLogInButtonInLoginPage();
        softAssert.assertEquals(loginPage.readErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n"+"No customer account found","assertion error");
        softAssert.assertAll();
    }
}
