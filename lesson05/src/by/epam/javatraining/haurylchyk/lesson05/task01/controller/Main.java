package by.epam.javatraining.haurylchyk.lesson05.task01.controller;

import by.epam.javatraining.haurylchyk.lesson05.task01.model.logic.Dragon;
import by.epam.javatraining.haurylchyk.lesson05.task01.view.Printer;

public class Main {

    public static void main(String[] args) {

        int age = 10;
        Printer.print("The dragon has " + Dragon.calcHeads(age) + " heads and " + Dragon.calcEyes(age) + " eyes");
    }
}
