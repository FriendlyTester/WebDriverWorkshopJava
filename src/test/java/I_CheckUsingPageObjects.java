import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;
import pageobjects.LoginErrorPage;

/**
 * Created by IEUser on 10/05/2015.
 */
public class I_CheckUsingPageObjects {

    @Test
    public void i_InvalidPasswordPageObjects()
    {
        FirefoxDriver Driver = new FirefoxDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(Driver);
        loginPage.populateUsername("tomsmith");

        LoginErrorPage loginErrorPage = loginPage.clickLogin();
        Assert.assertTrue(loginErrorPage.ReadErrorMessage().contains("Your password is invalid!"));

        Driver.quit();
    }
}
