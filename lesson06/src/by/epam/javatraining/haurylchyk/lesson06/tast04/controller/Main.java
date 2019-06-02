package by.epam.javatraining.haurylchyk.lesson06.tast04.controller;

import by.epam.javatraining.haurylchyk.lesson06.tast04.model.logic.UtilEvenness;
import by.epam.javatraining.haurylchyk.lesson06.tast04.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number1 = 24682468;
        int number2 = 1357913;
        
        Printer.print("All the digits of number " + number1 + " are even - "  + UtilEvenness.checkEven(number1));
        Printer.print("All the digits of number " + number2 + " are uneven - "  + UtilEvenness.checkUneven(number2));
    }
    
}
