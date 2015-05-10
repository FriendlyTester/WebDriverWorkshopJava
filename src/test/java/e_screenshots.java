import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by IEUser on 04/05/2015.
 */
public class E_Screenshots {

    @Test
    public void e_TakeAScreenshot() throws IOException {
        //Start a Firefox Instance
        FirefoxDriver Driver = new FirefoxDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://www.twitter.com");

        //File scrFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
        File scrFile = Driver.getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("C:\\Users\\IEUser\\Desktop\\twitter.jpg"));
    }
}
