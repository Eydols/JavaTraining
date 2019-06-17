package by.epam.javatraining.haurylchyk.lesson06.tast04.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilEvennessTest {

    @Test
    public void testCheckEvenValid() {
        int number = 246824;
        boolean expected = true;
        assertEquals(expected, UtilEvenness.checkEven(number));
    }

    @Test
    public void testCheckEvenInvalid() {
        int number = 2461824;
        boolean expected = false;
        assertEquals(expected, UtilEvenness.checkEven(number));
    }
    
    @Test
    public void testCheckEvenNegative() {
        int number = -246824;
        boolean expected = false;
        assertEquals(expected, UtilEvenness.checkEven(number));
    }
    
    @Test
    public void testCheckEvenZero() {
        int number = 0;
        boolean expected = false;
        assertEquals(expected, UtilEvenness.checkEven(number));
    }

    @Test
    public void testCheckUnevenValid() {
        int number = 135791;
        boolean expected = true;
        assertEquals(expected, UtilEvenness.checkUneven(number));
    }

    @Test
    public void testCheckUnevenInvalid() {
        int number = 1352791;
        boolean expected = false;
        assertEquals(expected, UtilEvenness.checkUneven(number));
    }
    
    @Test
    public void testCheckUnevenNegative() {
        int number = -135791;
        boolean expected = false;
        assertEquals(expected, UtilEvenness.checkUneven(number));
    }
    
    @Test
    public void testCheckUnevenZero() {
        int number = 0;
        boolean expected = false;
        assertEquals(expected, UtilEvenness.checkUneven(number));
    }

}
