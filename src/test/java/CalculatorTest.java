import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addTwoNumbers() {
        assertEquals(2, Calculator.AddTwoNumbers(1, 1));
    }

    @Test
    public void subtractTwoNumbers() {
        assertEquals(4, Calculator.SubtractTwoNumbers(5, 1));
    }
}