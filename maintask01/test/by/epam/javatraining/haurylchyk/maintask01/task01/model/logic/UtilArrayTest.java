package by.epam.javatraining.haurylchyk.maintask01.task01.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class UtilArrayTest {

    public static final double DELTA = 0.01;

    //<editor-fold defaultstate="collapsed" desc="min/max">
    @Test
    public void testFindMaxElementValid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double expected = 8.5;
        assertEquals(expected, UtilArray.findMaxElement(array), DELTA);
    }

    @Test
    public void testFindMaxElementInvalidNull() {
        double[] array = null;
        double expected = -1;
        assertEquals(expected, UtilArray.findMaxElement(array), DELTA);
    }

    @Test
    public void testFindMaxElementInvalidZero() {
        double[] array = new double[0];
        double expected = -1;
        assertEquals(expected, UtilArray.findMaxElement(array), DELTA);
    }

    @Test
    public void testFindMinElementValid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double expected = 0.5;
        assertEquals(expected, UtilArray.findMinElement(array), DELTA);
    }

    @Test
    public void testFindMinElementInvalidNull() {
        double[] array = null;
        double expected = -1;
        assertEquals(expected, UtilArray.findMinElement(array), DELTA);
    }

    @Test
    public void testFindMinElementInvalidZero() {
        double[] array = new double[0];
        double expected = -1;
        assertEquals(expected, UtilArray.findMinElement(array), DELTA);
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="arith/geom">
    @Test
    public void testCalcArithmeticMeanValid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double expected = 3.25;
        assertEquals(expected, UtilArray.calcArithmeticMean(array), DELTA);
    }

    @Test
    public void testCalcArithmeticMeanInvalidNull() {
        double[] array = null;
        double expected = -1;
        assertEquals(expected, UtilArray.calcArithmeticMean(array), DELTA);
    }

    @Test
    public void testCalcArithmeticMeanInvalidZero() {
        double[] array = new double[0];
        double expected = -1;
        assertEquals(expected, UtilArray.calcArithmeticMean(array), DELTA);
    }

    @Test
    public void testCalcGeometricMeanValid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double expected = 2.39;
        assertEquals(expected, UtilArray.calcGeometricMean(array), DELTA);
    }

    @Test
    public void testCalcGeometricMeanInvalidNull() {
        double[] array = null;
        double expected = -1;
        assertEquals(expected, UtilArray.calcGeometricMean(array), DELTA);
    }

    @Test
    public void testCalcGeometricMeanInvalidZero() {
        double[] array = new double[0];
        double expected = -1;
        assertEquals(expected, UtilArray.calcGeometricMean(array), DELTA);
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="incr/decr">
    @Test
    public void testCheckForIncreaseValid() {
        double[] array = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        boolean expected = true;
        assertEquals(expected, UtilArray.checkForIncrease(array));
    }

    @Test
    public void testCheckForIncreaseInvalidNull() {
        double[] array = null;
        boolean expected = false;
        assertEquals(expected, UtilArray.checkForIncrease(array));
    }

    @Test
    public void testCheckForIncreaseInvalidZero() {
        double[] array = new double[0];
        boolean expected = false;
        assertEquals(expected, UtilArray.checkForIncrease(array));
    }

    @Test
    public void testCheckForDecreaseValid() {
        double[] array = new double[]{8.5, 4.9, 3.9, 3.2, 2.1, 1.8, 1.1, 0.5};
        boolean expected = true;
        assertEquals(expected, UtilArray.checkForDecrease(array));
    }

    @Test
    public void testCheckForDecreaseInvalidNull() {
        double[] array = null;
        boolean expected = false;
        assertEquals(expected, UtilArray.checkForDecrease(array));
    }

    @Test
    public void testCheckForDecreaseInvalidZero() {
        double[] array = new double[0];
        boolean expected = false;
        assertEquals(expected, UtilArray.checkForDecrease(array));
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="locMin/locMax">
    @Test
    public void testFindFirstLocMaxValid() {
        double[] array = new double[]{1.0, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        int expected = 2;
        assertEquals(expected, UtilArray.findFirstLocMax(array));
    }

    @Test
    public void testFindFirstLocMaxValidNotFound() {
        double[] array = new double[]{1.0, 1.1, 3.9, 4.2, 4.5, 4.9, 5.5, 5.5};
        int expected = -2;
        assertEquals(expected, UtilArray.findFirstLocMax(array));
    }

    @Test
    public void testFindFirstLocMaxInvalidNull() {
        double[] array = null;
        int expected = -1;
        assertEquals(expected, UtilArray.findFirstLocMax(array));
    }

    @Test
    public void testFindFirstLocMaxInvalidZero() {
        double[] array = new double[0];
        int expected = -1;
        assertEquals(expected, UtilArray.findFirstLocMax(array));
    }

    @Test
    public void testFindFirstLocMinValid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        int expected = 1;
        assertEquals(expected, UtilArray.findFirstLocMin(array));
    }

    @Test
    public void testFindFirstLocMinValidNotFound() {
        double[] array = new double[]{1.1, 1.1, 3.9, 4.2, 4.5, 4.9, 5.5, 5.5};
        int expected = -2;
        assertEquals(expected, UtilArray.findFirstLocMin(array));
    }

    @Test
    public void testFindFirstLocMinInvalidNull() {
        double[] array = null;
        int expected = -1;
        assertEquals(expected, UtilArray.findFirstLocMin(array));
    }

    @Test
    public void testFindFirstLocMinInvalidZero() {
        double[] array = new double[0];
        int expected = -1;
        assertEquals(expected, UtilArray.findFirstLocMin(array));
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="search">
    @Test
    public void testSearchElementLinearValid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double element = 3.9;
        int expected = 2;
        assertEquals(expected, UtilArray.searchElementLinear(array, element));
    }

    @Test
    public void testSearchElementLinearValidNotFound() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double element = 4.5;
        int expected = -2;
        assertEquals(expected, UtilArray.searchElementLinear(array, element));
    }

    @Test
    public void testSearchElementLinearInvalidNull() {
        double[] array = null;
        int expected = -1;
        assertEquals(expected, UtilArray.findFirstLocMax(array));
    }

    @Test
    public void testSearchElementLinearInvalidZero() {
        double[] array = new double[0];
        int expected = -1;
        assertEquals(expected, UtilArray.findFirstLocMax(array));
    }

    @Test
    public void testSearchElementBinaryValid() {
        double[] array = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        double element = 3.2;
        int expected = 4;
        assertEquals(expected, UtilArray.searchElementBinary(array, element));
    }

    @Test
    public void testSearchElementBinaryValidNotFound() {
        double[] array = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        double element = 4.5;
        int expected = -2;
        assertEquals(expected, UtilArray.searchElementBinary(array, element));
    }

    @Test
    public void testSearchElementBinaryInvalidSort() {
        double[] array = new double[]{0.5, 4.9, 1.8, 2.1, 3.2, 3.9, 6.9, 8.5};
        double element = 4.9;
        int expected = -1;
        assertEquals(expected, UtilArray.searchElementBinary(array, element));
    }

    @Test
    public void testSearchElementBinaryInvalidNull() {
        double[] array = null;
        double element = 4.9;
        int expected = -1;
        assertEquals(expected, UtilArray.searchElementBinary(array, element));
    }

    @Test
    public void testSearchElementBinaryInvalidZero() {
        double[] array = new double[0];
        double element = 4.9;
        int expected = -1;
        assertEquals(expected, UtilArray.searchElementBinary(array, element));
    }
//</editor-fold>

    @Test
    public void testSortElementsBubbleAscValid() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        UtilArray.sortElementsBubbleAsc(array);
        double[] expected = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testSortElementsBubbleAscValidOneElement() {
        double[] array = new double[]{2.1};
        UtilArray.sortElementsBubbleAsc(array);
        double[] expected = new double[]{2.1};
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testSortElementsBubbleAscInvalidNull() {
        double[] array = null;
        UtilArray.sortElementsBubbleAsc(array);
        double[] expected = null;
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testSortElementsBubbleAscInvalidZero() {
        double[] array = new double[0];
        UtilArray.sortElementsBubbleAsc(array);
        double[] expected = new double[0];
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testSortElementsBubbleDes() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        UtilArray.sortElementsBubbleDes(array);
        double[] expected = new double[]{8.5, 4.9, 3.9, 3.2, 2.1, 1.8, 1.1, 0.5};
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testSortElementsInsertionAsc() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        UtilArray.sortElementsInsertionAsc(array);
        double[] expected = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testSortElementsInsertionDes() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        UtilArray.sortElementsInsertionDes(array);
        double[] expected = new double[]{8.5, 4.9, 3.9, 3.2, 2.1, 1.8, 1.1, 0.5};
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testSortElementsSelectionAsc() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        UtilArray.sortElementsSelectionAsc(array);
        double[] expected = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testSortElementsSelectionDes() {
        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        UtilArray.sortElementsSelectionDes(array);
        double[] expected = new double[]{8.5, 4.9, 3.9, 3.2, 2.1, 1.8, 1.1, 0.5};
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testReversElementsValid() {
        double[] array = new double[]{0.5, 1.1, 1.8, 2.1, 3.2, 3.9, 4.9, 8.5};
        UtilArray.reversElements(array);
        double[] expected = new double[]{8.5, 4.9, 3.9, 3.2, 2.1, 1.8, 1.1, 0.5};
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testReversElementsValidOneElement() {
        double[] array = new double[]{0.5};
        UtilArray.reversElements(array);
        double[] expected = new double[]{0.5};
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testReversElementsInvalidZero() {
        double[] array = new double[0];
        UtilArray.reversElements(array);
        double[] expected = new double[0];
        assertArrayEquals(expected, array, DELTA);
    }

    @Test
    public void testReversElementsInvalidNull() {
        double[] array = null;
        UtilArray.reversElements(array);
        double[] expected = null;
        assertArrayEquals(expected, array, DELTA);
    }
}
