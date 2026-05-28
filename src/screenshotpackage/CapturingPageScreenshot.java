package screenshotpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class CapturingPageScreenshot
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://www.easemytrip.com/");

//          Set<Cookie> allCookies = driver.manage().getCookies();

          LogEntries allBrowserLogs = driver.manage().logs().get(LogType.BROWSER);

          for(LogEntry logs : allBrowserLogs)
          {
              System.out.println(logs.getMessage());
          }

//          for (Cookie cookie : allCookies)
//          {
//              System.out.println(cookie.getName());
//          }

          TakesScreenshot screenshot = (TakesScreenshot) driver;

          File tempFile = screenshot.getScreenshotAs(OutputType.FILE);

          File srcFile = new File("./Screenshot/firstSS.png");

          FileHandler.copy(tempFile,srcFile);



      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
