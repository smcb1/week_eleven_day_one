import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void isFull() {
        assertEquals(100, waterbottle.isFull(), 0.01);
    }

    @Test
    public void isEmpty() {
        assertEquals(0, waterbottle.isEmpty(), 0.01);
    }

    @Test
    public void takeDrink() {
        assertEquals(90, waterbottle.takeDrink(), 0.01);
    }
}
