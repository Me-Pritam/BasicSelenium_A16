package javascriptpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PerfromingScrollActions
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver= new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.amazon.in/");

          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='twotabsearchtextbox']")));

          JavascriptExecutor executor = (JavascriptExecutor) driver;

          executor.executeScript("window.scrollTo(0,1000);");

          Thread.sleep(2000);

          executor.executeScript("window.scrollTo(0,1000);");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
