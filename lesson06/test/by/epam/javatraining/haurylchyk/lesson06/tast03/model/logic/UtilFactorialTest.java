package by.epam.javatraining.haurylchyk.lesson06.tast03.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilFactorialTest {
    
    @Test
    public void calcFactValid() {
    int number = 5;
    long expected = 120;
    assertEquals(expected, UtilFactorial.calcFact(number));
    }
    
    @Test
    public void calcFactZero() {
    int number = 0;
    long expected = 1;
    assertEquals(expected, UtilFactorial.calcFact(number));
    }   
    
    @Test
    public void calcFactOne() {
    int number = 1;
    long expected = 1;
    assertEquals(expected, UtilFactorial.calcFact(number));
    }   
    
      @Test
    public void calcFactNegative() {
    int number = -5;
    long expected = 0;
    assertEquals(expected, UtilFactorial.calcFact(number));
    }   
}
