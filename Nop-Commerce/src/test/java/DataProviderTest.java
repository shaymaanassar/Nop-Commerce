import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class DataProviderTest extends BaseTest {
    @DataProvider(name="loginData")
    public Object[][] provideLoginData(){
        return new Object[][]{
                {"user1","password1"},
                {"user2","password2"},
        };
    }
    @Test(dataProvider = "loginData")
    public void loginTest(String username,String password){
        BasePage basePage=new BasePage(driver);
        basePage.clickOnLoginButton();
        LoginPage loginPage=new LoginPage(driver);

        loginPage.sendEmail(username);
        loginPage.sendPassword(password);
        loginPage.clickOnLogInButtonInLoginPage();

    }
}
