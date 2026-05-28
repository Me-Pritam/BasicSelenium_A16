package framespackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingSimpleFrame
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

          driver.get("https://demo.automationtesting.in/Frames.html");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='SingleFrame']")));

          driver.findElement(By.xpath("//input[@type='text']"))
                  .sendKeys("Automation");

          driver.switchTo().defaultContent();

          driver.findElement(By.xpath("//a[@href='#Multiple']"))
                  .click();

          driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));

          driver.switchTo().frame(driver.findElement(By.xpath("//h5[text()='Nested iFrames']/following-sibling::iframe[@src='SingleFrame.html']")));

          driver.findElement(By.xpath("//input[@type='text']"))
                  .sendKeys("SDET");


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
