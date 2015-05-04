import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by IEUser on 04/05/2015.
 */
public class b_navigation {

    @Test
    public void Navigation() throws InterruptedException {
        FirefoxDriver Driver = new FirefoxDriver();
        //We need to use to the Navigate method.
        Driver.navigate().to("http://thefriendlytester.co.uk");
        Thread.sleep(2500);
        Driver.navigate().to("http://www.thefriendlytester.co.uk/p/nottstest.html");
        Thread.sleep(2500);
        Driver.navigate().back();
        Thread.sleep(2500);
        Driver.navigate().forward();
        Thread.sleep(2500);
        Driver.navigate().refresh();
    }
}
