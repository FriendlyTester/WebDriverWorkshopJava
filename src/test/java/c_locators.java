import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by IEUser on 04/05/2015.
 */
public class c_locators {

    @Test
    public void C_AllLocators()
    {
        //Start a Firefox Instance
        FirefoxDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");

        //Chrome tools & Firefox tools

        WebElement ElementByClassName = Driver.findElement(By.className("text-input"));
        WebElement ElementByCssSelector = Driver.findElement(By.cssSelector("input.text-input.email-input"));
        WebElement ElementByID = Driver.findElement(By.id("signin-email"));
        //WebElement ElementBy = Driver.findElement(By.LinkText(""));
        WebElement ElementByName = Driver.findElement(By.name("session[username_or_email]"));
        WebElement ElementByTagName = Driver.findElement(By.tagName("input"));
        WebElement ElementByXPath = Driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[2]/form/div[1]/input"));

        //But they can be different
        WebElement ElementByXPath1 = Driver.findElement(By.xpath("//*[@id=\"signin-email\"]"));
        WebElement ElementByCssSelector1 = Driver.findElement(By.cssSelector("#signin-email"));

        //CSS Game
        //http://flukeout.github.io/
    }

    @Test
    public void C_FindElements()
    {
        //Start a Firefox Instance
        FirefoxDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");

        List<WebElement> inputs = Driver.findElementsByTagName("input");
        //13/10/2014 it was number 9
        WebElement ElementByTagFindAll = inputs.get(9);
    }

    public void C_CreateYourOwn()
    {
        //Pick a website of yout choice
        //See if you can find the correct locators
    }
}
