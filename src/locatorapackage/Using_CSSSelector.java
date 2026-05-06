package locatorapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_CSSSelector
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.instagram.com/");

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("input[name='email']"))
                  .sendKeys("");

          Thread.sleep(1000);

          driver.findElement(By.cssSelector("input[name='pass']"))
                  .sendKeys("");

          Thread.sleep(2000);


          driver.findElement(By.cssSelector("div[aria-label='Log In']"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
