package trainingday4.by.epam.training.simplearrayconsole.entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleArrayListTest {

    SimpleArrayList testArray1 = new SimpleArrayList();
    SimpleArrayList testArray2 = new SimpleArrayList(6);
    SimpleArrayList testArray3;
    Collection testArrayConstructor = new ArrayList();

    @Before
    public void initial() {
        testArray1.add(1);
        testArray1.add(2);
        testArray1.add(3);
        testArray1.add(4);
        testArray1.add(5);

        testArray2.add(1);
        testArray2.add(2);
        testArray2.add(3);
        testArray2.add(4);
        testArray2.add(5);

        testArrayConstructor.add(1);
        testArrayConstructor.add(456);
        testArrayConstructor.add(132);
        testArrayConstructor.add(155);
        testArrayConstructor.add(134);
        testArray3 = new SimpleArrayList(testArrayConstructor);
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(true, testArray1.add(6));
        Assert.assertEquals(true, testArray2.add(6));
    }

    @Test
    public void testEqualse() {
        Assert.assertEquals(true, testArray1.equals(testArray2));
        Assert.assertEquals(true, testArray2.equals(testArray1));
        Assert.assertEquals(false, testArray3.equals(testArray2));
    }

    @Test
    public void testGet() {
        Assert.assertEquals(2, testArray1.get(2));
        Assert.assertEquals(5, testArray2.get(5));
        Assert.assertEquals(456, testArray3.get(2));
    }

    @Test
    public void testDelet() {
        Assert.assertEquals(true, testArray1.delete(4));
        Assert.assertEquals(5, testArray1.get(4));
        Assert.assertEquals(4, testArray1.size());
    }

    @Test
    public void testSet() {
        Assert.assertEquals(2, testArray1.set(2, 4567));
        Assert.assertEquals(4567, testArray1.get(2));
        Assert.assertEquals(134, testArray3.set(5, 555));
        Assert.assertEquals(555, testArray3.get(5));
    }

    @Test
    public void testtoString() {
        Assert.assertEquals("1 2 3 4 5 ", testArray1.toString());
        Assert.assertEquals("1 2 3 4 5 ", testArray2.toString());
        Assert.assertEquals("1 456 132 155 134 ", testArray3.toString());
    }

    @Test
    public void testhashCode() {
        Assert.assertEquals(167772160, testArray1.hashCode());
        Assert.assertEquals(35754144, testArray2.hashCode());
        Assert.assertEquals(16131046, testArray3.hashCode());
    }
}