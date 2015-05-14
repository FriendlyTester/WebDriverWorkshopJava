package pageobjects;

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
public class TwitterHomePage {

    @FindBy(how = How.ID, using = "signin-email")
    private WebElement txtUsername;

    @FindBy(how = How.CSS, using = "button.submit.btn.primary-btn")
    private WebElement btnLogin;

    private WebDriver Driver;

    public TwitterHomePage(WebDriver driver)
    {
        Driver = driver;
        PageFactory.initElements(Driver, this);

        WebDriverWait wait = new WebDriverWait(Driver, 5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin-email")));
    }

    public void populateUsername(String username)
    {
        txtUsername.sendKeys(username);
    }

    public TwitterLoginErrorPage clickLogin()
    {
        btnLogin.click();
        return new TwitterLoginErrorPage(Driver);
    }

}
