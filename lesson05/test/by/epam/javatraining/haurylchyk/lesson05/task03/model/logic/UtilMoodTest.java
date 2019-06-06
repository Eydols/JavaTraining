package by.epam.javatraining.haurylchyk.lesson05.task03.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilMoodTest {

    @Test
    public void testGetMoodZero() {
        int number = 0;
        String expected = ":(";
        assertEquals(expected, UtilMood.showMood(number));
    }

    @Test
    public void testGetMoodOne() {
        int number = 1;
        String expected = ":|";
        assertEquals(expected, UtilMood.showMood(number));
    }

    @Test
    public void testGetMoodTwo() {
        int number = 2;
        String expected = ":)";
        assertEquals(expected, UtilMood.showMood(number));
    }

    @Test
    public void testGetMoodThree() {
        int number = 3;
        String expected = ":D";
        assertEquals(expected, UtilMood.showMood(number));
    }

}
