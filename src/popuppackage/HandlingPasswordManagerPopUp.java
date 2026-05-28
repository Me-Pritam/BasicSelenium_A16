package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class HandlingPasswordManagerPopUp
{
    public static void main(String[] args)
    {
      try
      {
          Map<String,Object> prefs = new HashMap<>();

//          prefs.put("profile.default_content_setting_values.notifications",2);

//            prefs.put("credintials_enable_service",false);
//            prefs.put("profile.password_manager_enabled",false);
            prefs.put("profile.password_manager_leak_detection",false);
          ChromeOptions options = new ChromeOptions();

//          options.setExperimentalOption("prefs",prefs);

          options.addArguments("--guest");

          WebDriver driver = new ChromeDriver(options);

          driver.manage().window().maximize();

          driver.get("https://www.saucedemo.com/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.findElement(By.id("user-name")).sendKeys("standard_user");

          driver.findElement(By.id("password")).sendKeys("secret_sauce");

          driver.findElement(By.id("login-button")).click();


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
