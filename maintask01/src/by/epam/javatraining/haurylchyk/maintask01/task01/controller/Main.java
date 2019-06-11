package by.epam.javatraining.haurylchyk.maintask01.task01.controller;

import by.epam.javatraining.haurylchyk.maintask01.task01.model.logic.UtilArray;
import by.epam.javatraining.haurylchyk.maintask01.task01.view.Printer;

public class Main {

    public static void main(String[] args) {

        double[] array = new double[]{2.1, 1.1, 3.9, 3.2, 8.5, 4.9, 0.5, 1.8};
        double[] arraySort = new double[]{0.1, 1.1, 2.9, 3.2, 4.5, 4.9, 5.5, 6.8};
        double element = 4.5;

        Printer.print("Max element of array equals " + UtilArray.findMaxElement(array));
        Printer.print("Min element of array equals " + UtilArray.findMinElement(array));
        Printer.print("The arithmetic mean of elements of array equals " + UtilArray.calcArithmeticMean(array));
        Printer.print("The geometric mean of elements of array equals " + UtilArray.calcGeometricMean(array));
        Printer.print("The array elements form an increasing sequence - " + UtilArray.checkForIncrease(array));
        Printer.print("The array elements form an decreasing sequence - " + UtilArray.checkForDecrease(array));
        Printer.print("The index of the first local maximum equals " + UtilArray.findFirstLocMax(array));
        Printer.print("The index of the first local minimum equals " + UtilArray.findFirstLocMin(array));
        Printer.print("The index of the searched element equals " + UtilArray.searchElementLinear(array, element));
        Printer.print("The index of the searched element equals " + UtilArray.searchElementBinary(arraySort, element));

        Printer.print("The elements of reverse array:", UtilArray.reversElements(array));

        Printer.print("The elements of array after bubble sort (asc):", UtilArray.sortElementsBubbleAsc(array));
        Printer.print("The elements of array after bubble sort (des):", UtilArray.sortElementsBubbleDes(array));

        Printer.print("The elements of array after sort by insertion (asc):", UtilArray.sortElementsInsertionAsc(array));
        Printer.print("The elements of array after sort by insertion (dec):", UtilArray.sortElementsInsertionDes(array));

        Printer.print("The elements of array after sort by selection (asc):", UtilArray.sortElementsSelectionAsc(array));
        Printer.print("The elements of array after sort by selection (dec):", UtilArray.sortElementsSelectionDes(array));

        Printer.print("The elements of array after merge sort:", UtilArray.sortElementsMerge(array));

        Printer.print("The elements of array after quick sort:", UtilArray.sortElementsQuick(array));

    }
}
