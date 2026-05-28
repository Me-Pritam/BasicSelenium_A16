package dropdownpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NonSelectSingleDropDown
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            driver.get("https://vinothqaacademy.com/drop-down/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
