package framespackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingRealtimeFrame
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.get("https://www.stanley.edu.in/");

          Actions action = new Actions(driver);

          action.scrollToElement(driver.findElement(By.xpath("//div[@id='comp-mnzmxgr3']")))
                  .perform();

          driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Google Maps']")));

          driver.findElement(By.xpath("//button[@aria-label='Toggle fullscreen view']"))
                  .click();

          Thread.sleep(2000);

          driver.close();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
