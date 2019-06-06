package by.epam.javatraining.haurylchyk.lesson05.task01.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DragonTest {

    @Test
    public void testCalcHeadsInvalid() {
        int age = -10;
        int expected = 0;
        assertEquals(expected, Dragon.calcHeads(age));
    }

    @Test
    public void testCalcHeadsZero() {
        int age = 0;
        int expected = 3;
        assertEquals(expected, Dragon.calcHeads(age));
    }

    @Test
    public void testCalcHeadsJoung() {
        int age = 10;
        int expected = 33;
        assertEquals(expected, Dragon.calcHeads(age));
    }

    @Test
    public void testCalcHeadsMiddle() {
        int age = 210;
        int expected = 623;
        assertEquals(expected, Dragon.calcHeads(age));
    }

    @Test
    public void testCalcHeads() {
        int age = 310;
        int expected = 813;
        assertEquals(expected, Dragon.calcHeads(age));
    }

    @Test
    public void testCalcEyes() {
        int age = 10;
        int expected = 66;
        assertEquals(expected, Dragon.calcEyes(age));
    }
}
