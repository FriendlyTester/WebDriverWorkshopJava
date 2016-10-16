import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

/**
 * Created by IEUser on 04/05/2015.
 */
public class G_Waits {

    @Test
    public void g_ImplicitWait() throws InterruptedException {
        WebDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("https://the-internet.herokuapp.com/login");

        Thread.sleep(5000);

        Driver.quit();
    }

    @Test
    public void g_ImplicitWaitDriverTimeout() throws InterruptedException {
        WebDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("https://the-internet.herokuapp.com/login");
        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.findElement(By.id("ThisIsNotReal"));
        Driver.quit();
    }

    @Test
    public void g_ExplicitWaits()
    {
        //Start a Firefox Instance
        WebDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("https://the-internet.herokuapp.com/login");

        WebDriverWait wait = new WebDriverWait(Driver, 1000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));

        Driver.quit();
    }
}
