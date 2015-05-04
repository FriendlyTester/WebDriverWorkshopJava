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

    //How do we deal with waits.
    //Why do we need to?
    public void waitforlements()
    {
        //Start a Firefox Instance
        FirefoxDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");

        WebDriverWait wait = new WebDriverWait(Driver, 1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin-email")));
    }
}
