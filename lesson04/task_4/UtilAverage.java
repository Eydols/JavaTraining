package task_4;

public class UtilAverage {

    public static double calcArithmeticMean(int x) {
        return (x % 10 + x % 100 / 10 + x / 100 % 10 + x / 1000 % 10 + x / 10000 % 10 + x / 100000) / 6.0;
    }

    public static double calcGeometricMean(int x) {
        return Math.pow((x % 10) * (x % 100 / 10) * (x / 100 % 10) * (x / 1000 % 10) * (x / 10000 % 10) * (x / 100000), 1.0 / 6.0);
    }
}


 