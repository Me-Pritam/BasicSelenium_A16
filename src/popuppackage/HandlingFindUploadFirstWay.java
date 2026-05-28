package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class HandlingFindUploadFirstWay
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

          driver.get("https://the-internet.herokuapp.com/upload");

          Thread.sleep(2000);

          driver.findElement(By.id("file-upload")).sendKeys("C:/Users/User/Desktop/DummyUpload.txt");

          Thread.sleep(2000);

          StringSelection path = new StringSelection("C:\\Users\\User\\Desktop\\DummyUpload.txt");

          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);

          driver.findElement(By.xpath("//div[@id='drag-drop-upload']"))
                  .click();

          Robot robot = new Robot();

          robot.delay(2000);

          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_V);
          robot.delay(300);
          robot.keyRelease(KeyEvent.VK_V);
          robot.keyRelease(KeyEvent.VK_CONTROL);

          robot.delay(1000);

          robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
