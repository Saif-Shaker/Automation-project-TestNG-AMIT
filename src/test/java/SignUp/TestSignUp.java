package SignUp;

import Base.BaseSteps;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestSignUp extends BaseSteps {
    @Test(priority = 1)
public void TestSignUp() throws InterruptedException {

     //(Happy Scenarios)


    homePage.clickSignUpInHomePage();
    homePage.enterUserName("saifshaker95649");
    homePage.enterPassword("saif@123");
    homePage.clickOnSignUpButton();

        Thread.sleep(3000);
        String actualresult =homePage.getValidationMessge();
      String expectedresult = "Sign up successful.";

     assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(3000);
        homePage.acceptJSAlert();



    }


    //(Negative Scenarios)
    @Test (priority = 2)
    public void TestsigningUpWithAnExistingUsername() throws InterruptedException {

        homePage.clickSignUpInHomePage();

        homePage.enterUserName("saifshaker999");
        homePage.enterPassword("saif@123");
        homePage.clickOnSignUpButton();

        Thread.sleep(3000);
        String actualresult = homePage.getValidationMessge();
        String expectedresult = "This user already exist.";

        assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(3000);
        homePage.acceptJSAlert();
    }
}
