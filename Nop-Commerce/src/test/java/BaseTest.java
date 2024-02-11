import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.DriverSetUp;

public class BaseTest {
    WebDriver driver;
    HomePage homePage;
    SoftAssert softAssert;

    @BeforeMethod
    public void driverSetup(){
        driver= DriverSetUp.driverName("chrome");
        homePage=new HomePage(driver);
        softAssert=new SoftAssert();
    }
    @AfterMethod
    public void close(){
        driver.close();
    }
}
