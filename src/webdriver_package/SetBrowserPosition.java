package webdriver_package;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserPosition
{
    public static void main(String[] args)
    {
      try
      {
        WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);

        driver.get("https://www.snapchat.com/");

        Thread.sleep(2000);

        driver.manage().window().setSize(new Dimension(500,500));

        Thread.sleep(1000);

        driver.manage().window().setPosition(new Point(200,200));

          Thread.sleep(500);

          driver.manage().window().setPosition(new Point(800,200));

          Thread.sleep(500);

          driver.manage().window().setPosition(new Point(400,600));

          Thread.sleep(500);

          driver.manage().window().setPosition(new Point(100,800));

          Thread.sleep(500);

          System.out.println(driver.manage().window().getPosition());
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
