import org.testng.annotations.Test;
import pages.RegisterPage;

public class SampleTest2 extends BaseTest {
    @Test(priority = 2)
    public void verifySuccessfulRegisterWithValidData(){

        homePage.clickOnRegisterButton();
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.enterFirstName("shaymaa");
        registerPage.enterLastName("nassar");
        registerPage.enterEmail("s12n@gmail.com");
        registerPage.enterPassword("012345");
        registerPage.enterConfirmPassword("012345");
        registerPage.clickOnRegisterButton();

        softAssert.assertEquals(registerPage.readRegisteratinConfirmMessage(),"Your registration completed","assertion error");
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void verifyUnSuccessfulRegisterWithEmailAlreadyExists(){

        homePage.clickOnRegisterButton();
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.enterFirstName("shaymaa");
        registerPage.enterLastName("nassar");
        registerPage.enterEmail("m1@gmail.com");
        registerPage.enterPassword("012345");
        registerPage.enterConfirmPassword("012345");
        registerPage.clickOnRegisterButton();

        System.out.println(registerPage.emailAlreadyExistMessage());
        softAssert.assertEquals(registerPage.emailAlreadyExistMessage(),"The specified email already exists","assertion error");
        softAssert.assertAll();
    }
}
