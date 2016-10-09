import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IEUser on 04/05/2015.
 */
public class A_DriverExamples {
    
    @Test
    public void a_CreateFirefoxDriver()
    {
        //https://github.com/mozilla/geckodriver/releases
        //GeckoDriver is needed now
        //Mac users can place it in /usr/bin
        //Windows users must instruct FirefoxDriver where it is
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\RichardWindwos\\Download\\WebDriverWorkshopJava-master\\WebDriverWorkshop\\src\\drivers\\windwos\\geckodriver.exe");

        FirefoxDriver Driver = new FirefoxDriver();
        //Driver remains open, how do we stop that?
    }

    @Test
    public void a_CreateChromeDriver()
    {
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\RichardWindwos\\Download\\WebDriverWorkshopJava-master\\WebDriverWorkshop\\src\\drivers\\windwos\\chromedriver.exe");
        ChromeDriver Driver = new ChromeDriver();
    }

    @Test
    public void a_CreateEdgeDriver()
    {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\IEUser\\Documents\\WebDriverWorkshopJava\\IEDriverServer.exe");
        EdgeDriver Driver = new EdgeDriver();
    }

    @Test
    public void a_CreateRemoteWebDriver() throws MalformedURLException {

        //java -jar src/drivers/selenium-sver-standalone-3.0.0-beta4.jar -role hub
        //java -jar src/drivers/selenium-sver-standalone-3.0.0-beta4.jar -role node -hub http://localhost:4444/wd/hub
        RemoteWebDriver Driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
    }

    //SafariDriver
    //Never need to use to it myself, however I tried on El Capitan it was very flakey
    //I\ve heard it's better on Sierra
}
