package gradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

    @Test void testMaxIntValue() {
        assertThrows(ArithmeticException.class, () -> {
            int maxValue = Integer.MAX_VALUE;
            App.add(maxValue, 2);
        });
    }

    @Test void testCorrectString(){
        assertEquals(App.CORRECT_STRING, App.correctAnswer("The result is correct, Good boy"));
    }
}
