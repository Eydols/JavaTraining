package by.epam.javatraining.haurylchyk.lesson06.tast01.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HeadsOrTailsTest {

    @Test
    public void testCheckForIncreaseValid() {
        int countThrow = 1000;
        int expected = 499;
        assertEquals(expected, HeadsOrTails.calcCountHeads(countThrow));
    }
}
