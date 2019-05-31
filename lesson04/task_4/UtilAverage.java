package task_4;

public class UtilAverage {

    private static final int COUNT_NUM = 6; // count of digits in the number 

    public static double calcArithmeticMean(int number) {

        int numeral = number % 10;
        number /= 10;
        int sum = numeral;

        numeral = number % 10;
        number /= 10;
        sum += numeral;

        numeral = number % 10;
        number /= 10;
        sum += numeral;

        numeral = number % 10;
        number /= 10;
        sum += numeral;

        numeral = number % 10;
        number /= 10;
        sum += numeral;

        numeral = number;
        sum += numeral;

        return (double) sum / COUNT_NUM;
    }

    public static double calcGeometricMean(int number) {

        int numeral = number % 10;
        number /= 10;
        int mult = numeral;

        numeral = number % 10;
        number /= 10;
        mult *= numeral;

        numeral = number % 10;
        number /= 10;
        mult *= numeral;

        numeral = number % 10;
        number /= 10;
        mult *= numeral;

        numeral = number % 10;
        number /= 10;
        mult *= numeral;

        numeral = number;
        mult *= numeral;

        return Math.pow(mult, 1.0 / COUNT_NUM);
    }
}






 