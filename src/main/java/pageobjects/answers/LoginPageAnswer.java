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
public class LoginPageAnswer
{

    @FindBy(how = How.ID, using = "password")
    private WebElement txtPassword;

    @FindBy(how = How.ID, using = "username")
    private WebElement txtUsername;

    @FindBy(how = How.CSS, using = "button.radius")
    private WebElement btnLogin;

    private WebDriver Driver;

    public LoginPageAnswer(WebDriver driver)
    {
        Driver = driver;
        PageFactory.initElements(Driver, this);

        WebDriverWait wait = new WebDriverWait(Driver, 5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
    }

    public void populateUsername(String username)
    {
        txtUsername.sendKeys(username);
    }

    public void populatePassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public LoginErrorPageAnswer clickLoginExpectingError()
    {
        btnLogin.click();
        return new LoginErrorPageAnswer(Driver);
    }

    public LoggedInPageAnswer clickLoginExpectingSuccess()
    {
        btnLogin.click();
        return new LoggedInPageAnswer(Driver);
    }
}
