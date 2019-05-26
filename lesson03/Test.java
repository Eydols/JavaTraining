import task_1.CornerConverter;
import task_3.WeightConverter;

public class Test {

    public static void main(String[] args) {
        double x = 1.0;
        double y = 2.0;

        boolean d;
        double e;

        int g = 123;
        int h = 456;

        e = CornerConverter.convertDegToRad(x); // task_1
        Printer.print(x + "\u00B0  = " + e + " rad");

        e = CornerConverter.convertRadToDeg(x); // task_1
        Printer.print(x + " rad = " + e + '\u00B0');

        g = g + h; // task_2
        h = g - h;
        g = g - h;
        Printer.print("g = " + g + " h = " + h);

        e = WeightConverter.convertKgToGr(y); // task_3
        Printer.print(y + " kg = " + e + " gr");

        e = WeightConverter.convertKgToMg(y); // task_3
        Printer.print(y + " kg = " + e + " mg");

        e = WeightConverter.convertKgToTon(y); // task_3
        Printer.print(y + " kg = " + e + " t");

    }
}