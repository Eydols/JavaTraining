package by.epam.javatraining.haurylchyk.maintask01.task02.model.logic;

/**
 * This class contains various methods for working with matrix contents,
 * including several types of sorting
 *
 * @version 1.0-SNAPSHOT
 * @author Aliaksey Haurylchyk
 * @date 11/06/19
 */
public class UtilMatrix {

    //This method finds the maximum element of a given matrix (O(n))
    public static double findMaxElement(double[][] matrix) {

        if (isEmpty(matrix)) {
            return -1;
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

        if (isEmpty(matrix)) {
            return -1;
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

        if (isEmpty(matrix) || !isSquareMatrix(matrix)) {
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

        if (isEmpty(matrix) || !isSquareMatrix(matrix)) {
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

    public static int[] findFirstLocMax(double[][] matrix) {
        return new int[0];
    }

    public static int[] findFirstLocMin(double[][] matrix) {
        return new int[0];
    }

    //This method transposes a square matrix (O(n))
    public static double[][] transpSqMatrix(double[][] matrix) {
        
        if (isEmpty(matrix) || !isSquareMatrix(matrix)) {
            return matrix;
        }

        final int COUNT_ARRAYS = matrix.length;

        for (int i = 0; i < COUNT_ARRAYS - 1; i++) {
            for (int j = i + 1; j < COUNT_ARRAYS; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    //An auxiliary method that checks the array for emptiness
    private static boolean isEmpty(double[][] matrix) {
        return matrix == null || matrix.length == 0;
    }

    //An auxiliary method that checks the array for emptiness
    private static boolean isSquareMatrix(double[][] matrix) {
        return matrix.length == matrix[0].length;
    }
}
