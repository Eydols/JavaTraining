package by.epam.javatraining.haurylchyk.lesson06.tast05.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilPrimeNumberTest {

    @Test
    public void testIsPrimeNumValid() {
        int number = 997;
        boolean expected = true;
        assertEquals(expected, UtilPrimeNumber.isPrimeNum(number));
    }
    
    @Test
    public void testIsPrimeNumInvalid() {
        int number = 121;
        boolean expected = false;
        assertEquals(expected, UtilPrimeNumber.isPrimeNum(number));
    }
    
    @Test
    public void testIsPrimeNumNegative() {
        int number = -997;
        boolean expected = false;
        assertEquals(expected, UtilPrimeNumber.isPrimeNum(number));
    }
    
    @Test
    public void testIsPrimeNumZero() {
        int number = 0;
        boolean expected = false;
        assertEquals(expected, UtilPrimeNumber.isPrimeNum(number));
    }
    
    @Test
    public void testIsPrimeNumOne() {
        int number = 1;
        boolean expected = false;
        assertEquals(expected, UtilPrimeNumber.isPrimeNum(number));
    }
    
    @Test
    public void testIsPrimeNumTwo() {
        int number = 2;
        boolean expected = true;
        assertEquals(expected, UtilPrimeNumber.isPrimeNum(number));
    }
}
