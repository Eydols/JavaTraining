package by.epam.javatraining.haurylchyk.lesson06.tast05.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilPrimeNumberTest {

    @Test
    public void testIsPrimeNum() {
        int number = 997;
        boolean expected = true;
        assertEquals(expected, UtilPrimeNumber.isPrimeNum(number));
    }
}
