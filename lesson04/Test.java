import task_1.UtilEquality;
import task_2.UtilRing;
import task_3.UtilRange;
import task_4.UtilAverage;
import task_5.UtilReverse;

public class Test {

    public static void main(String[] args) {
        double x = 2.5;
        double y = 2.0;
        double z = 2.5;

        boolean b;
        double d;
        int i;

        int f = 1556;
        int g = 123456;
        int h = 9876543;

        b = UtilEquality.compareForEquality(x, y, z); // task_1
        Printer.print("The numbers " + x + ", " + y + " and " + z + " are equal - " + b);

        d = UtilRing.calcSquare(x, y); // task_2
        Printer.print("The area of the ring = " + d);

        b = UtilRange.checkForIncrease(f); // task_3
        Printer.print("The digits of the number " + f + " form an increasing sequence - " + b);

        b = UtilRange.checkForDecrease(f); // task_3
        Printer.print("The digits of the number " + f + " form an decreasing sequence - " + b);

        d = UtilAverage.calcArithmeticMean(g); // task_4
        Printer.print("Arithmetic mean of digits of a number " + g + " = " + d);

        d = UtilAverage.calcGeometricMean(g); // task_4
        Printer.print("Geometric mean of digits of a number " + g + " = " + d);

        i = UtilReverse.getReverse(h); // task_5
        Printer.print("The inverted number " + h + " is number " + i);
    }
}