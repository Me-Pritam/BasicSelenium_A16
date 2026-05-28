package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HandlingSavePasswordPopUp
{
    public static void main(String[] args)
    {
      try
      {
          Map<String, Objects> prefs = new HashMap<>();

          System.setProperty("webdriver.edge.driver","./msedgedriver.exe");

          WebDriver driver = new EdgeDriver();

          driver.manage().window().maximize();

          driver.get("https://the-internet.herokuapp.com/login");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



          driver.findElement(By.id("username"))
                  .sendKeys("tomsmith");

          driver.findElement(By.id("password"))
                  .sendKeys("SuperSecretPassword!");

          driver.findElement(By.xpath("//button[normalize-space(.)='Login']"))
                  .click();


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
