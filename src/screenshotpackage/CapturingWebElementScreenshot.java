package screenshotpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;

public class CapturingWebElementScreenshot
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

          driver.get("https://www.abhibus.com/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          WebElement busLink = driver.findElement(By.xpath("//a[@id='bus-link']"));

          File tempFile = busLink.getScreenshotAs(OutputType.FILE);

          File srcFile = new File("./Screenshot/ElementSS.png");

          FileHandler.copy(tempFile,srcFile);

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
