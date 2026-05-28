package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HandlingSingleSelectDropDown
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
           driver.get("https://demowebshop.tricentis.com/books");
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

           Select sortByDropDown = new Select(driver.findElement(By.id("products-orderby")));

           sortByDropDown.selectByIndex(1);



           Thread.sleep(2000);

           Select displayDropDown = new Select(driver.findElement(By.name("products-pagesize")));

//           displayDropDown.selectByValue("https://demowebshop.tricentis.com/books?pagesize=12");

           displayDropDown.selectByVisibleText("12");

       }
       catch (Exception e)
       {
           e.printStackTrace();
       }

    }
}
