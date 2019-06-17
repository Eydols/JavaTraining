package by.epam.javatraining.haurylchyk.lesson06.tast05.controller;

import by.epam.javatraining.haurylchyk.lesson06.tast05.model.logic.UtilPrimeNumber;
import by.epam.javatraining.haurylchyk.lesson06.tast05.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = 997;
        
        Printer.print("The number " + number + " is prime -- " + UtilPrimeNumber.isPrimeNum(number));
    }
}
