package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SonyVaioi7 {
    WebDriver driver;
    public SonyVaioi7(WebDriver driver) {
        this.driver=driver;

    }

    //locators
    private By addToCart=By.xpath("//a[@class=\"btn btn-success btn-lg\"]");
    private By cartPage=By.xpath("(//a[@class=\"nav-link\"])[4]");


//Actions
    public void clickOnAddToCartButton(){driver.findElement(addToCart).click();}
    public void acceptJSAlert ()      {driver.switchTo().alert().accept();}

    public String getValdationMassages (){
        String text = driver.switchTo().alert().getText();
        return text;
    }

    public CartPage goToCartPage(){driver.findElement(cartPage).click();
    return new CartPage(driver);}
}
