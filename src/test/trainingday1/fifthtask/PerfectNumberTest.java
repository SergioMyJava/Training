package trainingday1.fifthtask;

import org.junit.Assert;
import org.junit.Test;

public class PerfectNumberTest {

    PerfectNumber forTest = new PerfectNumber();

    @Test
    public void eventNumber(){
        Assert.assertEquals(true,forTest.checkNumberForPerfection(6));
        Assert.assertEquals(true,forTest.checkNumberForPerfection(28));
        Assert.assertEquals(true,forTest.checkNumberForPerfection(496));
        Assert.assertEquals(true,forTest.checkNumberForPerfection(8128));
    }

    @Test
    public void notEventNumber(){
        Assert.assertEquals(false,forTest.checkNumberForPerfection(4));
        Assert.assertEquals(false,forTest.checkNumberForPerfection(66));
        Assert.assertEquals(false,forTest.checkNumberForPerfection(768));
        Assert.assertEquals(false,forTest.checkNumberForPerfection(61));
    }
}
