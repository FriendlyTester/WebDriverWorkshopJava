import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.Console;
import java.util.List;

/**
 * Created by IEUser on 04/05/2015.
 */
public class C_Locators {

    @Test
    public void c_AllLocators()
    {
        //Start a Firefox Instance
        FirefoxDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");
        Driver.findElementByLinkText("Log in").click();


        //Chrome tools & Firefox tools

        WebElement ElementByClassName = Driver.findElement(By.className("text-input"));
        WebElement ElementByCssSelector = Driver.findElement(By.cssSelector("input.text-input.email-input"));
        WebElement ElementByName = Driver.findElement(By.name("session[username_or_email]"));
        WebElement ElementByTagName = Driver.findElement(By.tagName("input"));
        WebElement ElementByXPath = Driver.findElement(By.xpath("html/body/div[21]/div[2]/div[2]/div[2]/div[2]/form/div[1]/input"));

        //But they can be different
        WebElement ElementByXPath1 = Driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/div[1]/input"));

        //This ID is for the whole dialog
        WebElement ElementByID = Driver.findElement(By.id("login-dialog-dialog"));         //Most common
        WebElement ElementByCssSelector1 = Driver.findElement(By.cssSelector("#login-dialog-dialog"));

        //CSS Game
        //http://flukeout.github.io/
    }

    @Test
    public void c_FindElements()
    {
        //Start a Firefox Instance
        FirefoxDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");
        Driver.findElementByLinkText("Log in").click();

        List<WebElement> inputs = Driver.findElementsByTagName("input");

        WebElement ElementByTagFindAll = inputs.get(11);
        System.out.println(ElementByTagFindAll.getAttribute("placeholder"));
    }

    public void c_CreateYourOwn()
    {
        //Pick a website of yout choice
        //See if you can find the correct locators
    }
}
