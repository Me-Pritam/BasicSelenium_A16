package locatorapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Id_Name_Locator
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          Thread.sleep(1000);

          driver.manage().window().maximize();

          Thread.sleep(1000);


          driver.get("https://demowebshop.tricentis.com/login");

          Thread.sleep(2000);

          driver.findElement(By.id("Email")).sendKeys("demomail@gmail.com");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
