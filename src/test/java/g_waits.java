import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

/**
 * Created by IEUser on 04/05/2015.
 */
public class g_waits {

    @Test
    public void G_ImplicitWait() throws InterruptedException {
        FirefoxDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");

        Thread.sleep(5000);

        Driver.quit();
    }

    @Test
    public void G_ExplicitWaits()
    {
        //Start a Firefox Instance
        FirefoxDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");

        WebDriverWait wait = new WebDriverWait(Driver, 1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin-email")));

        Driver.quit();
    }
}
