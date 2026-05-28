package robotpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class UsingMouseMoveMethod
{
    public static void main(String[] args)
    {
        try
        {
//            WebDriver driver = new ChromeDriver();
//
//            driver.manage().window().maximize();
//
//            driver.get("https://docs.oracle.com/en/java/");

            Robot robot = new Robot();

            robot.delay(2000);

//            robot.mouseMove( 650,750);
//
//            robot.delay(2000);
//
//            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
//            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);

//            robot.mouseWheel(5);

            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_WINDOWS);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
