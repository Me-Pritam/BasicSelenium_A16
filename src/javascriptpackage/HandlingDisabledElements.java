package javascriptpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingDisabledElements
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

          driver.get("https://practicetestautomation.com/practice-test-exceptions/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          JavascriptExecutor executor = (JavascriptExecutor) driver;

          WebElement inputField = driver.findElement(By.cssSelector("input.input-field"));

          executor.executeScript("arguments[0].removeAttribute('disabled');",inputField);

          executor.executeScript("arguments[0].value='Kheer'",inputField);

//          executor.executeScript("let inputField = document.querySelector(\"input.input-field\");\n" +
//                                         "inputField.removeAttribute(\"disabled\");\n" +
//                                         "setTimeout(()=>inputField.value=\"Kheer\",2000);");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
