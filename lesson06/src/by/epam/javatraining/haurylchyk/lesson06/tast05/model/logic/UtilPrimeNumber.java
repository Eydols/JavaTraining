package by.epam.javatraining.haurylchyk.lesson06.tast05.model.logic;

public class UtilPrimeNumber {

    public static final int PR_NUM_TWO = 2;
    public static final int PR_NUM_THR = 3;
    public static final int PR_NUM_FIV = 5;
    public static final int PR_NUM_SEV = 7;

    public static boolean isPrimeNum(int number) {

        boolean res = true;

        if (number <= 1
                || number % PR_NUM_TWO == 0 && number != PR_NUM_TWO
                || number % PR_NUM_THR == 0 && number != PR_NUM_THR
                || number % PR_NUM_FIV == 0 && number != PR_NUM_FIV
                || number % PR_NUM_SEV == 0 && number != PR_NUM_SEV) {
            res = false;
        }
        return res;
    }
}
