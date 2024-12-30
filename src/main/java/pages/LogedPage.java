package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogedPage {
    WebDriver driver;
    public LogedPage(WebDriver driver) {
        this.driver=driver;
    }



    //Locators
    private By laptops =By.xpath("//a[@onclick=\"byCat('notebook')\"]");
    private By sonyVaioi5=By.xpath("(//a[@class=\"hrefch\"])[1]");
    private By sonyVaioi7=By.xpath("(//a[@class=\"hrefch\"])[2]");





    //Actions
    public void clickOnLaptops(){driver.findElement(laptops).click();}
    public SonyVaioi5 clickOnSonyVaioi5(){driver.findElement(sonyVaioi5).click();
    return new SonyVaioi5(driver) ;}
    public SonyVaioi7 clickOnSonyVaioi7(){driver.findElement(sonyVaioi7).click();
        return new SonyVaioi7(driver) ;}
}
