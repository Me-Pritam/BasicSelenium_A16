package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class MultiSelectDropDown
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

            Select selectMulti = new Select(driver.findElement(By.xpath("//select[@id='select-multiple-native']")));

            if (selectMulti.isMultiple())
            {
//                selectMulti.selectByVisibleText("Mens Casual Premium ...");
//
//                selectMulti.selectByVisibleText("John Hardy Women's L...");
//
//                selectMulti.selectByVisibleText("Pierced Owl Rose Gol...");
//
//                selectMulti.selectByVisibleText("Mens Cotton Jacket...");

                String[] desiredProducts = {
                                            "Mens Casual Premium ..."
                                            ,"John Hardy Women's L..."
                                            ,"Pierced Owl Rose Gol..."
                                            ,"Mens Cotton Jacket..."
                                            ,"Mens Casual Slim Fit..."
                                            ,"Solid Gold Petite Mi..."
                                            ,"SanDisk SSD PLUS 1TB..."
                                            };

                List<WebElement> allOptions = selectMulti.getOptions();

                for(WebElement option : allOptions)
                {
                    if (Arrays.stream(desiredProducts).anyMatch(option.getText()::equals))
                    {
                        option.click();
                    }
                }
            }

            Thread.sleep(2000);

//            selectMulti.deselectAll();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
