package by.epam.javatraining.haurylchyk.lesson06.tast04.model.logic;

public class UtilEvenness {

    public static boolean checkEven(int number) {

        if (number <= 0) {
            return false;
        }

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static boolean checkUneven(int number) {

        if (number <= 0) {
            return false;
        }

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                return false;
            }
            number /= 10;
        }

        return true;
    }
}
