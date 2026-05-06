package webdriver_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver  driver = new ChromeDriver();

            driver.get("https://www.wikipedia.org/");

            Thread.sleep(4000);

            if (driver.getTitle().equals("Wikipedia"))
            {
                if (driver.getCurrentUrl().equals("https://www.wikipedia.org/"))
                {
                    System.out.println("Actual Desired Website is opened");
                }
                else {
                    System.out.println("Phishing URL");
                }
            }
            else {
                System.out.println("Desired Page is not opened");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
