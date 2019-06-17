package by.epam.javatraining.haurylchyk.lesson06.tast05.model.logic;

public class UtilPrimeNumber {

    public static boolean isPrimeNum(int number) {

        boolean res = true;

        if (number <= 1) {
            return false;
        }
        
        for (int i = 3; i < number; i+=2) {
            if ((number % i) == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
