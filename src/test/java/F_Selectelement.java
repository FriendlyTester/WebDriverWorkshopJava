import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by IEUser on 10/05/2015.
 */
public class F_Selectelement {

    @Test
    public void f_SelectElementExamples() {
        FirefoxDriver Driver = new FirefoxDriver();
        Driver.navigate().to("http://www.facebook.com");

        Select selDay = new Select(Driver.findElementById("day"));
        selDay.selectByVisibleText("14");
        System.out.println(selDay.getFirstSelectedOption().getText());
    }

    //Control Objects
    //http://www.thefriendlytester.co.uk/2012/11/i-call-them-controlobjects.html
}
