package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YotubeShareButton
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            driver.get("https://www.youtube.com/");

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='search_query']")))
                    .sendKeys("Java Tutorials");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Search']")))
                    .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[@class='ytLockupMetadataViewModelHeadingReset'])[1]")))
                    .click();

            Actions action = new Actions(driver);

            action.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Share']"))))
                    .pause(Duration.ofSeconds(3))
                    .click(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Share']"))))
                    .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
