package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author seanbowen
 * @version 1.0
 * <p>
 * Creation date: 2021-04-17
 */
class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
