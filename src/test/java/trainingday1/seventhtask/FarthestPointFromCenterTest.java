package trainingday1.seventhtask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class FarthestPointFromCenterTest {

    FarthestPointFromCenter forTest = new FarthestPointFromCenter();
    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;
    int[] test6;
    int[] test7;
    int[] test8;
    int[] test9;

    @Before
    public void initial() {
        test1 = new int[]{34, 23};
        test2 = new int[]{7,6};
        test3 = new int[]{37, 26};
        test4 = new int[]{-5, -6};
        test5 = new int[]{-7, 6};
        test6 = new int[]{37, 26};
        test7 = new int[]{-5, -6};
        test8 = new int[]{-7, 6};
        test9 = new int[]{15, 26};
    }

    @Test
    public void positivePoint() {
        Assert.assertEquals(true, Arrays.equals(test1,forTest.calculateFarPoint(12,3,34,23)));
        Assert.assertEquals(true,Arrays.equals(test2,forTest.calculateFarPoint(5, 6, 7, 6)));
        Assert.assertEquals(true,Arrays.equals(test3,forTest.calculateFarPoint(15, 26, 37, 26)));
    }

    @Test
    public void negativePoint() {
        Assert.assertEquals(true,Arrays.equals(test4,forTest.calculateFarPoint(1, 2, -5, -6)));
        Assert.assertEquals(true,Arrays.equals(test5,forTest.calculateFarPoint(5, -6, -7, 6)));
        Assert.assertEquals(true,Arrays.equals(test6,forTest.calculateFarPoint(15, 26, 37, 26)));

    }

    @Test
    public void pointsAtTheSameDistance() {
        Assert.assertEquals(true,Arrays.equals(test7,forTest.calculateFarPoint(5, 6, -5, -6)));
        Assert.assertEquals(true,Arrays.equals(test8,forTest.calculateFarPoint(7, 6, -7, 6)));
        Assert.assertEquals(true,Arrays.equals(test9,forTest.calculateFarPoint(15, 26, 15, 26)));

    }
}
