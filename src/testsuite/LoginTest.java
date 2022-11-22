package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter username
        sendTextToElements(By.name("username"), "Admin");

        //Enter password
        sendTextToElements(By.name("password"), "admin123");

        //Click on login button
        clickOnElements(By.xpath("//button[@type ='submit']"));

        //Verify the dashboard text is displayed
        //Expected message
        String expectedMessage = "Dashboard";

        //Find text and get text
        String actualMessage = getTextFromElement(By.xpath("//h6[contains(@class, '--')]"));

        //Compare expected result and actual result
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    public void testDown() {
        closeBrowser();
    }
}
