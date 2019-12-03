package trainingday1.sixthtask;

import org.junit.Assert;
import org.junit.Test;
import trainingday1.sixthTask.HoursMinutesInGivenSeconds;

public class HoursMinutesInGivenSecondsTest {

    HoursMinutesInGivenSeconds forTest = new HoursMinutesInGivenSeconds();

    @Test
    public void correctSeconds() {
        Assert.assertEquals("1:40:0", forTest.calculateHoursMinutes(6000));
        Assert.assertEquals("1:40:1", forTest.calculateHoursMinutes(6001));
        Assert.assertEquals("19:6:5", forTest.calculateHoursMinutes(68765));
        Assert.assertEquals("12:30:0", forTest.calculateHoursMinutes(45000));
    }
}
