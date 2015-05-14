import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.TwitterHomePage;
import pageobjects.TwitterLoginErrorPage;

/**
 * Created by IEUser on 10/05/2015.
 */
public class I_CheckUsingPageObjects {

    @Test
    public void i_InvalidPasswordPageObjects()
    {
        FirefoxDriver Driver = new FirefoxDriver();
        Driver.navigate().to("http://twitter.com");

        TwitterHomePage twitterHomepage = new TwitterHomePage(Driver);
        twitterHomepage.populateUsername("FriendlyTester");

        TwitterLoginErrorPage twitterLoginErrorPage = twitterHomepage.clickLogin();
        Assert.assertEquals(twitterLoginErrorPage.ReadErrorMessage(), "The username and password that you entered did not match our records. Please double-check and try again.");

        Driver.quit();
    }
}
