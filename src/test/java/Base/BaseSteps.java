package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseSteps {
  public   WebDriver driver;
  public HomePage homePage;



    @BeforeClass
    public void  setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage=new HomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        openHomeBage();
    }
    @BeforeMethod
    public void openHomeBage(){
        driver.get("https://www.demoblaze.com/");

    }

    @AfterClass
    public void closeBrawser(){

       driver.quit();
    }
}
