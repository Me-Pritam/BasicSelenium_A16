package actionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingClickAndHoldMethod
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver= new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

          driver.get("https://yonobusiness.sbi.bank.in");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c2785778308-3 icon-cancel')]"))
                          .click();

          driver.findElement(By.xpath("//button[.='Login']"))
                          .click();

          driver.findElement(By.xpath("//li[@id='loginOfmenu']"))
                          .click();

          WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='PASSWORD']")))
                  .sendKeys("Password@123456");

          Actions action = new Actions(driver);

          action.pause(Duration.ofSeconds(1))
                  .clickAndHold(wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//img[@src='assets/img/Revamp/icon_eye_close.svg']")))))
                  .pause(Duration.ofSeconds(1))
                  .release()
                  .perform();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
