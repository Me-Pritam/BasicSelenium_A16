package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class HandlingNonSelectSingleDropDown
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://vinothqaacademy.com/drop-down/");

            Actions action = new Actions(driver);

            action.click(driver.findElement(By.xpath("//span[text()='Choose A City']")))
                    .perform();

            List<WebElement> allCities = driver.findElements(By.xpath("//ul[@id='select2-simpleDropdown-results']/li"));

            for(WebElement city : allCities)
            {
                if (city.getText().equals("Tokyo"))
                {
                    action.click(city).perform();
                    break;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
