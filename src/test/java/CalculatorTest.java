import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void add() {

        assertEquals(12, calculator.add(10, 2));
    }

    @Test
    public void subtract() {

        assertEquals(8, calculator.subtract(10, 2));
    }

    @Test
    public void multiply() {

        assertEquals(20, calculator.multiply(10, 2));
    }

    @Test
    public void divide() {

        assertEquals(5, calculator.divide(10, 2));
    }
}
