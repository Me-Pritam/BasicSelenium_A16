package locatorapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByStartsWith
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(2000);

          driver.get("https://www.agoda.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//h6[text()='Flights']"))
                  .click();
          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[@aria-label='Close']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//div[text()='Departure']"))
                  .click();

          Thread.sleep(2000);

          for(;;)
          {
              String monthName = driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Caption DayPicker-Caption-Wide')]")).getText();

              if (monthName.equals("August 2026"))
              {
                  driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Caption DayPicker-Caption-Wide')]/..//span[text()='31']"))
                          .click();
                  break;
              }

              Thread.sleep(2000);

              driver.findElement(By.xpath("//button[@aria-label='Next Month']"))
                      .click();
          }

          Thread.sleep(1000);

          driver.findElement(By.xpath("//button[starts-with(.,'SEARCH')]"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();

      }
    }
}
