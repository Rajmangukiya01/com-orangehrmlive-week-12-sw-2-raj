package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //Click on forgot your password link
        clickOnElements(By.xpath("//p[contains(@class, 'oxd-text oxd-text--p orangehrm-login-forgot-header')]"));

        //verify the text 'Reset Password'
        //Expected message
        String expectedMessage = "Reset Password";

        //Find the text and get the text
        String actualMessage = getTextFromElement(By.xpath("//h6"));

        //Compare expected message and actual message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    public void testDown() {
        closeBrowser();
    }
}
