package by.epam.javatraining.haurylchyk.maintask01.task01.model.logic;

import org.apache.log4j.Logger;

/**
 * This class contains various methods for working with array contents,
 * including several types of sorting
 *
 * @version 1.0-SNAPSHOT
 * @author Aliaksey Haurylchyk
 * @date 11/06/19
 */
public class UtilArray {

    public static final Logger logger = Logger.getRootLogger();
    public static final int INVALID_VALUE = -1;
    public static final int NOT_FOUND_VALUE = -2;
    public static final String INVALID_MASSEGE = "The array is not defined";
    public static final String INVALID_MASSEGE_TWO = "The array is not defined or the array consists of a single element";
    public static final String INVALID_MASSEGE_THREE = "The array is not sorted";

    //<editor-fold defaultstate="collapsed" desc="min/max">
    //This method finds the maximum element of a given array (O(n))
    public static double findMaxElement(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE);
            return INVALID_VALUE;
        }
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //This method finds the minimum element of a given array (O(n))
    public static double findMinElement(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE);
            return INVALID_VALUE;
        }
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="arith/geom">
    //This method calculates the arithmetic mean of all elements of the array (O(n))
    public static double calcArithmeticMean(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE);
            return INVALID_VALUE;
        }

        final int SIZE_ARRAY = array.length;
        double sum = 0;

        for (int i = 0; i < SIZE_ARRAY; i++) {
            sum += array[i];
        }
        return sum / SIZE_ARRAY;
    }

    //This method calculates the geometric mean of all elements of the array (O(n))
    public static double calcGeometricMean(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE);
            return INVALID_VALUE;
        }

        final int SIZE_ARRAY = array.length;
        double mult = 1;

        for (int i = 0; i < SIZE_ARRAY; i++) {
            mult *= array[i];
        }
        return Math.pow(mult, 1.0 / SIZE_ARRAY);
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="incr/decr">
    //This method checks if all elements of the array in an ordered form (increase) (O(n))
    public static boolean checkForIncrease(double[] array) {

        if (isNotDefined(array) || array.length == 1) {
            logger.warn(INVALID_MASSEGE_TWO);
            return false;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //This method checks if all elements of the array in an ordered form (decrease) (O(n))
    public static boolean checkForDecrease(double[] array) {

        if (isNotDefined(array) || array.length == 1) {
            logger.warn(INVALID_MASSEGE_TWO);
            return false;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="locMin/locMax">
    //This method finds the first local maximum (O(n))
    public static int findFirstLocMax(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE);
            return INVALID_VALUE;
        }

        final int INDEX_FIRST_ELEMENT = 0;
        final int INDEX_LAST_ELEMENT = array.length - 1;
        final int INDEX_PEN_ELEMENT = array.length - 2;
        int index = NOT_FOUND_VALUE;

        if (array[0] > array[1]) {
            index = INDEX_FIRST_ELEMENT;
        }

        for (int i = 1; i < INDEX_LAST_ELEMENT; i++) {
            if (index == NOT_FOUND_VALUE && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == NOT_FOUND_VALUE && array[INDEX_LAST_ELEMENT] > array[INDEX_PEN_ELEMENT]) {
            index = INDEX_LAST_ELEMENT;
        }
        return index;
    }

    //This method finds the first local minimum (O(n))
    public static int findFirstLocMin(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE);
            return INVALID_VALUE;
        }

        final int INDEX_FIRST_ELEMENT = 0;
        final int INDEX_LAST_ELEMENT = array.length - 1;
        final int INDEX_PEN_ELEMENT = array.length - 2;
        int index = NOT_FOUND_VALUE;

        if (array[0] < array[1]) {
            index = INDEX_FIRST_ELEMENT;
        }
        for (int i = 1; i < INDEX_LAST_ELEMENT; i++) {
            if (index == NOT_FOUND_VALUE && array[i] < array[i - 1] && array[i] < array[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == NOT_FOUND_VALUE && array[INDEX_LAST_ELEMENT] < array[INDEX_PEN_ELEMENT]) {
            index = INDEX_LAST_ELEMENT;
        }

        return index;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="search">
    //This method looks for the specified element in the array (O(n))
    public static int searchElementLinear(double[] array, double element) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE);
            return INVALID_VALUE;
        }

        int index = NOT_FOUND_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    //This method looks for the specified element in the array
    //and the array must be pre-sorted (O(log(n)))
    public static int searchElementBinary(double[] array, double element) {

        if (!checkForIncrease(array)) {
            logger.warn(INVALID_MASSEGE_THREE);
            return INVALID_VALUE;
        }

        int index = NOT_FOUND_VALUE;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if (array[mid] == element) {
                index = mid;
                break;
            } else if (left == right) {
                break;
            } else if (array[mid] > element) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="sort">
    //This method sorts array elements in ascending order (O(n^2))
    public static void sortElementsBubbleAsc(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return;
        }

        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    //This method sorts array elementsin descending order (O(n^2))
    public static void sortElementsBubbleDes(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return;
        }

        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] < array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    //This method sorts array elements in ascending order (O(n^2))
    public static void sortElementsInsertionAsc(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return;
        }

        for (int j = 1; j < array.length; j++) {

            double temp = array[j];
            int i = j;

            while (i > 0 && array[i - 1] >= temp) {
                array[i] = array[i - 1];
                --i;
            }
            array[i] = temp;
        }
    }

    //This method sorts array elements in descending order (O(n^2))
    public static void sortElementsInsertionDes(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return;
        }

        for (int j = 1; j < array.length; j++) {

            double temp = array[j];
            int i = j;

            while (i > 0 && array[i - 1] <= temp) {
                array[i] = array[i - 1];
                --i;
            }
            array[i] = temp;
        }
    }

    //This method sorts array elements in ascending order (O(n^2))
    public static void sortElementsSelectionAsc(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return;
        }

        final int SIZE_ARRAY = array.length;

        for (int j = 0; j < SIZE_ARRAY - 1; j++) {
            int min = j;
            for (int i = j + 1; i < SIZE_ARRAY; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            swap(array, j, min);
        }
    }

    //This method sorts array elements in descending order (O(n^2))
    public static void sortElementsSelectionDes(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return;
        }

        final int SIZE_ARRAY = array.length;

        for (int j = 0; j < SIZE_ARRAY - 1; j++) {
            int min = j;
            for (int i = j + 1; i < SIZE_ARRAY; i++) {
                if (array[i] > array[min]) {
                    min = i;
                }
            }
            swap(array, j, min);
        }
    }

    //This method sorts array elements in ascending order (O(n*log(n))
    public static void sortElementsMerge(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return;
        }

        recMergeSort(array, 0, array.length - 1);
    }

    //This method sorts both halves of the array then merges them
    private static void recMergeSort(double[] array, int left, int right) {

        if (left != right) {
            int mid = (left + right) / 2; // finding the middle of an array
            recMergeSort(array, left, mid); // sorting the left half of the array
            recMergeSort(array, mid + 1, right); // sorting the right half of the array
            merge(array, left, mid + 1, right); // merge
        }
    }

    //This method merges two sorted parts of an array
    private static void merge(double[] array, int lowPtr, int highPtr, int right) {

        double[] temp = new double[array.length];
        int j = 0;
        int left = lowPtr;
        int mid = highPtr - 1;
        int n = right - left + 1; // count of elements

        while (lowPtr <= mid && highPtr <= right) {
            if (array[lowPtr] < array[highPtr]) {
                temp[j++] = array[lowPtr++];
            } else {
                temp[j++] = array[highPtr++];
            }
        }
        while (lowPtr <= mid) {
            temp[j++] = array[lowPtr++];
        }
        while (highPtr <= right) {
            temp[j++] = array[highPtr++];
        }
        for (j = 0; j < n; j++) {
            array[left + j] = temp[j];
        }
    }

    //This method calls the basic quick sort method
    public static void sortElementsQuick(double[] array) {

        if (isNotDefined(array)) {
            logger.warn(INVALID_MASSEGE_TWO);
            return;
        }

        recSortQuick(array, 0, array.length - 1);
    }

    //This method sorts array elements in ascending order (O(n*log(n))
    private static void recSortQuick(double[] array, int left, int right) {

        int leftPtr = left;
        int rightPtr = right;
        double mid = array[(leftPtr + rightPtr) / 2];

        while (leftPtr <= rightPtr) {
            while (array[leftPtr] < mid) {
                leftPtr++;
            }
            while (array[rightPtr] > mid) {
                rightPtr--;
            }
            if (leftPtr <= rightPtr) {
                if (leftPtr < rightPtr) {
                    swap(array, leftPtr, rightPtr);
                }
                leftPtr++;
                rightPtr--;
            }
        }

        if (leftPtr < right) {
            recSortQuick(array, leftPtr, right);
        }
        if (left < rightPtr) {
            recSortQuick(array, left, rightPtr);
        }
    }
//</editor-fold>

    //This method reverses all the elements of the array (O(n))
    public static void reversElements(double[] array) {

        if (isNotDefined(array) || array.length == 1) {
            logger.warn(INVALID_MASSEGE_TWO);
            return;
        }

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            swap(array, left, right);
            left += 1;
            right -= 1;
        }
    }

    //An auxiliary method that swaps two specified elements of the same array
    private static void swap(double[] array, int index1, int index2) {

        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    //An auxiliary method that checks the array for emptiness
    private static boolean isNotDefined(double[] array) {
        return array == null || array.length == 0;
    }

    //This method returns a string representation of an array
    public static String toString(double[] array) {

        String msg = "";

        for (double elem : array) {
            msg += " " + elem;
        }
        return msg;
    }

}
