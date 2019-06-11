package by.epam.javatraining.haurylchyk.maintask01.task01.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class UtilArrayTest {

    @Test
    public void testFindMaxElement() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double expected = 8.5;
        assertEquals(expected, UtilArray.findMaxElement(array), 0.1);
    }

    @Test
    public void testFindMaxElementInvalidNull() {
        double[] array = null;
        double expected = -1;
        assertEquals(expected, UtilArray.findMaxElement(array), 0.1);
    }

    @Test
    public void testFindMaxElementInvalidZero() {
        double[] array = new double[0];
        double expected = -1;
        assertEquals(expected, UtilArray.findMaxElement(array), 0.1);
    }

    @Test
    public void testFindMinElement() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double expected = 0.5;
        assertEquals(expected, UtilArray.findMinElement(array), 0.1);
    }

    @Test
    public void testCalcArithmeticMean() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double expected = 3.25;
        assertEquals(expected, UtilArray.calcArithmeticMean(array), 0.01);
    }

    @Test
    public void testCalcGeometricMean() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double expected = 2.39;
        assertEquals(expected, UtilArray.calcGeometricMean(array), 0.01);
    }

    @Test
    public void testCheckForIncreaseInvalid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        boolean expected = false;
        assertEquals(expected, UtilArray.checkForIncrease(array));
    }

    @Test
    public void testCheckForIncreaseValid() {
        double[] array = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        boolean expected = true;
        assertEquals(expected, UtilArray.checkForIncrease(array));
    }

    @Test
    public void testCheckForDecreaseInvalid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        boolean expected = false;
        assertEquals(expected, UtilArray.checkForDecrease(array));
    }

    @Test
    public void testCheckForDecreaseValid() {
        double[] array = new double[]{8.5, 4.9, 3.9, 3.2, 2.1, 1.8, 1.1, 0.5};
        boolean expected = true;
        assertEquals(expected, UtilArray.checkForDecrease(array));
    }

    @Test
    public void testFindFirstLocMax() {
        double[] array = new double[]{1.0, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        int expected = 2;
        assertEquals(expected, UtilArray.findFirstLocMax(array));
    }

    @Test
    public void testFindFirstLocMin() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        int expected = 1;
        assertEquals(expected, UtilArray.findFirstLocMin(array));
    }

    @Test
    public void testSearchElementLinearValid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double element = 3.9;
        int expected = 2;
        assertEquals(expected, UtilArray.searchElementLinear(array, element));
    }

    @Test
    public void testSearchElementLinearInvalid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double element = 4.5;
        int expected = -1;
        assertEquals(expected, UtilArray.searchElementLinear(array, element));
    }

    @Test
    public void testSearchElementBinaryValid() {
        double[] array = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        double element = 3.2;
        int expected = 4;
        assertEquals(expected, UtilArray.searchElementBinary(array, element));
    }

    @Test
    public void testSearchElementBinaryInvalid() {
        double[] array = new double[]{0.5, 4.9, 1.8, 2.1, 3.2, 3.9, 6.9, 8.5};
        double element = 4.9;
        int expected = -1;
        assertEquals(expected, UtilArray.searchElementBinary(array, element));
    }

    @Test
    public void testSortElementsBubbleAsc() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double[] expected = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        assertArrayEquals(expected, UtilArray.sortElementsBubbleAsc(array), 0.1);
    }

    @Test
    public void testSortElementsBubbleDes() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double[] expected = new double[]{8.5, 4.9, 3.9, 3.2, 2.1, 1.8, 1.1, 0.5};
        assertArrayEquals(expected, UtilArray.sortElementsBubbleDes(array), 0.1);
    }

    @Test
    public void testSortElementsInsertionAsc() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double[] expected = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        assertArrayEquals(expected, UtilArray.sortElementsInsertionAsc(array), 0.1);
    }

    @Test
    public void testSortElementsInsertionDes() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double[] expected = new double[]{8.5, 4.9, 3.9, 3.2, 2.1, 1.8, 1.1, 0.5};
        assertArrayEquals(expected, UtilArray.sortElementsInsertionDes(array), 0.1);
    }

    @Test
    public void testSortElementsSelectionAsc() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double[] expected = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        assertArrayEquals(expected, UtilArray.sortElementsSelectionAsc(array), 0.1);
    }

    @Test
    public void testSortElementsSelectionDes() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double[] expected = new double[]{8.5, 4.9, 3.9, 3.2, 2.1, 1.8, 1.1, 0.5};
        assertArrayEquals(expected, UtilArray.sortElementsSelectionDes(array), 0.1);
    }

    @Test
    public void testReversElements() {
        double[] array = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        double[] expected = new double[]{8.5, 4.9, 3.9, 3.2, 2.1, 1.8, 1.1, 0.5};
        assertArrayEquals(expected, UtilArray.reversElements(array), 0.1);
    }
}
