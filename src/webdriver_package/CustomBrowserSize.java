package webdriver_package;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomBrowserSize
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          Thread.sleep(2000);

          driver.get("https://www.ajio.com/");

          Thread.sleep(2000);

          driver.manage().window().setSize(new Dimension(100,100));

          Thread.sleep(500);

          driver.manage().window().setSize(new Dimension(300,100));

          Thread.sleep(500);

          driver.manage().window().setSize(new Dimension(600,800));

          Thread.sleep(2000);

          driver.manage().window().setSize(new Dimension(200,500));

          Thread.sleep(1000);

          System.out.println(driver.manage().window().getSize());







      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
