
import org.example.pract4.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTests {

    private final Calculator calculator = new Calculator();

    @Test
    void testDivideNormal() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }


    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Division by zero!!", exception.getMessage());
    }
}

