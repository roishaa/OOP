package workshop;

import java.util.Scanner; 

public class Q8 {
	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double timePeriod = scanner.nextDouble();

        double interest = (principal * rateOfInterest * timePeriod) / 100;

        System.out.println("The simple interest is: " + interest);

        scanner.close();
    }
}

