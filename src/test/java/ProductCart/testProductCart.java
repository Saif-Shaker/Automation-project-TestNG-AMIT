package ProductCart;

import Base.BaseSteps;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LogedPage;
import pages.SonyVaioi5;
import pages.SonyVaioi7;

import static org.testng.Assert.assertTrue;

public class testProductCart extends BaseSteps {
    @Test
    public void testProductCart() throws InterruptedException {


      //Login section

        LogedPage logedPage = homePage.clickOnLogInInHomePage();
        homePage.enterLoginUserName("saifshaker");
        homePage.enterLoginPassword("saif@123");
        homePage.clickOnLoginButton();
        Thread.sleep(3000);
        String actualresult =homePage.getWelcomeMassege();
        String expectedresult = "Welcome saifshaker";
        assertTrue(actualresult.contains(expectedresult));




        //The section for adding products to the cart

        Thread.sleep(2000);
        logedPage.clickOnLaptops();
        Thread.sleep(2000);

        //The section for adding sonyVaioi5
        SonyVaioi5 sonyVaioi5= logedPage.clickOnSonyVaioi5();
        sonyVaioi5.clickOnAddToCartButton();
        Thread.sleep(4000);
        sonyVaioi5.getValdationMassages();
        String actualresult11 =sonyVaioi5.getValdationMassages();
        String expectedresult11 = "Product added.";
        assertTrue(actualresult11.contains(expectedresult11));
        Thread.sleep(2000);
        sonyVaioi5.acceptJSAlert();


        //The section for adding sonyVaioi7

        sonyVaioi5.backToHomePage();
        logedPage.clickOnLaptops();
        Thread.sleep(1000);
        SonyVaioi7 sonyVaioi7= logedPage.clickOnSonyVaioi7();
        sonyVaioi7.clickOnAddToCartButton();
        Thread.sleep(4000);
        sonyVaioi7.getValdationMassages();
        String actualresult22 =sonyVaioi5.getValdationMassages();;
        String expectedresult22 = "Product added.";
        assertTrue(actualresult22.contains(expectedresult22));
        Thread.sleep(2000);
        sonyVaioi7.acceptJSAlert();



        //Cart Page Section

       CartPage cartPage= sonyVaioi7.goToCartPage();
        Thread.sleep(2000);
      cartPage.getProductNameSonyVaioi5();



        String actualresult1 =cartPage.getProductNameSonyVaioi5();
        String expectedresult1 = "Sony vaio i5";
       assertTrue(actualresult1.contains(expectedresult1));
      Thread.sleep(2000);


        cartPage.getProductNameSonyVaioi7();
        String actualresult2 =cartPage.getProductNameSonyVaioi7();
        String expectedresult2 = "Sony vaio i7";
        assertTrue(actualresult2.contains(expectedresult2));
        cartPage.getPriceOfSonyVaioi5();


        String actualresult3 =cartPage.getPriceOfSonyVaioi5();
        String expectedresult3 = "790";
        assertTrue(actualresult3.contains(expectedresult3));


        cartPage.getPriceOfSonyVaioi7();
        String actualresult4 =cartPage.getPriceOfSonyVaioi5();
        String expectedresult4 = "790";
        assertTrue(actualresult4.contains(expectedresult4));


        cartPage.getTotalPrice();
        String actualresult5 =cartPage.getTotalPrice();
        String expectedresult5 = "1580";
        assertTrue(actualresult5.contains(expectedresult5));


        //Purchase Section

        cartPage.clickOnPlaceOrder();
        Thread.sleep(2000);
        cartPage.entrName("saif");
        cartPage.entrCountry("egypt");
        cartPage.enterCity("giza");
        cartPage.enterCard("13132564878");
        cartPage.enterMonth("12");
        cartPage.enterYear("2030");
        cartPage.clickOnPurchaseButton();


        cartPage.getValdationMassages();
        Thread.sleep(2000);
        String actualresult7 =cartPage.getValdationMassages();
        String expectedresult7 = "Thank you for your purchase!";
        assertTrue(actualresult7.contains(expectedresult7));
        cartPage.clickOnOkButton();
    }
}
