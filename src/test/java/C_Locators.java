import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by IEUser on 04/05/2015.
 */
public class C_Locators {

    @Test
    public void c_AllLocators()
    {
        //Start a Firefox Instance
        WebDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");
        Driver.findElement(By.linkText("Log in")).click();

        //Chrome tools & Firefox tools. How do we find these locators?

        WebElement ElementByClassName = Driver.findElement(By.className("text-input"));
        WebElement ElementByCssSelector = Driver.findElement(By.cssSelector("input.text-input.email-input"));
        WebElement ElementByName = Driver.findElement(By.name("session[username_or_email]"));
        WebElement ElementByTagName = Driver.findElement(By.tagName("input"));
        WebElement ElementByXPath = Driver.findElement(By.xpath("html/body/div[21]/div[2]/div[2]/div[2]/div[2]/form/div[1]/input"));

        //But they can be different
        WebElement ElementByXPath1 = Driver.findElement(By.xpath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/div[1]/input"));

        //This ID is for the whole dialog
        WebElement ElementByID = Driver.findElement(By.id("login-dialog-dialog"));         //Most common
        WebElement ElementByCssSelector1 = Driver.findElement(By.cssSelector("#login-dialog-dialog input"));

        Driver.quit();
    }

    @Test
    public void c_InvalidLocator()
    {
        //Start a Firefox Instance
        WebDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");
        Driver.findElement(By.linkText("Log in")).click();
        WebElement ElementByID = Driver.findElement(By.id("loginBox"));
    }

    @Test
    public void c_FindElements()
    {
        //Start a Firefox Instance
        WebDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");
        Driver.findElement(By.linkText("Log in")).click();

        List<WebElement> inputs = Driver.findElements(By.tagName("input"));

        WebElement ElementByTagFindAll = inputs.get(11);
        System.out.println(ElementByTagFindAll.getAttribute("placeholder"));
    }

    //What is your preference???

    //CSS Game
    //http://flukeout.github.io/

    public void c_CreateYourOwn()
    {
        //Pick a website(s) of your choice
        //See if you can find some good locators
    }
}
