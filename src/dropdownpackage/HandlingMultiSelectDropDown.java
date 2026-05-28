package dropdownpackage;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandlingMultiSelectDropDown
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            Select selectMulti = new Select(driver.findElement(By.id("select-multiple-native")));

            if (selectMulti.isMultiple())
            {
//                selectMulti.selectByVisibleText("Mens Casual Premium ...");
//                selectMulti.selectByVisibleText("Silicon Power 256GB ...");
//                selectMulti.selectByVisibleText("Samsung 49-Inch CHG9...");
//                selectMulti.selectByVisibleText("Opna Women's Short S...");

                String productNames[] = {"Mens Casual Premium ...","Silicon Power 256GB ...","Samsung 49-Inch CHG9...","Opna Women's Short S..."};

                for(WebElement option : selectMulti.getOptions())
                {
                    if (Arrays.stream(productNames).anyMatch(option.getText()::equals))
                    {
                        option.click();
                    }
                }


                Thread.sleep(2000);

//                selectMulti.deselectByVisibleText("Mens Casual Premium ...");

//                selectMulti.deselectAll();

                List<WebElement> allSelectedOptions = selectMulti.getAllSelectedOptions();
                List<String> selectedProductNames = new ArrayList<>(allSelectedOptions.size());
                for(WebElement selectedOption: allSelectedOptions)
                {
                    selectedProductNames.add(selectedOption.getText());

                }

                if (selectedProductNames.equals(Arrays.asList(productNames)))
                {
                    System.out.println("The desired products are selected");

                }



            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
