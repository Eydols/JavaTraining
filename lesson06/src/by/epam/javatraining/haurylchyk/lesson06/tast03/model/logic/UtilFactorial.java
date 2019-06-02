package by.epam.javatraining.haurylchyk.lesson06.tast03.model.logic;

public class UtilFactorial {

    public static long getFact(int number) {

        long res;
        if (number == 1 || number == 0) {
            return 1;
        }
        res = getFact(number - 1) * number;
        return res;
    }
}
