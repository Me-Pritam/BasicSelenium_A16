package locatorapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySurrounding
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();

          driver.get("https://www.makemytrip.com/flights/");

          Thread.sleep(4000);

          driver.findElement(By.xpath("//span[@data-cy='closeModal']"))
                  .click();

          Thread.sleep(2000);

//          driver.findElement(By.xpath("//button[.='Back to Classic Search']"))
//                          .click();
//
//          Thread.sleep(2000);

          driver.findElement(By.xpath("//label[@for='departure']"))
                  .click();

          Thread.sleep(2000);

          while(true)
          {
              String monthName= driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();

              if (monthName.equals("August 2026"))
              {
                  driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/..//p[text()='31']"))
                          .click();
                  break;
              }

              Thread.sleep(2000);
              driver.findElement(By.xpath("//span[@aria-label='Next Month']"))
                      .click();
          }


      }
      catch (Exception e)
      {
          e.printStackTrace();

      }
    }
}
