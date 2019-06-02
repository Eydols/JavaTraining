package by.epam.javatraining.haurylchyk.lesson06.tast01.controller;

import by.epam.javatraining.haurylchyk.lesson06.tast01.model.logic.HeadsOrTails;
import by.epam.javatraining.haurylchyk.lesson06.tast01.view.Printer;

public class Main {
    
    public static void main(String[] args) {
        
        Printer.print("Count heads are " + HeadsOrTails.getCountHeads(1000));
    }
    
    
}
