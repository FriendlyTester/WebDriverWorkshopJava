import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by IEUser on 04/05/2015.
 */
public class f_crossbrowserscreenshots {

    @Test
    public void F_ExecuteScreenshots() throws IOException {

        TakeScreenshotChrome();
        TakeScreenshotFirefox();
    }

    private void TakeScreenshotFirefox() throws IOException {
        FirefoxDriver Driver = new FirefoxDriver();
        Driver.navigate().to("http://thefriendlytester.co.uk");
        File scrFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("C:\\Users\\Richard\\Desktop\\FirefoxScreenshot.jpg"));
        Driver.quit();
    }

    private void TakeScreenshotChrome() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Richard\\Desktop\\chromedriver.exe");
        ChromeDriver Driver = new ChromeDriver();
        Driver.navigate().to("http://thefriendlytester.co.uk");
        File scrFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("C:\\Users\\Richard\\Desktop\\ChromeScreenshot.jpg"));
        Driver.quit();
    }
}
