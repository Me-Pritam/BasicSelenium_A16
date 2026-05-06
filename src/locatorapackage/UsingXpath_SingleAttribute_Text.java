package locatorapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath_SingleAttribute_Text
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          Thread.sleep(1000);

          driver.manage().window().maximize();

          Thread.sleep(1000);

          driver.get("https://chat.qspiders.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@name='username']"))
                  .sendKeys("johndoe@gmailo.com");

          Thread.sleep(1000);

          driver.findElement(By.xpath("//button[text()='Login']"))
                  .click();

      }
      catch (Exception e)
      {
          e.printStackTrace();

      }
    }
}
