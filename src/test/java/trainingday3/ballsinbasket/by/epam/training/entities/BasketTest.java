package trainingday3.ballsinbasket.by.epam.training.entities;

import trainingday3.ballsinbasket.by.epam.training.entities.Ball;
import trainingday3.ballsinbasket.by.epam.training.entities.Basket;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasketTest {
    Basket forTest = new Basket();

    @Before
    public void initial(){
        forTest.addBall(new Ball("Red",1));
        forTest.addBall(new Ball("Yellow",1));
        forTest.addBall(new Ball("Cat",1));
        forTest.addBall(new Ball("Blue",1));
        forTest.addBall(new Ball("Blue",1));
    }

    @Test
    public void testGetWeight(){
        Assert.assertEquals(5,forTest.getWeight());
    }

    @Test
    public void testGetBlueBalls(){
        Assert.assertEquals(2,forTest.getBlueBalls());
    }

    @Test
    public void testDeleteBall(){
        forTest.deleteBall();
        Assert.assertEquals(4,forTest.getWeight());
    }
}
