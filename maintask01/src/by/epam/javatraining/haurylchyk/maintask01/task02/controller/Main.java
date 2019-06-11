package by.epam.javatraining.haurylchyk.maintask01.task02.controller;

import by.epam.javatraining.haurylchyk.maintask01.task02.model.logic.UtilMatrix;
import by.epam.javatraining.haurylchyk.maintask01.task02.view.Printer;

public class Main {
    public static void main(String[] args) {
        
        double matrix[][] = new double[][] {{2.2,35.7,48.2,5.9},{0.2,54.2,488.0,0.7},{32.6,4.7,808.3,6,37.1}};
        double matrixSq[][] = new double[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        double matrixSymMainDiag[][] = new double[][] {{1,2,1,1},{2,0,0,1},{1,0,0,1},{1,1,1,1}};
        double matrixSymSideDiag[][] = new double[][] {{1,2,1,1},{1,0,0,1},{1,0,0,2},{1,1,1,1}};
        
        
        Printer.print("Max element of array equals " + UtilMatrix.findMaxElement(matrix));
        Printer.print("Min element of array equals " + UtilMatrix.findMinElement(matrix));
        
        Printer.print("The matrix is symmetric with respect to the main diagonal " + UtilMatrix.checkSymMainDiad(matrixSymMainDiag));
        Printer.print("The matrix is symmetric with respect to the side diagonal " + UtilMatrix.checkSymSideDiad(matrixSymSideDiag));
        
        Printer.print("Transposed matrix:",UtilMatrix.transpSqMatrix(matrixSq));

    }
}
