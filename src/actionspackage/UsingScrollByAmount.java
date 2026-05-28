package actionspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingScrollByAmount
{
    public static void main(String[] args) {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            driver.get("https://www.selenium.dev/documentation/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            Actions action = new Actions(driver);

            action.pause(Duration.ofSeconds(2))
                    .scrollByAmount(0,4000)
                    .perform();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
