package by.epam.javatraining.haurylchyk.maintask01.task02.view;

public class Printer {

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void print(double[] array) {
        for (double elem : array) {
            System.out.print(elem + " ");
        }
    }

    public static void print(String msg, double[][] matrix) {
        System.out.println(msg);
        for (double[] arr : matrix) {
            for (double elem : arr) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
