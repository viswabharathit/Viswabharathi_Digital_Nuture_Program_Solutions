import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should be 5");
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should be 1");
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should be 6");
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should be 2");
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0), "Divide by zero should throw");
    }
}
