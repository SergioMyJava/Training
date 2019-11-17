package trainingday1.seventhtask;

import org.junit.Assert;
import org.junit.Test;

public class FarthestPointFromCenterTest {

    FarthestPointFromCenter forTest = new FarthestPointFromCenter();

    @Test
    public void positivePoint() {
        Assert.assertEquals("Closer point (1,2)", forTest.calculateFarPoint(1, 2, 5, 6));
        Assert.assertEquals("Closer point (5,6)", forTest.calculateFarPoint(5, 6, 7, 6));
        Assert.assertEquals("Closer point (15,26)", forTest.calculateFarPoint(15, 26, 37, 26));
    }

        @Test
        public void negativePoint () {
            Assert.assertEquals("Closer point (1,2)", forTest.calculateFarPoint(1, 2, -5, -6));
            Assert.assertEquals("Closer point (5,-6)", forTest.calculateFarPoint(5, -6, -7, 6));
            Assert.assertEquals("Closer point (-15,26)", forTest.calculateFarPoint(15, 26, 37, 26));

    }
}
