package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingMoveToElement
{
    public static void main(String[] args)
    {
        try
        {
           System.setProperty("webdriver.edge.driver","./msedgedriver.exe");

           WebDriver driver = new EdgeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));

            driver.get("https://demowebshop.tricentis.com/");

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

            Actions action = new Actions(driver);

            action.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/computers']")))).perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
