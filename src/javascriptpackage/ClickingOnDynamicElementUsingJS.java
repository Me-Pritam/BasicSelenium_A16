package javascriptpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClickingOnDynamicElementUsingJS
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://www.amazon.in/");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));

            JavascriptExecutor executor = (JavascriptExecutor) driver;

            executor.executeScript("document.querySelector(\"button#navBackToTop\").scrollIntoView(false);\n" +
                                            "setTimeout(()=>{\n" +
                                            "document.querySelector(\"div.rhf-state-signin span.a-button-inner>a\").click();\n" +
                                            "},2000);");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
