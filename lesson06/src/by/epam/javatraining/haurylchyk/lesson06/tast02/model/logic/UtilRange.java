package by.epam.javatraining.haurylchyk.lesson06.tast02.model.logic;

public class UtilRange {

    public static boolean checkForIncrease(int number) {

        if (number / 10 != 0) {

            int lastDigit = number % 10;
            number /= 10;

            while (number > 0) {
                int nextDigit = number % 10;
                if (lastDigit > nextDigit) {
                    lastDigit = nextDigit;
                    number /= 10;
                } else {
                    return false;
                }
            }

            return true;
        }
        return false;
    }

    public static boolean checkForDecrease(int number) {

        if (number / 10 != 0) {

            int lastDigit = number % 10;
            number /= 10;

            while (number > 0) {
                int nextDigit = number % 10;
                if (lastDigit < nextDigit) {
                    lastDigit = nextDigit;
                    number /= 10;
                } else {
                    return false;
                }
            }

            return true;
        }
        return false;
    }
}
