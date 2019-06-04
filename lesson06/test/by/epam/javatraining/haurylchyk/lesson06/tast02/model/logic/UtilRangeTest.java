package by.epam.javatraining.haurylchyk.lesson06.tast02.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilRangeTest {

    @Test
    public void testCheckForIncreaseValid() {
        int number = 123456789;
        boolean expected = true;
        assertEquals(expected, UtilRange.checkForIncrease(number));
    }
    
    @Test
    public void testCheckForIncreaseInvalid() {
        int number = 123556789;
        boolean expected = false;
        assertEquals(expected, UtilRange.checkForIncrease(number));
    }

    @Test
    public void testCheckForDecreaseValid() {
        int number = 987654321;
        boolean expected = true;
        assertEquals(expected, UtilRange.checkForDecrease(number));
    }
    
    @Test
    public void testCheckForDecreaseInvalid() {
        int number = 987554321;
        boolean expected = false;
        assertEquals(expected, UtilRange.checkForIncrease(number));
    }
}
