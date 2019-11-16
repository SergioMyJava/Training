package thirdtask;

import org.junit.Assert;
import org.junit.Test;
import trainingday1.thirdtask.AreaOfSquareInscribedInCircle;

public class AreaOfSquareInscribedInCircleTest {

    AreaOfSquareInscribedInCircle forTest = new AreaOfSquareInscribedInCircle();

    @Test
    public void correctAreas(){
        Assert.assertEquals(14,forTest.inscribedSquare(28));
        Assert.assertEquals(30,forTest.inscribedSquare(60));
        Assert.assertEquals(9,forTest.inscribedSquare(18));
    }

    @Test
    public void notCorrectAreas(){
        Assert.assertEquals(0,forTest.inscribedSquare(1));
        Assert.assertEquals(1,forTest.inscribedSquare(3));
        Assert.assertEquals(4,forTest.inscribedSquare(9));
    }
}
