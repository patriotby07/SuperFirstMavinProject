import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testCalc() {
        double actual = Main.calc(2, 2, '+');
        Assert.assertEquals(actual,4);
    }

    @Test
    public void testCalcDiv() {
        double actual = Main.calc(2, 0, '/');
        Assert.assertEquals(actual,0);
    }
}
