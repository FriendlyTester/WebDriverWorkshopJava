import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
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
public class A_DriverExamples
{

    @Test
    public void a_CreateFirefoxDriver()
    {
        //https://github.com/mozilla/geckodriver/releases
        //GeckoDriver is needed now

        //Mac users can place it in /usr/bin or usr/local/bin
        //Windows users can add it to their environment variables PATH
        //Put the path to the folder, not the .exe

        //Or you can instruct FirefoxDriver to use it from a specific location
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\RichardWindows\\Download\\WebDriverWorkshopJava-master\\WebDriverWorkshop\\src\\drivers\\windows\\firefox0.11.1\\64bit\\geckodriver.exe");

        WebDriver Driver = new FirefoxDriver();


        for (int i = 0; i < 1500; i++)
        {
            Driver.manage().window().setSize(new Dimension(i, 600));
        }


        Driver.quit();
    }

    @Test
    public void a_CreateChromeDriver()
    {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\RichardWindows\\Download\\WebDriverWorkshopJava-master\\WebDriverWorkshop\\src\\drivers\\windows\\chrome2.25\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        //Driver.quit();
    }

    @Test
    public void a_CreateEdgeDriver()
    {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\IEUser\\Documents\\WebDriverWorkshopJava\\IEDriverServer.exe");
        WebDriver Driver = new EdgeDriver();
        Driver.quit();
    }

    @Test
    public void a_CreateRemoteWebDriver() throws MalformedURLException
    {

        //java -jar src/drivers/selenium-server-standalone-3.0.1.jar -role hub
        //java -jar src/drivers/selenium-server-standalone-3.0.1.jar -role node -hub http://localhost:4444/wd/hub
        WebDriver Driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
        Driver.quit();
    }
}

    //SafariDriver
    //Never need to use to it myself, however I tried on El Capitan it was very flakey
    //I've heard it's better on Sierra
