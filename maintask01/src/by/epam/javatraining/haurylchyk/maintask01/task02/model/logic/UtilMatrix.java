package by.epam.javatraining.haurylchyk.maintask01.task02.model.logic;

import org.apache.log4j.Logger;

/**
 * This class contains various methods for working with matrix contents,
 * including several types of sorting
 *
 * @version 1.0-SNAPSHOT
 * @author Aliaksey Haurylchyk
 * @date 11/06/19
 */
public class UtilMatrix {

    public static final Logger logger = Logger.getRootLogger();
    public static final int INVALID_VALUE = -1;
    public static final int NOT_FOUND_VALUE = -2;
    public static final String INVALID_MASSEGE = "The matrix is not defined";
    public static final String INVALID_MASSEGE_TWO = "The matrix is not defined or the matrix is not square";

    //This method finds the maximum element of a given matrix (O(n))
    public static double findMaxElement(double[][] matrix) {

        if (isNotDefined(matrix)) {
            logger.warn(INVALID_MASSEGE);
            return INVALID_VALUE;
        }

        double max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    //This method finds the minimum element of a given matrix (O(n))
    public static double findMinElement(double[][] matrix) {

        if (isNotDefined(matrix)) {
            logger.warn(INVALID_MASSEGE);
            return INVALID_VALUE;
        }

        double min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    //This method checks the symmetry of the matrix with respect to the main diagonal (O(n))
    public static boolean checkSymMainDiad(double[][] matrix) {

        if (isNotDefined(matrix) || !isSquareMatrix(matrix)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return false;
        }

        final int COUNT_ARRAYS = matrix.length;

        for (int i = 0; i < COUNT_ARRAYS - 1; i++) {
            for (int j = i + 1; j < COUNT_ARRAYS; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //This method checks the symmetry of the matrix with respect to the side diagonal (O(n))
    public static boolean checkSymSideDiad(double[][] matrix) {

        if (isNotDefined(matrix) || !isSquareMatrix(matrix)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return false;
        }

        final int COUNT_ARRAYS = matrix.length;

        for (int i = 0; i < COUNT_ARRAYS - 1; i++) {
            for (int j = 0; j < COUNT_ARRAYS - i - 1; j++) {
                if (matrix[i][j] != matrix[COUNT_ARRAYS - j - 1][COUNT_ARRAYS - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    //This method finds the first local maximum of a given matrix (O(n))
    public static int[] findFirstLocMax(double[][] matrix) {

        if (isNotDefined(matrix)) {
            logger.warn(INVALID_MASSEGE);
            return new int[]{INVALID_VALUE, INVALID_VALUE};
        }

        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if ((matrix[i][j] > matrix[i + 1][j]
                        && matrix[i][j] > matrix[i - 1][j])
                        && (matrix[i][j] > matrix[i][j + 1]
                        && matrix[i][j] > matrix[i][j - 1])) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{NOT_FOUND_VALUE, NOT_FOUND_VALUE};
    }

    //This method finds the first local minimum of a given matrix (O(n))
    public static int[] findFirstLocMin(double[][] matrix) {

        if (isNotDefined(matrix)) {
            logger.warn(INVALID_MASSEGE);
            return new int[]{INVALID_VALUE, INVALID_VALUE};
        }

        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if ((matrix[i][j] < matrix[i + 1][j]
                        && matrix[i][j] < matrix[i - 1][j])
                        && (matrix[i][j] < matrix[i][j + 1]
                        && matrix[i][j] < matrix[i][j - 1])) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{NOT_FOUND_VALUE, NOT_FOUND_VALUE};
    }

    //This method transposes a square matrix (O(n))
    public static void transpSqMatrix(double[][] matrix) {

        if (isNotDefined(matrix) || !isSquareMatrix(matrix)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return;
        }

        final int COUNT_ARRAYS = matrix.length;

        for (int i = 0; i < COUNT_ARRAYS - 1; i++) {
            for (int j = i + 1; j < COUNT_ARRAYS; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    //An auxiliary method that checks the array for emptiness
    private static boolean isNotDefined(double[][] matrix) {
        return matrix == null || matrix.length == 0;
    }

    //An auxiliary method that checks the array for emptiness
    private static boolean isSquareMatrix(double[][] matrix) {
        return matrix.length == matrix[0].length;
    }

    //This method returns a string representation of an matrix
    public static String toString(double[][] matrix) {

        String msg = "\n";

        for (double[] arr : matrix) {
            for (double elem : arr) {
                msg += " " + elem;
            }
            msg += "\n";
        }
        return msg;
    }

}
