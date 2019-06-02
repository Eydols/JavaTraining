package by.epam.javatraining.haurylchyk.lesson06.tast05.model.logic;

public class UtilPrimeNumber {
    
    public static boolean isPrimeNum(int number) {
        if (number > 0) {

            if (number == 2 || number == 3 || number == 5 || number == 7) {
                return true;
            } else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
