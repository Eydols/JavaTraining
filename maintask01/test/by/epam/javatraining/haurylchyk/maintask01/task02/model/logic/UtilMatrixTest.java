package by.epam.javatraining.haurylchyk.maintask01.task02.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class UtilMatrixTest {

    @Test
    public void testFindMaxElement() {
        double matrix[][] = new double[][]{{2.2, 35.7, 48.2, 5.9}, {0.2, 54.2, 488.0, 0.7}, {32.6, 4.7, 808.3, 6, 37.1}};
        double expected = 808.3;
        assertEquals(expected, UtilMatrix.findMaxElement(matrix), 0.1);
    }

    @Test
    public void testFindMaxElementInvalid() {
        double matrix[][] = new double[0][0];
        double expected = -1;
        assertEquals(expected, UtilMatrix.findMaxElement(matrix), 0.1);
    }

    @Test
    public void testFindMinElement() {
        double matrix[][] = new double[][]{{2.2, 35.7, 48.2, 5.9}, {0.2, 54.2, 488.0, 0.7}, {32.6, 4.7, 808.3, 6, 37.1}};
        double expected = 0.2;
        assertEquals(expected, UtilMatrix.findMinElement(matrix), 0.1);
    }

    @Test
    public void testCheckSymMainDiadValid() {
        double matrixSymMainDiag[][] = new double[][]{{1, 2, 1, 1}, {2, 0, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        boolean expected = true;
        assertEquals(expected, UtilMatrix.checkSymMainDiad(matrixSymMainDiag));
    }

    @Test
    public void testCheckSymMainDiadInvalid() {
        double matrix[][] = new double[][]{{2.2, 35.7, 48.2, 5.9}, {0.2, 54.2, 488.0, 0.7}, {32.6, 4.7, 808.3, 6, 37.1}};
        boolean expected = false;
        assertEquals(expected, UtilMatrix.checkSymMainDiad(matrix));
    }

    @Test
    public void testCheckSymMainDiadInvalidNotSquare() {
        double matrix[][] = new double[2][3];
        boolean expected = false;
        assertEquals(expected, UtilMatrix.checkSymMainDiad(matrix));
    }

    @Test
    public void testCheckSymSideDiadValid() {
        double matrixSymSideDiag[][] = new double[][]{{1, 2, 1, 1}, {1, 0, 0, 1}, {1, 0, 0, 2}, {1, 1, 1, 1}};
        boolean expected = true;
        assertEquals(expected, UtilMatrix.checkSymSideDiad(matrixSymSideDiag));
    }

    @Test
    public void testCheckSymSideDiadInvalid() {
        double matrix[][] = new double[][]{{2.2, 35.7, 48.2, 5.9}, {0.2, 54.2, 488.0, 0.7}, {32.6, 4.7, 808.3, 6, 37.1}};
        boolean expected = false;
        assertEquals(expected, UtilMatrix.checkSymSideDiad(matrix));
    }

    @Test
    public void testTranspSqMatrix() {
        double matrixSq[][] = new double[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        double expected[][] = new double[][]{{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
        assertArrayEquals(expected, UtilMatrix.transpSqMatrix(matrixSq));
    }
    
    @Test
    public void testTranspSqMatrixInvalidNotSquare() {
        double matrixSq[][] = new double[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        double expected[][] = new double[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        assertArrayEquals(expected, UtilMatrix.transpSqMatrix(matrixSq));
    }
}
