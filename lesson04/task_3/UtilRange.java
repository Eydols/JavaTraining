package task_3;

public class UtilRange {

    public static boolean checkForIncrease(int number) {

        int num1 = number % 10;

        number /= 10;

        int num2 = number % 10;

        number /= 10;

        int num3 = number % 10;

        number /= 10;

        int num4 = number;

        return num1 > num2 && num2 > num3 && num3 > num4;
    }

    public static boolean checkForDecrease(int number) {

        int num1 = number % 10;

        number /= 10;

        int num2 = number % 10;

        number /= 10;

        int num3 = number % 10;

        number /= 10;

        int num4 = number;

        return num1 < num2 && num2 < num3 && num3 < num4;
    }
}


 