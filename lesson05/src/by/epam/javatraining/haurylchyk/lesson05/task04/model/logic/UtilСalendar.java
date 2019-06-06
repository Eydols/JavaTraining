package by.epam.javatraining.haurylchyk.lesson05.task04.model.logic;

public class UtilСalendar {

    public static final int FEBR = 2;
    public static final int APR = 4;
    public static final int JUNY = 6;
    public static final int SEPT = 9;
    public static final int NOV = 11;

    public static final int COUNT_DAYS_FEB = 28;
    public static final int COUNT_DAYS_FEB_LEAP_YEAR = 29;
    public static final int COUNT_DAYS_SHORT_MONTH = 30;
    public static final int COUNT_DAYS_LONG_MONTH = 31;

    public static final int COUNT_MONTHS_YEAR = 12;

    public static boolean isLeapYear(int y) {
        return ((y % 4 == 0) && !(y % 100 == 0)) || ((y % 4 == 0) && (y % 100 == 0) && (y % 400 == 0));
    }

    public static boolean isValidDate(int d, int m, int y) {
        if (y <= 0 || m <= 0 || d <= 0) {
            return false;
        } else if (m > COUNT_MONTHS_YEAR) {
            return false;
        } else if (d > COUNT_DAYS_LONG_MONTH) {
            return false;
        } else if ((m == APR
                || m == JUNY
                || m == SEPT
                || m == NOV) && d > COUNT_DAYS_SHORT_MONTH) {
            return false;
        } else if (isLeapYear(y) && m == FEBR && d > COUNT_DAYS_FEB_LEAP_YEAR) {
            return false;
        } else if (!isLeapYear(y) && m == FEBR && d > COUNT_DAYS_FEB) {
            return false;
        } else {
            return true;
        }
    }

    public static String getNextDate(int d, int m, int y) {

        String result = "Enteren date is invalid";

        if (isValidDate(d, m, y)) {

            if (d == COUNT_DAYS_LONG_MONTH && m == COUNT_MONTHS_YEAR) {
                d = m = 1;
                y += 1;
                result = "Next date is " + d + "." + m + "." + y;
            } else if (d == COUNT_DAYS_LONG_MONTH
                    || ((m == APR || m == JUNY || m == SEPT || m == NOV) && d == COUNT_DAYS_SHORT_MONTH)
                    || (m == FEBR && d == COUNT_DAYS_FEB_LEAP_YEAR)
                    || (m == FEBR && d == COUNT_DAYS_FEB)) {
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
