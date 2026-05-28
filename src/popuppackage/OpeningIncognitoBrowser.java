package popuppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class OpeningIncognitoBrowser
{
    public static void main(String[] args)
    {
      try
      {
          ChromeOptions options = new ChromeOptions();

          options.addArguments("--incognito");

          WebDriver driver = new ChromeDriver();

          String normalTab= driver.getWindowHandle();

          driver.manage().window().maximize();

          Robot robot = new Robot();

          robot.delay(2000);

          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_SHIFT);
          robot.keyPress(KeyEvent.VK_N);
          robot.delay(300);
          robot.keyRelease(KeyEvent.VK_N);
          robot.keyRelease(KeyEvent.VK_SHIFT);
          robot.keyRelease(KeyEvent.VK_CONTROL);

          Thread.sleep(2000);

          Set<String> allTabs = driver.getWindowHandles();

          for(String tab: allTabs)
          {
              if (!tab.equals(normalTab))
              {
                  driver.switchTo().window(tab);
                  break;
              }
          }
          driver.get("https://x.com/");

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
