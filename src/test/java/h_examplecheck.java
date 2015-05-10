import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by IEUser on 04/05/2015.
 */
public class H_Examplecheck {
    //Blog post - http://www.thefriendlytester.co.uk/2014/01/checking-if-element-is-present-with.html

    @Test
    public void h_InvalidPassword()
    {
        FirefoxDriver Driver = new FirefoxDriver();
        Driver.navigate().to("http://twitter.com");

        WebDriverWait waitForUsername = new WebDriverWait(Driver, 5000);
        waitForUsername.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin-email")));

        WebElement txtUsername = Driver.findElement(By.id("signin-email"));
        txtUsername.sendKeys("FriendlyTester");

        WebElement btnLogin = Driver.findElement(By.cssSelector("button.submit.btn.primary-btn"));
        btnLogin.click();

        WebDriverWait waitForError = new WebDriverWait(Driver, 5000);
        waitForError.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#message-drawer span")));

        Assert.assertEquals(Driver.findElement(By.cssSelector("#message-drawer span")).getText(), "The username and password that you entered did not match our records. Please double-check and try again.");

        Driver.quit();
    }

    public void h_AutomateSomething()
    {

    }
}
