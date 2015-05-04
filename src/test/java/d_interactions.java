import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by IEUser on 04/05/2015.
 */
public class d_interactions {
    @Test
    public void D_SimpleInteractions()
    {
        //Start a Firefox Instance
        FirefoxDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");

        //Read the text of an element, in this case the first H1 tag.
        System.out.println(Driver.findElement(By.tagName("h1")).getText());
        //Enter a value in the username field using SendKeys.
        Driver.findElement(By.id("signin-email")).sendKeys("FriendlyTester");
        //Read the value that is in the username input field
        System.out.println(Driver.findElement(By.id("signin-email")).getAttribute("value"));
        //We can read any attribute
        //Read the placeholder attribute of the password field
        System.out.println(Driver.findElement(By.id("signin-password")).getAttribute("placeholder"));
        //Click on the first button, the sign in button in this instance
        Driver.findElement(By.cssSelector("button.submit.primary-btn")).click();
    }

    @Test
    public void D_DriverInteractions()
    {
        //Start a Firefox Instance
        FirefoxDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");
        //Click on the first button, the sign in button in this instance
        Driver.findElement(By.cssSelector("button.submit.primary-btn")).click();
        //Read the url of the page.
        System.out.println(Driver.getCurrentUrl());
        //Read the page title / tab title
        System.out.println(Driver.getTitle());
    }
}
