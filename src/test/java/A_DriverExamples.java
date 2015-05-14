import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IEUser on 04/05/2015.
 */
public class A_DriverExamples {
    
    @Test
    public void a_CreateFirefoxDriver()
    {
        FirefoxDriver Driver = new FirefoxDriver();
        //Driver remains open, how do we stop that?
    }

    @Test
    public void a_CreateChromeDriver()
    {
        ChromeDriver Driver = new ChromeDriver();
        //Why doesn't this work?
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\IEUser\\Documents\\RTDWebDriverWorkshop\\chromedriver.exe");
        //Mac? Place chromedriver executable in this foler /usr/bin, download mac version though, http://chromedriver.storage.googleapis.com/index.html?path=2.15/
    }

    @Test
    public void a_CreateInternetExplorerDriver()
    {
        //System.setProperty("webdriver.ie.driver", "C:\\Users\\IEUser\\Documents\\RTDWebDriverWorkshop\\IEDriverServer.exe");
        InternetExplorerDriver Driver = new InternetExplorerDriver();
    }

    public void a_CreateRemoteWebDriver() throws MalformedURLException {
        RemoteWebDriver Driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
    }
}
