package popuppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HandlingWebsiteWithoutSSLCertificates
{
    public static void main(String[] args)
    {
       try
       {
           ChromeOptions options = new ChromeOptions();

           options.setAcceptInsecureCerts(true);

           WebDriver driver = new ChromeDriver(options);

           driver.manage().window().maximize();

           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

           driver.get("https://expired.badssl.com/");
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
