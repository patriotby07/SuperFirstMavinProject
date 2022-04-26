import org.testng.Assert;
import org.testng.annotations.Test;

public class Main_1Test {

    @Test
    public void testAbbr4() {
        String result = Main_1.abbr("IgorKlimenko", 4);

        Assert.assertEquals(result, "I...");
    }

    @Test
    public void testAbbr8() {
        String result = Main_1.abbr("Hello World", 8);

        Assert.assertEquals(result, "Hello...");
    }
}

