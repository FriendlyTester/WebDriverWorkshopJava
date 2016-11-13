import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.answers.*;

/**
 * Created by IEUser on 10/05/2015.
 */
public class I_CheckUsingPageObjects_Answers
{

    //http://www.thefriendlytester.co.uk/2014/05/pageobject-pattern-why-how-and-more.html

    @Test
    public void i_NoPasswordPageObjects()
    {
        WebDriver Driver = new FirefoxDriver(); //DriverFactory
        Driver.navigate().to("https://the-internet.herokuapp.com/login");

        LoginPageAnswer loginPageAnswer = new LoginPageAnswer(Driver);
        loginPageAnswer.populateUsername("tomsmith");

        LoginErrorPageAnswer loginErrorPage = loginPageAnswer.clickLoginExpectingError();
        Assert.assertTrue(loginErrorPage.ReadErrorMessage().contains("Your password is invalid!"));

        Driver.quit();
    }

    @Test
    public void i_IncorrectPasswordPageObjects()
    {
        WebDriver Driver = new FirefoxDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/login");

        LoginPageAnswer loginPageAnswer = new LoginPageAnswer(Driver);
        loginPageAnswer.populateUsername("tomsmith");
        loginPageAnswer.populatePassword("password");

        LoginErrorPageAnswer loginErrorPageAnswer = loginPageAnswer.clickLoginExpectingError();

        Assert.assertTrue(loginErrorPageAnswer.ReadErrorMessage().contains("Your password is invalid!"));

        Driver.quit();
    }

    @Test
    public void i_CorrectPassword()
    {
        WebDriver Driver = new FirefoxDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/login");

        LoginPageAnswer loginPageAnswer = new LoginPageAnswer(Driver);
        loginPageAnswer.populateUsername("tomsmith");
        loginPageAnswer.populatePassword("SuperSecretPassword!");

        LoggedInPageAnswer loggedInPageAnswer = loginPageAnswer.clickLoginExpectingSuccess();
        Assert.assertTrue(loggedInPageAnswer.ReadSuccessMessage().contains("You logged into a secure area!"));

        Driver.quit();
    }

}
