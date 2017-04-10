import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

/**
 * Created by IEUser on 04/05/2015.
 */
public class B_Navigation {

    @Test
    public void navigation() throws InterruptedException { //Explain InterruptedException

        //Chrome most used browser, so we'll use that throughout the rest of the class
        //Start a new instance of Chrome
        WebDriver Driver = new ChromeDriver();
        //The Driver object, has a method on it called navigate.
        //This is the method we use to instruct WebDriver to navigate to a specific URL
        Driver.navigate().to("http://www.thefriendlytester.co.uk");
        //We're using implicitWaits here just too help us see the navigation, please don't use these :D
        //We'll learn more about waits later in the class
        Thread.sleep(2500);
        //Asking WebDriver to navigate to a different URL
        Driver.navigate().to("http://www.thefriendlytester.co.uk/p/about-me.html");
        Thread.sleep(2500);
        //Asking WebDriver to press the back button on the browser
        Driver.navigate().back();
        Thread.sleep(2500);
        //Asking WebDriver to press the forward button on the browser
        Driver.navigate().forward();
        Thread.sleep(2500);
        //Asking WebDriver to refresh the current page
        Driver.navigate().refresh();



        //Talk about the different use cases for the above


        Driver.quit();
    }
}
