package javascriptpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingHiddenElements
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");

          JavascriptExecutor executor = (JavascriptExecutor) driver;

          executor.executeScript("let button = document.querySelector(\"label[for='input2']~input\");\n" +
                  "button.removeAttribute('class');\n" +
                  "setTimeout(()=>button.value=\"Baby John\",2000);");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
