package task_3;

public class UtilRange {

    public static boolean checkForIncrease(int x) {
        return x % 10 > x % 100 / 10 && x % 100 / 10 > x / 100 % 10 && x / 100 % 10 > x / 1000;
    }

    public static boolean checkForDecrease(int x) {
        return x % 10 < x % 100 / 10 && x % 100 / 10 < x / 100 % 10 && x / 100 % 10 < x / 1000;
    }
}


 