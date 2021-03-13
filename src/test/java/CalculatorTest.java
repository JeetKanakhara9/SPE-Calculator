import org.junit.*;

import static org.junit.Assert.*;



public class CalculatorTest {
    private static final double DELTA = 1e-15;
    //Calculator calc = new Calculator();

    @Test
    public void factTruepositive() {
        assertEquals(720, Calculator.fact(6), DELTA);
        assertEquals(6,Calculator.fact(3), DELTA);
    }
    @Test
    public void factFalsepositive() {
        assertNotEquals(24, Calculator.fact(6), DELTA);
        assertNotEquals(120, Calculator.fact(7), DELTA);
    }

    @Test
    public void square_rootTruepositive() {
        assertEquals(12.0, Calculator.square_root(144.0), DELTA);
        assertEquals(15.0, Calculator.square_root(225.0), DELTA);
    }
    @Test
    public void square_rootFalsepositive() {
        assertNotEquals(23, Calculator.square_root(6.0), DELTA);
        assertNotEquals(79, Calculator.square_root(10.0), DELTA);
    }


    @Test
    public void powerTruepositive() {
        assertEquals(216, Calculator.power(6.0,3.0), DELTA);
        assertEquals(144, Calculator.power(12.0,2.0), DELTA);
    }
    @Test
    public void powerFalsepositive() {
        assertNotEquals(23, Calculator.power(6.0,2.0), DELTA);
        assertNotEquals(79, Calculator.power(3.0,5.0), DELTA);
    }

    @Test
    public void logarithmTruepositive() {
        assertEquals(0, Calculator.log(1.0), DELTA);
    }
    @Test
    public void logarithmFalsepositive() {
        assertNotEquals(23, Calculator.log(6.0), DELTA);
        assertNotEquals(79, Calculator.log(24.0), DELTA);
    }
}
