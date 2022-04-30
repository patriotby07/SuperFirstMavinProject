import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FirstTest extends BaseUtils{
    WebDriver driver = new EdgeDriver();

    @BeforeMethod
    public void Base() {
        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void Test() throws AWTException {
        driver.findElement(By.name("q")).sendKeys("Selenium");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);

        }

    @AfterMethod
        void Close() {
//        driver.close();
    }
}
