package trainingday1.tenthTask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TangentFunctionInSectionTest {


    TangentFunctionInSection forTest = new TangentFunctionInSection();
    List firstPointResalt = new ArrayList();
    List secondPointResalt = new ArrayList();
    List thirdPoint = new ArrayList();

    @Before
    public void initialization() {
        firstPointResalt.add("x=1.0F(x)=1,56");
        firstPointResalt.add("x=2.0F(x)=-2,19");
        firstPointResalt.add("x=3.0F(x)=-0,14");
        firstPointResalt.add("x=4.0F(x)=1,16");
        firstPointResalt.add("x=5.0F(x)=-3,38");

        secondPointResalt.add("x=0.5F(x)=0,55");
        secondPointResalt.add("x=1.0F(x)=1,56");
        secondPointResalt.add("x=1.5F(x)=14,10");
        secondPointResalt.add("x=2.0F(x)=-2,19");
        secondPointResalt.add("x=2.5F(x)=-0,75");
        secondPointResalt.add("x=3.0F(x)=-0,14");
        secondPointResalt.add("x=3.5F(x)=0,37");
        secondPointResalt.add("x=4.0F(x)=1,16");
        secondPointResalt.add("x=4.5F(x)=4,64");
        secondPointResalt.add("x=5.0F(x)=-3,38");

        thirdPoint.add("x=0.1F(x)=0,10");
        thirdPoint.add("x=0.6F(x)=0,68");
        thirdPoint.add("x=1.1F(x)=1,96");
        thirdPoint.add("x=1.6F(x)=-34,23");
        thirdPoint.add("x=2.1F(x)=-1,71");
        thirdPoint.add("x=2.6F(x)=-0,60");
    }

    @Test
    public void checkFunction() {
        Assert.assertEquals(firstPointResalt, forTest.calculationFunction(1, 5, 1));
        Assert.assertEquals(secondPointResalt, forTest.calculationFunction(0.5, 5, 0.5));
        Assert.assertEquals(firstPointResalt, forTest.calculationFunction(1, 5, 1));
    }
}


