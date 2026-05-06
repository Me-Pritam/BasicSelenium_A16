package webdriver_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetPageSource
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            Thread.sleep(2000);

            driver.get("https://www.amazon.in/");

            Thread.sleep(2000);

            System.out.println(driver.getPageSource());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
