import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C_Locators {

    //Chrome tools & Firefox tools. How do we find these locators?
    //Good & Bad Locators

    @Test
    public void c_AllLocators()
    {
        //Start a Chrome Instance
        WebDriver Driver = new ChromeDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://localhost:9292/locators");

        //By ID
        //ID is most peoples preferred choice of locator. They tend to be unqiue and the elements location on the page doesn't matter
        WebElement elementById =  Driver.findElement((By.id("user")));
        //Name, not as popular as the ID attribute, but again does tend to be unique
        WebElement elementByName = Driver.findElement(By.name("first_name"));
        //Class, a lot of the time a class isn't unique, but sometimes they are, a useful option
        //Note that using by.className we cannot match a class with more than one. WebDriver will match just one of the classes
        WebElement elementByClass = Driver.findElement(By.className("unique"));
        //tagName, we can find an element by its type. E.g. we can find an anchor on the page.
        //This is only really useful when the page only has one of the element you're searching for.
        WebElement elementByTagName = Driver.findElement(By.tagName("a"));

        //So the above are also great when your element has a unique characteristic, but what when it doesn't?
        //We can use CssSelectors and XPath to create queries to find elements

        //XPath. These creates a direct link to the element.
        //Thing of it as a fixed set of directions from start to finish. From the top of the DOM to the element needed
        WebElement elementByXPathFromBody = Driver.findElement(By.xpath("/html/body/div[2]/div/div/div[5]/div/input"));
        //However you don't have to go direct to the element, if there is something unique on the way, you can create an XPath that starts there.
        WebElement elementByXPath = Driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[5]/div/input"));

        //CssSelector. We can do the same using CssSelectors, and which also IMO look a lot nicer!
        WebElement elementByCssSelector = Driver.findElement(By.cssSelector("body div:nth-child(2) div div div:nth-child(17) div input"));
        //OK not this one!!!
        WebElement elementByDynamicCssSelector = Driver.findElement(By.cssSelector("#content input"));
        //How about this one?


        //LinkText does exactly what it says, it will look for an anchor(a) element on the page which contains the given text
        WebElement elemenyByLinkText = Driver.findElement(By.linkText("Learn more about why we need this"));
        //PartialLinkText, same as the above but we return the first link that contains the text. I've personally never needed to use this
        WebElement elementByPartialLinkTest = Driver.findElement(By.partialLinkText("Learn"));

        Driver.quit();
    }

    @Test
    public void c_InvalidLocator()
    {
        //Start a Chrome Instance
        WebDriver Driver = new ChromeDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://localhost:9292/locators");
        WebElement ElementByID = Driver.findElement(By.id("loginBox"));
        //NoSuchElementException is something you will see a lot

        Driver.quit();
    }

    @Test
    public void c_FindElements()
    {
        //Start a Firefox Instance
        WebDriver Driver = new ChromeDriver();
        //Navigate to a Website.
        Driver.navigate().to("http://localhost:9292/locators");

        List<WebElement> inputs = Driver.findElements(By.tagName("input"));

        WebElement ElementByTagFindAll = inputs.get(4);
        System.out.println(ElementByTagFindAll.getAttribute("placeholder"));
        //This should print out 'Country'

        Driver.quit();
    }

    //What is your preference??? Perhaps a video with slides and preferred strategy

    //CSS Game
    //http://flukeout.github.io/

    public void c_CreateYourOwn()
    {
        //Pick a website(s) of your choice
        //See if you can find some good locators
    }
}
