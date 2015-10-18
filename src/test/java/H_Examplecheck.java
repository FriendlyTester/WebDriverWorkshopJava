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
        Driver.navigate().to("https://the-internet.herokuapp.com/login");

        WebDriverWait waitForUsername = new WebDriverWait(Driver, 5000);
        waitForUsername.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        WebElement txtUsername = Driver.findElement(By.id("username"));
        txtUsername.sendKeys("tomsmith");

        WebElement btnLogin = Driver.findElement(By.cssSelector("button.radius"));
        btnLogin.click();

        WebDriverWait waitForError = new WebDriverWait(Driver, 5000);
        waitForError.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));

        Assert.assertTrue(Driver.findElement(By.id("flash")).getText().contains("Your password is invalid!"));
        Driver.quit();
    }

    public void h_AutomateSomething()
    {

    }
}
