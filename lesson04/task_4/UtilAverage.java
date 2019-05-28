package task_4;

public class UtilAverage {

	private static final int COUNT_NUM = 6; // count of digits in the number 

    public static double calcArithmeticMean(int number) {
				
		int num1 = number % 10;
        
		number /= 10;

        int num2 = number % 10;
        
		number /= 10;

        int num3 = number % 10;
        
		number /= 10;
		
		int num4 = number % 10;
        
		number /= 10;
		
		int num5 = number % 10;
        
		number /= 10;

        int num6 = number;

        return (double) (num1 + num2 + num3 + num4 + num5 + num6) / COUNT_NUM;
    }

    public static double calcGeometricMean(int number) {
		
		int num1 = number % 10;
        
		number /= 10;

        int num2 = number % 10;
        
		number /= 10;

        int num3 = number % 10;
        
		number /= 10;
		
		int num4 = number % 10;
        
		number /= 10;
		
		int num5 = number % 10;
        
		number /= 10;

        int num6 = number;
		
        return Math.pow(num1 * num2 * num3 * num4 * num5 * num6, 1.0 / COUNT_NUM);
    }
}





 