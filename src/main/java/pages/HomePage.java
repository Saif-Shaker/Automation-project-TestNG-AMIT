package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }


    //Locators
    private By signUpInHomePage = By.xpath("//a[@id='signin2']");
    private By signUpUserName = By.id("sign-username");
    private By signUppassword =By.id("sign-password");
    private By signUpButton =By.xpath("//button[@onclick='register()']");
    private By logInInHomePage= By.id("login2");
    private By loginUserName= By.id("loginusername");
    private By loginPassword=By.id("loginpassword");
    private By loginButton =By.xpath("//button[@onclick='logIn()']");
    private By welcomeMassege=By.xpath("//a[@id=\"nameofuser\"]");




    //Actions
   public void clickSignUpInHomePage(){driver.findElement(signUpInHomePage).click();}
  public void enterUserName(String username){driver.findElement(signUpUserName).sendKeys(username);}
    public void enterPassword(String password){
        driver.findElement(signUppassword).sendKeys(password);
    }
    public void clickOnSignUpButton() {driver.findElement(signUpButton).click();}

    public String getValidationMessge(){
       String text=driver.switchTo().alert().getText();
       return text;
    }
    public void acceptJSAlert ()      {driver.switchTo().alert().accept();}




    public LogedPage clickOnLogInInHomePage(){driver.findElement(logInInHomePage).click();
        return new LogedPage(driver);
    }
    public void enterLoginUserName(String username){driver.findElement(loginUserName).sendKeys(username);}
    public void enterLoginPassword(String password){
        driver.findElement(loginPassword).sendKeys(password);
    }
    public LogedPage clickOnLoginButton(){driver.findElement(loginButton).click();
   return new LogedPage(driver);}
    public String getWelcomeMassege(){
        String text =driver.findElement(welcomeMassege).getText();
        return text;
    }














}


