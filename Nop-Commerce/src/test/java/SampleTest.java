import org.testng.annotations.Test;
import pages.LoginPage;

public class SampleTest extends BaseTest {

    @Test(priority = 1)
    public void verifyUnSuccessfulLoginWithInValidData(){

        homePage.clickOnLoginButton();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.sendEmail("shayma2a@gmail.com");
        loginPage.sendPassword("012345");
        loginPage.clickOnLogInButtonInLoginPage();

        softAssert.assertEquals(loginPage.readErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n"+"No customer account found","assertion error");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void verifySuccessfulLoginWithValidData(){

        homePage.clickOnLoginButton();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.sendEmail("s12n@gmail.com");
        loginPage.sendPassword("012345");
        loginPage.clickOnLogInButtonInLoginPage();

        softAssert.assertEquals(loginPage.myAccountButtonText(),"My account","assertion error");
        softAssert.assertAll();
    }


}
