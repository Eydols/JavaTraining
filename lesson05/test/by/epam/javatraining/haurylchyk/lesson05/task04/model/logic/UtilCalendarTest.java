package by.epam.javatraining.haurylchyk.lesson05.task04.model.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilCalendarTest {

    @Test
    public void testIsLeapYearYes() {
        int year = 1600;
        boolean expected = true;
        assertEquals(expected, UtilСalendar.isLeapYear(year));
    }

    @Test
    public void testIsLeapYearNo() {
        int year = 1700;
        boolean expected = false;
        assertEquals(expected, UtilСalendar.isLeapYear(year));
    }

    @Test
    public void testIsValidDateYes() {
        int d = 31;
        int m = 1;
        int y = 1700;
        boolean expected = true;
        assertEquals(expected, UtilСalendar.isValidDate(d, m, y));
    }

    @Test
    public void testIsValidDateNo() {
        int d = 31;
        int m = 4;
        int y = 1700;
        boolean expected = false;
        assertEquals(expected, UtilСalendar.isValidDate(d, m, y));
    }

    @Test
    public void testGetNextDateNewYear() {
        int d = 31;
        int m = 12;
        int y = 1700;
        String expected = "Next date is 1.1.1701";
        assertEquals(expected, UtilСalendar.getNextDate(d, m, y));
    }

    @Test
    public void testGetNextDateLeapFeb() {
        int d = 29;
        int m = 2;
        int y = 1600;
        String expected = "Next date is 1.3.1600";
        assertEquals(expected, UtilСalendar.getNextDate(d, m, y));
    }

    @Test
    public void testGetNextDateNotLeapFeb() {
        int d = 28;
        int m = 2;
        int y = 1700;
        String expected = "Next date is 1.3.1700";
        assertEquals(expected, UtilСalendar.getNextDate(d, m, y));
    }

    @Test
    public void testGetNextDateUnevMonth() {
        int d = 31;
        int m = 1;
        int y = 1700;
        String expected = "Next date is 1.2.1700";
        assertEquals(expected, UtilСalendar.getNextDate(d, m, y));
    }

    @Test
    public void testGetNextDateEvMonth() {
        int d = 30;
        int m = 4;
        int y = 1700;
        String expected = "Next date is 1.5.1700";
        assertEquals(expected, UtilСalendar.getNextDate(d, m, y));
    }

}
