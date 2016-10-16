import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by IEUser on 10/05/2015.
 */
public class F_Selectelement {

    @Test
    public void f_SelectElementExamples() {
        WebDriver Driver = new FirefoxDriver();
        Driver.navigate().to("http://www.facebook.com");

        Select selDay = new Select(Driver.findElement(By.id("day")));
        selDay.selectByVisibleText("14");
        System.out.println(selDay.getFirstSelectedOption().getText());
    }

    //Control Objects
    //http://www.thefriendlytester.co.uk/2012/11/i-call-them-controlobjects.html
}
