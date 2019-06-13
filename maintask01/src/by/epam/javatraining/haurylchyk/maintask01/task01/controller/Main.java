package by.epam.javatraining.haurylchyk.maintask01.task01.controller;

import by.epam.javatraining.haurylchyk.maintask01.task01.model.logic.UtilArray;
import org.apache.log4j.Logger;

public class Main {

    public static Logger logger = Logger.getRootLogger();

    public static void main(String[] args) {

        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double[] arraySort = new double[]{0.1, 1.1, 2.9, 3.2, 4.5, 4.9, 5.5, 6.8};
        double element = 4.5;

        logger.info("Max element of array equals " + UtilArray.findMaxElement(array));
        logger.info("Min element of array equals " + UtilArray.findMinElement(array));
        logger.info("The arithmetic mean of elements of array equals " + UtilArray.calcArithmeticMean(array));
        logger.info("The geometric mean of elements of array equals " + UtilArray.calcGeometricMean(array));
        logger.info("The array elements form an increasing sequence - " + UtilArray.checkForIncrease(array));
        logger.info("The array elements form an decreasing sequence - " + UtilArray.checkForDecrease(array));
        logger.info("The index of the first local maximum equals " + UtilArray.findFirstLocMax(array));
        logger.info("The index of the first local minimum equals " + UtilArray.findFirstLocMin(array));
        logger.info("The index of the searched element equals " + UtilArray.searchElementLinear(array, element));
        logger.info("The index of the searched element equals " + UtilArray.searchElementBinary(arraySort, element));

        logger.info("The elements of original array: " + UtilArray.toString(array));
        UtilArray.reversElements(array);
        logger.info("The elements of reverse array: " + UtilArray.toString(array));

        logger.info("The elements of the array before sorting: " + UtilArray.toString(array));
        UtilArray.sortElementsBubbleAsc(array);
        logger.info("The elements of the array after bubble sort (asc): " + UtilArray.toString(array));

        logger.info("The elements of the array before sorting: " + UtilArray.toString(array));
        UtilArray.sortElementsBubbleDes(array);
        logger.info("The elements of the array after bubble sort (des): " + UtilArray.toString(array));

        logger.info("The elements of the array before sorting: " + UtilArray.toString(array));
        UtilArray.sortElementsInsertionAsc(array);
        logger.info("The elements of the array after sort by insertion (asc): " + UtilArray.toString(array));

        logger.info("The elements of the array before sorting: " + UtilArray.toString(array));
        UtilArray.sortElementsInsertionDes(array);
        logger.info("The elements of the array after sort by insertion (dec): " + UtilArray.toString(array));

        logger.info("The elements of the array before sorting: " + UtilArray.toString(array));
        UtilArray.sortElementsSelectionAsc(array);
        logger.info("The elements of the array after sort by selection (asc): " + UtilArray.toString(array));

        logger.info("The elements of the array before sorting: " + UtilArray.toString(array));
        UtilArray.sortElementsSelectionDes(array);
        logger.info("The elements of the array after sort by selection (dec): " + UtilArray.toString(array));

        logger.info("The elements of the array before sorting: " + UtilArray.toString(array));
        UtilArray.sortElementsMerge(array);
        logger.info("The elements of the array after merge sort: " + UtilArray.toString(array));

        logger.info("The elements of the array before sorting: " + UtilArray.toString(array));
        UtilArray.sortElementsQuick(array);
        logger.info("The elements of the array after quick sort: " + UtilArray.toString(array));

    }
}
