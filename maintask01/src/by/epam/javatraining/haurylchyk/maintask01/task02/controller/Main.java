package by.epam.javatraining.haurylchyk.maintask01.task02.controller;

import by.epam.javatraining.haurylchyk.maintask01.task02.model.logic.UtilMatrix;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class Main {

    public static final Logger logger = Logger.getRootLogger();

    public static void main(String[] args) {

        double matrix[][] = new double[][]{{2.2, 35.7, 48.2, 5.9}, {54.2, 0.2, 808.3, 0.7}, {32.6, 4.7, 488.0, 37.1}};
        double matrixSq[][] = new double[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        double matrixSymMainDiag[][] = new double[][]{{1, 2, 1, 1}, {2, 0, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        double matrixSymSideDiag[][] = new double[][]{{1, 2, 1, 1}, {1, 0, 0, 1}, {1, 0, 0, 2}, {1, 1, 1, 1}};

        logger.info("Max element of matrix equals " + UtilMatrix.findMaxElement(matrix));
        logger.info("Min element of matrix equals " + UtilMatrix.findMinElement(matrix));

        logger.info("The first local maximum equals " + Arrays.toString(UtilMatrix.findFirstLocMax(matrix)));
        logger.info("The first local minimum equals " + Arrays.toString(UtilMatrix.findFirstLocMin(matrix)));

        logger.info("The matrix is symmetric with respect to the main diagonal " + UtilMatrix.checkSymMainDiad(matrixSymMainDiag));
        logger.info("The matrix is symmetric with respect to the side diagonal " + UtilMatrix.checkSymSideDiad(matrixSymSideDiag));

        logger.info("Matrix elements before transposition: " + UtilMatrix.toString(matrixSq));
        UtilMatrix.transpSqMatrix(matrixSq);
        logger.info("Matrix elements after transposition: " + UtilMatrix.toString(matrixSq));

    }
}
