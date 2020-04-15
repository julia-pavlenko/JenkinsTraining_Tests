import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    @Test
    public static void SimpleSeleniumTest()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\alex\\Desktop\\JenkinsTraining\\chromedriver_win32\\chromedriver.exe");

        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        // An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time
        // when trying to find an element or elements if they are not immediately available.
        // The default setting is 0. Once set, the implicit wait is set for the life of the WebDriver object instance.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Maximize the browser window to fit into screen
        driver.manage().window().maximize();

        // Visit Google
        driver.get("http://www.google.com");

        String actualPageTitle = driver.getTitle();

        // Check the title of the page
        System.out.println("Page title is: " + actualPageTitle);

        Assert.assertEquals(actualPageTitle, "Google");

        //Close the browser
        driver.quit();
    }
}
