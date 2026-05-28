package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingClickMethods
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.get("https://vinothqaacademy.com/mouse-event");

          Actions action = new Actions(driver);

//          action.click(driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']/descendant::a[text()='Home']")))
//                  .perform();

          action.doubleClick(driver.findElement(By.xpath("//button[@id='doubleBtn']")))
                  .perform();
      }
      catch(Exception e)
      {

      }
    }
}
