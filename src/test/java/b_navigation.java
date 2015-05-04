import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by IEUser on 04/05/2015.
 */
public class b_navigation {

    public void Navigation()
    {
        FirefoxDriver Driver = new FirefoxDriver();
        //We need to use to the Navigate method.
        Driver.navigate().to("http://thefriendlytester.co.uk");
        Driver.navigate().to("http://www.thefriendlytester.co.uk/p/nottstest.html");
        Driver.navigate().back();
        Driver.navigate().forward();
        Driver.navigate().refresh();
    }
}
