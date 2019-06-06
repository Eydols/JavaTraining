package by.epam.javatraining.haurylchyk.lesson05.task02.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LetterTest {

    @Test
    public void testisVowelUp() {
        char letter = 'A';
        boolean expected = true;
        assertEquals(expected, Letter.isVowel(letter));
    }

    @Test
    public void testisVowelLow() {
        char letter = 'e';
        boolean expected = true;
        assertEquals(expected, Letter.isVowel(letter));
    }

    @Test
    public void testisVowelIvalid() {
        char letter = 'F';
        boolean expected = false;
        assertEquals(expected, Letter.isVowel3(letter));
    }

    @Test
    public void testisVowel2Low() {
        char letter = 'i';
        boolean expected = true;
        assertEquals(expected, Letter.isVowel2(letter));
    }

    @Test
    public void testisVowel2Up() {
        char letter = 'O';
        boolean expected = true;
        assertEquals(expected, Letter.isVowel2(letter));
    }

    @Test
    public void testisVowel2Ivalid() {
        char letter = 'p';
        boolean expected = false;
        assertEquals(expected, Letter.isVowel2(letter));
    }

    @Test
    public void testisVowel3Low() {
        char letter = 'u';
        boolean expected = true;
        assertEquals(expected, Letter.isVowel3(letter));
    }

    @Test
    public void testisVowel3Up() {
        char letter = 'Y';
        boolean expected = true;
        assertEquals(expected, Letter.isVowel3(letter));
    }

    @Test
    public void testisVowel3Ivalid() {
        char letter = 'Q';
        boolean expected = false;
        assertEquals(expected, Letter.isVowel3(letter));
    }
}
