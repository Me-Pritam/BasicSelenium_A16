package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

public class UsingOverloadedMoveToElement
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.get("https://demowebshop.tricentis.com/");

            Actions action = new Actions(driver);

            WebElement logInLink = driver.findElement(By.xpath("//a[text()='Register']"));

            action.moveToElement(logInLink,50,0)
                    .click()
                    .perform();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
