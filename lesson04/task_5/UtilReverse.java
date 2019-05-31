package task_5;

public class UtilReverse {

    public static int getReverse(int number) {

        int numeral = number % 10;
        number /= 10;
        int res = numeral * 10;

        numeral = number % 10;
        number /= 10;
        res = (res + numeral) * 10;

        numeral = number % 10;
        number /= 10;
        res = (res + numeral) * 10;

        numeral = number % 10;
        number /= 10;
        res = (res + numeral) * 10;

        numeral = number % 10;
        number /= 10;
        res = (res + numeral) * 10;

        numeral = number % 10;
        number /= 10;
        res = (res + numeral) * 10;

        numeral = number;
        res = res + numeral;

        return res;
    }
}


 