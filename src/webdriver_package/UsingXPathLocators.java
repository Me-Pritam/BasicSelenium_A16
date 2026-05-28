package webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingXPathLocators
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://demowebshop.tricentis.com/");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

          driver.findElement(By.xpath("//a[@href='/register']")).click();

          driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("JOhn");
      } catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
