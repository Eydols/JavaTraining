package task_5;

public class UtilReverse {

    public static int getReverse(int x) {
        return x % 10 * 1000000 + x % 100 / 10 * 100000 + x % 1000 / 100 * 10000 + x / 1000 % 10 * 1000 + x / 10000 % 10 * 100 + x / 100000 % 10 * 10 + x / 1000000;
    }

}


 