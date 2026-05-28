package webdriver_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OeningBrowser
{
    public static void main(String[] args) {

        try{
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.tgsrtc.telangana.gov.in/");

            Thread.sleep(2000);

//            driver.switchTo().newWindow(WindowType.WINDOW);
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://emunicipal.telangana.gov.in/");

            Thread.sleep(2000);

//            driver.close();

            driver.quit();




        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
