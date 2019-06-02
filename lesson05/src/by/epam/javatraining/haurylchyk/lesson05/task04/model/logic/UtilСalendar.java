package by.epam.javatraining.haurylchyk.lesson05.task04.model.logic;

public class UtilСalendar {

    public static final int FEBR = 2;
    public static final int APR = 4;
    public static final int JUNY = 6;
    public static final int SEPT = 9;
    public static final int NOV = 11;

    public static boolean isLeapYear(int y) {
        return ((y % 4 == 0) && !(y % 100 == 0)) || ((y % 4 == 0) && (y % 100 == 0) && (y % 400 == 0));
    }

    public static boolean isValidDate(int d, int m, int y) {
        if (y <= 0 || m <= 0 || d <= 0) {
            return false;
        } else if (m > 12) {
            return false;
        } else if (d > 31) {
            return false;
        } else if ((m == APR
                || m == JUNY
                || m == SEPT
                || m == NOV) && d > 30) {
            return false;
        } else if (isLeapYear(y) && m == FEBR && d > 29) {
            return false;
        } else if (!isLeapYear(y) && m == FEBR && d > 28) {
            return false;
        } else {
            return true;
        }
    }

    public static String getNextDate(int d, int m, int y) {

        String result = "Enteren date is invalid";

        if (isValidDate(d, m, y)) {

            if (d == 31 && m == 12) {
                d = m = 1;
                y += 1;
                result = "Next date is " + d + "." + m + "." + y;
            } else if (d == 31
                    || ((m == APR || m == JUNY || m == SEPT || m == NOV) && d == 30)
                    || (m == FEBR && d == 29)
                    || (m == FEBR && d == 28)) {
                d = 1;
                m += 1;
                result = "Next date is " + d + "." + m + "." + y;
            } else {
                d += 1;
                result = "Next date is " + d + "." + m + "." + y;
            }
        }
        return result;
    }
}
