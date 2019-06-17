package by.epam.javatraining.haurylchyk.lesson06.tast03.model.logic;

public class UtilFactorial {

    public static long calcFact(int number) {

        if (number < 0) {
            return 0;
        }
        
        long res = 1;

        while (number > 1) {
            res *= number;
            number -= 1;
        }
        return res;
    }
}
