package by.epam.javatraining.haurylchyk.lesson05.task04.controller;

import by.epam.javatraining.haurylchyk.lesson05.task03.view.Printer;
import by.epam.javatraining.haurylchyk.lesson05.task04.model.logic.UtilСalendar;

public class Main {

    public static void main(String[] args) {
        int d = 29;
        int m = 2;
        int y = 1600;

        Printer.print(UtilСalendar.getNextDate(d, m, y));
    }
}
