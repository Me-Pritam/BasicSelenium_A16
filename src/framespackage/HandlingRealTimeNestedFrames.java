package framespackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingRealTimeNestedFrames
{
    public static void main(String[] args) {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.hyrtutorials.com/p/frames-practice.html#google_vignette");

            Actions action = new Actions(driver);

            action.scrollToElement(driver.findElement(By.xpath("//a[text()='Windows Automation']")))
                    .perform();

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm3']")));

            driver.findElement(By.xpath("//select[@id='selectnav2']"))
                    .click();

            action.scrollByAmount(0,600).perform();

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));

            driver.findElement(By.xpath("//a[@href='https://www.facebook.com/HYRTutorials/']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
