import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by IEUser on 04/05/2015.
 */
public class D_Interactions {
    @Test
    public void d_SimpleInteractions()
    {
        //Start a Firefox Instance
        WebDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("https://the-internet.herokuapp.com/login");

        //Read the text of an element, in this case the first H2 tag.
        System.out.println(Driver.findElement(By.tagName("h2")).getText());
        //Enter a value in the username field using SendKeys.
        Driver.findElement(By.id("username")).sendKeys("tomsmith");
        //Read the value that is in the username input field
        System.out.println(Driver.findElement(By.id("username")).getAttribute("value"));
        //We can read any attribute
        //Read the placeholder attribute of the password field
        System.out.println(Driver.findElement(By.id("password")).getAttribute("name"));
        //Click on the first button, the sign in button in this instance
        Driver.findElement(By.cssSelector("button.radius")).click();

        Driver.quit();
    }

    @Test
    public void d_DriverInteractions()
    {
        //Start a Firefox Instance
        WebDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("https://the-internet.herokuapp.com/login");
        //Click on the first button, the sign in button in this instance
        Driver.findElement(By.cssSelector("button.radius")).click();
        //Read the url of the page.
        System.out.println(Driver.getCurrentUrl());
        //Read the page title / tab title
        System.out.println(Driver.getTitle());

        Driver.quit();
    }


    //Future reading, look into the actions class
    //https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/interactions/Actions.html
    //    @Test
    //    public void WebDriverActions() throws InterruptedException
    //    {
    //        //Start a Firefox Instance
    //        WebDriver Driver = new ChromeDriver();
    //        Driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
    //        Driver.manage().window().maximize();
    //
    //        Actions action = new Actions(Driver);
    //
    //        action.dragAndDrop(Driver.findElement(By.id("column-a")), Driver.findElement(By.id("column-b")))
    //                .build()
    //                .perform();
    //
    //        action.clickAndHold(Driver.findElement(By.id("column-a")))
    //                .moveToElement(Driver.findElement(By.id("column-b")))
    //                .release()
    //                .build()
    //                .perform();
    //
    //        Thread.sleep(5000);
    //    }
}
