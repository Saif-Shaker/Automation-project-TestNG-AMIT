package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SonyVaioi5 {
    WebDriver driver;
    public SonyVaioi5(WebDriver driver) {
        this.driver=driver;

    }




    //locators
    private By addToCart=By.xpath("//a[@class=\"btn btn-success btn-lg\"]");
    private By homePage=By.xpath("(//a[@class=\"nav-link\"])[1]");





    //Actions
    public void clickOnAddToCartButton(){driver.findElement(addToCart).click();}
    public void acceptJSAlert ()      {driver.switchTo().alert().accept();}
    public String getValdationMassages (){
        String text = driver.switchTo().alert().getText();
        return text;
    }
    public HomePage backToHomePage(){driver.findElement(homePage).click();
    return new HomePage(driver);}
}
