package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingMoveByOffset
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.get("https://excalidraw.com/");

            driver.manage().window().maximize();

            Actions action = new Actions(driver);

            action.moveToElement(driver.findElement(By.xpath("//input[@aria-label='Draw']")))
                    .pause(Duration.ofSeconds(1))
                    .click()
                    .pause(Duration.ofSeconds(1))
                    .moveByOffset(-200,200)
                    .pause(Duration.ofSeconds(1))
                    .clickAndHold()
                    .pause(Duration.ofSeconds(1))
                    .moveByOffset(200,0)
                    .pause(Duration.ofSeconds(2))
                    .release()
                    .pause(Duration.ofSeconds(1))
                    .clickAndHold()
                    .pause(Duration.ofSeconds(1))
                    .moveByOffset(0,200)
                    .pause(Duration.ofSeconds(1))
                    .release()
                    .pause(Duration.ofSeconds(1))
                    .clickAndHold()
                    .moveByOffset(-200,0)
                    .pause(Duration.ofSeconds(1))
                    .release()
                    .pause(Duration.ofSeconds(1))
                    .clickAndHold()
                    .moveByOffset(0,-200)
                    .pause(Duration.ofSeconds(1))
                    .release()
                    .perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
