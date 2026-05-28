package javascriptpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingScrollToFOrSeleniumWebElement
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.get("https://www.worldometers.info/geography/flags-of-the-world/");

          Thread.sleep(2000);

          WebElement kroeanFLag = driver.findElement(By.xpath("//img[@src='/images/flags/w240/kr.webp']"));
          WebElement southAfricanFlag= driver.findElement(By.xpath("//img[@src='/images/flags/w240/za.webp']"));


          JavascriptExecutor executor = (JavascriptExecutor) driver;

          executor.executeScript("arguments[0].scrollIntoView({'behavior':'smooth','block':'start'});setTimeout(()=>arguments[1].click(),2000)",kroeanFLag,southAfricanFlag);
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
