package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingDragAndDrop
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://demoqa.com/droppable");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          Actions action = new Actions(driver);

         WebElement srcElement = driver.findElement(By.xpath("//div[@id='draggable']"));
         WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));

//          action.pause(Duration.ofSeconds(2))
//                  .dragAndDrop(srcElement,targetElement)
//                  .perform();

          action.pause(Duration.ofSeconds(2))
                  .dragAndDropBy(srcElement,150,9)
                  .pause(Duration.ofSeconds(1))
                  .dragAndDropBy(srcElement,86,74)
                  .pause(Duration.ofSeconds(1))
                  .dragAndDropBy(srcElement,-250,-80)
                  .perform();


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
