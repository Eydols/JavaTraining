package by.epam.javatraining.haurylchyk.maintask01.task01.view;

public class Printer {

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void print(String msg, double[] array) {
        System.out.println(msg);
        for (double elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
