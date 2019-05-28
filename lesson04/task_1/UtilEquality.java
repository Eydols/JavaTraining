package task_1;

public class UtilEquality {

    public static boolean compareForEquality(double a, double b, double c) {
        return a == b && b == c;
    }

    public static boolean compareForInequality(double a, double b, double c) {
        return a != b && b != c && a != c;
    }
}

