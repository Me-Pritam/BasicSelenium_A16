package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingSendKeysMethod
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            driver.get("https://www.selenium.dev/documentation/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            Actions actions = new Actions(driver);

//            actions.pause(Duration.ofSeconds(2))
//                    .keyDown(Keys.CONTROL)
//                    .sendKeys("A")
//                    .keyUp(Keys.CONTROL)
//                    .perform();


            actions.click(driver.findElement(By.xpath("//button[@aria-label='Search']")))
                    .perform();

            actions.sendKeys(driver.findElement(By.xpath("//input[@id='docsearch-input']")),"Actions API")
                    .perform();

            actions.keyDown(driver.findElement(By.xpath("//div[@class='DocSearch-Hit-Container' and .='Actions API']")),Keys.ENTER)
                    .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
