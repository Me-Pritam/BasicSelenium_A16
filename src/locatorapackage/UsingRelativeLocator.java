package locatorapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingRelativeLocator
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.redbus.in/");

          Thread.sleep(2000);

          driver.findElement(RelativeLocator.with(By.cssSelector("[aria-label='Hotels']"))
                                            .toRightOf(By.cssSelector("[aria-label='Bus tickets']")))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
