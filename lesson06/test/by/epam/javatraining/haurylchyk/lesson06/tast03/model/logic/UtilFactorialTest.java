package by.epam.javatraining.haurylchyk.lesson06.tast03.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilFactorialTest {
    
    @Test
    public void calcFact() {
    int number = 5;
    long expected = 120;
    assertEquals(expected, UtilFactorial.calcFact(number));
    }  
    
    @Test
    public void calcFact2() {
    int number = 5;
    long expected = 120;
    assertEquals(expected, UtilFactorial.calcFact2(number));
    }  
}
