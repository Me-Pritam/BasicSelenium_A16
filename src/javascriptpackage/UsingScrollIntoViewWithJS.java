package javascriptpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingScrollIntoViewWithJS
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

         driver.get("https://www.worldometers.info/geography/flags-of-the-world/");

         JavascriptExecutor executor = (JavascriptExecutor) driver;

         executor.executeScript("document.querySelector(\"img[src='/images/flags/w240/in.webp']\").scrollIntoView({'behavior': 'smooth','block':'start'});");
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
