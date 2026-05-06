package locatorapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ClassName_Locator
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();
          Thread.sleep(1000);
          driver.manage().window().maximize();
          Thread.sleep(1000);
          driver.get("https://demowebshop.tricentis.com/");
          Thread.sleep(2000);
          driver.findElement(By.className("ico-register")).click();
      }
        catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
