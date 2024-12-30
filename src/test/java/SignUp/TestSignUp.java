package SignUp;

import Base.BaseSteps;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestSignUp extends BaseSteps {
    @Test
public void TestSignUp() throws InterruptedException {

    homePage.clickSignUpInHomePage();

    homePage.enterUserName("saifshaker4649");
    homePage.enterPassword("saif@123");
    homePage.clickOnSignUpButton();

        Thread.sleep(3000);
        String actualresult =homePage.getValidationMessge();
      String expectedresult = "Sign up successful.";

     assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(3000);
        homePage.acceptJSAlert();



    }
}
