package trainingday1.thirdtask;

import org.junit.Assert;
import org.junit.Test;
import trainingday1.thirdtask.AreaOfSquareInscribedInCircle;

public class AreaOfSquareInscribedInCircleTest {

    AreaOfSquareInscribedInCircle forTest = new AreaOfSquareInscribedInCircle();

    @Test
    public void correctAreas() {
        Assert.assertEquals(14, forTest.inscribedSquare(28), 0.0);
        Assert.assertEquals(30, forTest.inscribedSquare(60), 0.0);
        Assert.assertEquals(9, forTest.inscribedSquare(18), 0.0);
    }

    @Test
    public void notCorrectAreas() {
        Assert.assertEquals(0.5, forTest.inscribedSquare(1), 0.0);
        Assert.assertEquals(1.5, forTest.inscribedSquare(3), 0.0);
        Assert.assertEquals(4.5, forTest.inscribedSquare(9), 0.0);

    }
}
