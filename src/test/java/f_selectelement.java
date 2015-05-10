import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by IEUser on 10/05/2015.
 */
public class f_selectelement {

    @Test
    public void F_SelectElementExamples() {
        FirefoxDriver Driver = new FirefoxDriver();
        Driver.navigate().to("http://www.facebook.com");

        Select selDay = new Select(Driver.findElementById("day"));
        selDay.selectByVisibleText("14");
        System.out.println(selDay.getFirstSelectedOption().getText());
    }
}
