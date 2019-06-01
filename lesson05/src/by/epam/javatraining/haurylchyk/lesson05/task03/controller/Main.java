package by.epam.javatraining.haurylchyk.lesson05.task03.controller;

import by.epam.javatraining.haurylchyk.lesson05.task03.model.logic.UtilMood;
import by.epam.javatraining.haurylchyk.lesson05.task03.view.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.print("Your mood is " + UtilMood.guessMood());
    }  
}
