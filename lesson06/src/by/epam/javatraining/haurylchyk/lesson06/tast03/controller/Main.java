package by.epam.javatraining.haurylchyk.lesson06.tast03.controller;

import by.epam.javatraining.haurylchyk.lesson06.tast03.model.logic.UtilFactorial;
import by.epam.javatraining.haurylchyk.lesson06.tast03.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = 9;
        long fact = UtilFactorial.getFact(number);
        
        Printer.print("Factorial of number " + number + " equals " + fact);
    }
    
}
