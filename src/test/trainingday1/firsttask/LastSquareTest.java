package trainingday1.firsttask;

import org.junit.Assert;
import org.junit.Test;
import trainingday1.firsttask.LastSquare;

public class LastSquareTest {

    LastSquare forTest = new LastSquare();

    @Test
    public void positiveNumbers(){
        Assert.assertEquals(9,forTest.calculation(53));
        Assert.assertEquals(5,forTest.calculation(345));
        Assert.assertEquals(5,forTest.calculation(7865));
    }

    @Test
    public void negativeNumbers(){
        Assert.assertEquals(9,forTest.calculation(-3));
        Assert.assertEquals(5,forTest.calculation(-45));
        Assert.assertEquals(5,forTest.calculation(-65));
    }

}
