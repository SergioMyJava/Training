package trainingday1.eighttask;

import org.junit.Assert;
import org.junit.Test;
import trainingday1.eighthtask.Function;

public class FunctionTest {

    Function forTest = new Function();

    @Test
    public void moreThanThree() {
        Assert.assertEquals(-9, forTest.functionSolution(6), 0.0);
        Assert.assertEquals(-457641, forTest.functionSolution(678), 0.0);
        Assert.assertEquals(9, forTest.functionSolution(3), 0.0);
    }

    @Test
    public void lessThree() {
        Assert.assertEquals(0.5, forTest.functionSolution(2), 0.0);
        Assert.assertEquals(-0.2, forTest.functionSolution(1), 0.0);
        Assert.assertEquals(-0.16666666666666666, forTest.functionSolution(0), 0.0);
        Assert.assertEquals(-0.07142857142857142, forTest.functionSolution(-2), 0.00);
    }

}
