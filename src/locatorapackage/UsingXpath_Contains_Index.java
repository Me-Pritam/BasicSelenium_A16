package locatorapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath_Contains_Index
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          Thread.sleep(1000);

          driver.manage().window().maximize();

          Thread.sleep(1000);

          driver.get("https://www.youtube.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@name='search_query']"))
                  .sendKeys("The Godfather Movie");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[@title='Search']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("(//a[contains(@aria-label,'THE GODFATHER Full Movie')])[1]"))
                  .click();

          driver.manage().window().fullscreen();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
}
