package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetUp {
    static WebDriver driver;
    public static WebDriver driverName(String name){
        if(name=="chrome"){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if (name=="edge") {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        else if (name=="firefox") {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();

        }
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        return driver;
    }
}
