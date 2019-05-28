package task_5;

public class UtilReverse {

    public static int getReverse(int number) {
		
		int num1 = number % 10 * 1_000_000;
        
		number /= 10;

        int num2 = number % 10 * 100_000;
        
		number /= 10;

        int num3 = number % 10 * 10_000;
        
		number /= 10;
		
		int num4 = number % 10 * 1000;
        
		number /= 10;
		
		int num5 = number % 10 * 100;
        
		number /= 10;
		
		int num6 = number % 10 * 10;
        
		number /= 10;

        int num7 = number;
		
        return num1 + num2 + num3 + num4 + num5 + num6 + num7;
    }

}


 