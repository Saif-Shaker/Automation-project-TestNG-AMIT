package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.awt.SystemColor.text;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver=driver;
    }



    //Locators
    private By sonyVaioi5InCartPage=By.xpath("//td[contains(text(),'i5')]");
    private By sonyVaioi7InCartPage=By.xpath("//td[contains(text(),'i7')]");
    private By priceOfSonyVaioi5=By.xpath("(//tr[@class=\"success\"]//child::td[3])[1]");
    private By priceOfSonyVaioi7=By.xpath("(//tr[@class=\"success\"]//child::td[3])[2]");
    private By totalPrice=By.xpath("//h3[@id=\"totalp\"]");
    private By placeOrder=By.xpath("//button[@class=\"btn btn-success\"]");
    private By total =By.xpath("//label[@id=\"totalm\"]");
    private By nameBox =By.id("name");
    private By countryBox=By.id("country");
    private By cityBox =By.id("city");
    private By cardBox=By.id("card");
    private By monthBox=By.id("month");
    private By yearBox=By.id("year");
    private By PurchaseButton=By.xpath("(//button[@class=\"btn btn-primary\"])[3]");
    private By ThankyouMessage=By.xpath("//h2[contains(text(),'Thank you for your purchase!')]");
    private By okButton=By.xpath("//button[@class=\"confirm btn btn-lg btn-primary\"]");

    //Actions

    public String getProductNameSonyVaioi7 (){
        String text = driver.findElement(sonyVaioi7InCartPage).getText();
        return text;
    }

    public String getProductNameSonyVaioi5 (){
        String text = driver.findElement(sonyVaioi5InCartPage).getText();
        return text;
    }
    public String getPriceOfSonyVaioi5(){
        String text = driver.findElement(priceOfSonyVaioi5).getText();
        return text;
    }
    public String getPriceOfSonyVaioi7(){
        String text = driver.findElement(priceOfSonyVaioi7).getText();
        return text;
    }
    public String getTotalPrice(){
        String text = driver.findElement(totalPrice).getText();
        return text;
    }
    public void clickOnPlaceOrder(){driver.findElement(placeOrder).click();}
    public String getTotal(){
        String text = driver.findElement(total).getText();
        return text;
    }
    public void entrName(String name){driver.findElement(nameBox).sendKeys(name);}
    public void entrCountry(String country){driver.findElement(countryBox).sendKeys(country);}
    public void enterCity(String city){driver.findElement(cityBox).sendKeys(city);}
    public void enterCard(String card){driver.findElement(cardBox).sendKeys(card);}
    public void enterMonth(String month){driver.findElement(monthBox).sendKeys(month);}
    public void enterYear(String year){driver.findElement(yearBox).sendKeys(year);}
    public void clickOnPurchaseButton(){driver.findElement(PurchaseButton).click();}
    public String getValdationMassages (){
        String text = driver.findElement(ThankyouMessage).getText();
        return text;}
    public void clickOnOkButton(){driver.findElement(okButton).click();}
}
