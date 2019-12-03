package trainingday1.secondtask;

import org.junit.Assert;
import org.junit.Test;
import trainingday1.secondtask.DaysInMonth;

import java.time.DateTimeException;

public class DaysInMonthTest {

    DaysInMonth forTests = new DaysInMonth();

    @Test
    public void correctDate() {
        Assert.assertEquals(31, forTests.calculateDaysInMonth(1, 12));
        Assert.assertEquals(30, forTests.calculateDaysInMonth(2019, 11));
        Assert.assertEquals(31, forTests.calculateDaysInMonth(2018, 1));
    }

    @Test
    public void notCorrectDate() {
        Assert.assertEquals(-1, forTests.calculateDaysInMonth(3000, 11));
        Assert.assertEquals(-1, forTests.calculateDaysInMonth(1000, 17));
        Assert.assertEquals(-1, forTests.calculateDaysInMonth(10000, 13));
    }
}
