package popuppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpeningOperaBrowser
{
    public static void main(String[] args) {

        try
        {
            ChromeOptions options = new ChromeOptions();

            options.setBinary("C:/Program Files/BraveSoftware/Brave-Browser/Application/brave.exe");

            WebDriver driver = new ChromeDriver(options);

            driver.manage().window().maximize();

            driver.get("https://www.isro.gov.in/");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
