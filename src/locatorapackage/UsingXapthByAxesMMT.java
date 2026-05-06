package locatorapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXapthByAxesMMT
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.get("https://www.makemytrip.com/flights");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//span[@data-cy='closeModal']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox dates inactiveWidget')]"))
                  .click();

          Thread.sleep(3000);

          for(;;)
          {
              String monthName = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();

              if (monthName.equals("August 2026"))
              {
                  driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/following::p[text()='31']"))
                          .click();

                  break;
              }

              Thread.sleep(1000);

              driver.findElement(By.xpath("//span[@aria-label='Next Month']"))
                      .click();
          }

          Thread.sleep(2000);

          driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox dates reDates inactiveWidget')]"))
                  .click();

          for(;;)
          {
              String monthName = driver.findElement(By.xpath("//div[@class='DayPicker-Month']/child::div[@class='DayPicker-Caption']")).getText();

              if (monthName.contains("September"))
              {
                  driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/following::p[text()='20']"))
                          .click();

                  break;
              }

              Thread.sleep(1000);

              driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]"))
                      .click();



          }}
      catch (Exception e)
      {
          e.printStackTrace();

      }
    }
}
