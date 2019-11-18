package trainingday1.ninthtask;

import org.junit.Assert;
import org.junit.Test;

public class CalculationCircumferenceCircleTest {

    CalculationCircumferenceCircle forTest = new CalculationCircumferenceCircle();

    @Test
    public void correctRadius() {
        Assert.assertEquals("Circumference = 25,13 Circle area = 50,27", forTest.calculation(4));
        Assert.assertEquals("Circumference = 157,08 Circle area = 1963,50", forTest.calculation(25));
        Assert.assertEquals("Circumference = 56,55 Circle area = 254,47", forTest.calculation(9));
    }

    @Test
    public void negativeRadius() {
        Assert.assertEquals(" You cannot enter a negative radius or null.", forTest.calculation(-4));
        Assert.assertEquals(" You cannot enter a negative radius or null.", forTest.calculation(-1));
        Assert.assertEquals(" You cannot enter a negative radius or null.", forTest.calculation(0));
    }
}
