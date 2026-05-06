package locatorapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpeningEdgeBrowser
{
    public static void main(String[] args) {

        try
        {
          System.setProperty("webdriver.edge.driver","./msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
