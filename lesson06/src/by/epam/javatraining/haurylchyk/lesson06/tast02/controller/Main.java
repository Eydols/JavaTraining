package by.epam.javatraining.haurylchyk.lesson06.tast02.controller;

import by.epam.javatraining.haurylchyk.lesson06.tast02.model.logic.UtilRange;
import by.epam.javatraining.haurylchyk.lesson06.tast02.view.Printer;

public class Main {

    public static void main(String[] args) {

        int number = 123456789;
        
        boolean b = UtilRange.checkForIncrease(number);
        Printer.print("The digits of the number " + number + " form an increasing sequence - " + b);
        
        b = UtilRange.checkForDecrease(number);
        Printer.print("The digits of the number " + number + " form an decreasing sequence - " + b);
    }
}
