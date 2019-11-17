package trainingday1.fourthtask;

import org.junit.Assert;
import org.junit.Test;

public class DeterminationEvenNumbersTest {

    DeterminationEvenNumbers forTest = new DeterminationEvenNumbers();

    @Test
    public void allEven(){
        Assert.assertEquals(true,forTest.definitionEven(4,6,8,22));
        Assert.assertEquals(true,forTest.definitionEven(44,656,8888,222));
        Assert.assertEquals(true,forTest.definitionEven(8,64,88,22));
    }

    @Test
    public void twoEven(){
        Assert.assertEquals(true,forTest.definitionEven(4,3,1,22));
        Assert.assertEquals(true,forTest.definitionEven(1,656,8888,9));
        Assert.assertEquals(true,forTest.definitionEven(1,5,88,22));
        Assert.assertEquals(true,forTest.definitionEven(12,50,89,21));
    }

    @Test
    public void oneEven(){
        Assert.assertEquals(false,forTest.definitionEven(4,3,1,23));
        Assert.assertEquals(false,forTest.definitionEven(1,656,8889,9));
        Assert.assertEquals(false,forTest.definitionEven(1,5,83,22));
        Assert.assertEquals(false,forTest.definitionEven(12,51,89,21));
    }
}
