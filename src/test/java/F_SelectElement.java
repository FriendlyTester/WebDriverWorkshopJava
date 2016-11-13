import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by IEUser on 10/05/2015.
 */
public class F_SelectElement
{

    @Test
    public void f_SelectElementExamples() {
        WebDriver Driver = new FirefoxDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        Select selDay = new Select(Driver.findElement(By.id("dropdown")));
        selDay.selectByVisibleText("Option 2");
        System.out.println(selDay.getFirstSelectedOption().getText());

        Driver.quit();
    }

    //Control Objects
    //http://www.thefriendlytester.co.uk/2012/11/i-call-them-controlobjects.html
}
