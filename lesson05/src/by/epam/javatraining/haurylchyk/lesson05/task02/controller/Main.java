package by.epam.javatraining.haurylchyk.lesson05.task02.controller;

import by.epam.javatraining.haurylchyk.lesson05.task02.model.logic.Letter;
import by.epam.javatraining.haurylchyk.lesson05.task02.view.Printer;

public class Main {

    public static void main(String[] args) {

        char ch = 'a';

        Printer.print("Letter " + ch + " is vowel --> " + Letter.isVowel(ch));

    }
}
