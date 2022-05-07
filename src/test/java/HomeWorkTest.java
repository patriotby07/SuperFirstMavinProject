import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;


public class HomeWorkTest {

    WebDriver driver;

    @Test
    public void testCheckAddress() {
        String address = "Полесская 14";

        WebElement actualResult = driver.findElement(By.cssSelector(".name-office"));

        Assert.assertEquals(actualResult.getText(), "Гомель, Полесская 14");

    }

    @BeforeClass //запускается один раз в начале и все
    public void beforeClass() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\patri\\Downloads\\driver_EDGE\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://davinagaz.by/");
        driver.findElement(By.xpath("//b[text()= ' Полесская 14']")).click();
    }

//    @BeforeMethod //запускается перед каждым тестом
//    public void beforeMethod() {
//
//        driver.get("https://davinagaz.by/");
//        driver.findElement(By.xpath("//b[text()= ' Полесская 14']")).click();
//    }

    @Test //второй вариант первого теста
    public void testCheckAddressNew() {
        String address = "Полесская 14";

        WebElement actualResult = driver.findElement(By.cssSelector(".name-office"));


        Assert.assertTrue(actualResult.getText().contains(address));
    }

    @Test
    public void test() throws InterruptedException {
        String expectedResult = "Аккумулятор";

        WebElement menu = driver.findElement(By.xpath("//a[text()='ТО и фильтра']"));

        Actions action = new Actions(driver); //создали объект который будет раскрывать меню
        action.moveToElement(menu).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Аккумулятор']")).click();
        Thread.sleep(1000);

        WebElement actualResult = driver.findElement(By.tagName("h1"));

        Assert.assertEquals(actualResult.getText(), expectedResult.toUpperCase());

    }

    @AfterClass //закрывает драйвер после всех тестов
    public void afterClass() {
        driver.close();
    }
}
