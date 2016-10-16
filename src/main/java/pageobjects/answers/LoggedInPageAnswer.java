package pageobjects.answers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by IEUser on 10/05/2015.
 */
public class LoggedInPageAnswer
{

    @FindBy(how = How.ID, using = "flash")
    private WebElement successMessagePanel;

    private WebDriver Driver;

    public LoggedInPageAnswer(WebDriver driver)
    {
        Driver = driver;
        PageFactory.initElements(Driver, this);

        WebDriverWait wait = new WebDriverWait(Driver, 5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));
    }

    public String ReadSuccessMessage()
    {
        return successMessagePanel.getText();
    }

}
