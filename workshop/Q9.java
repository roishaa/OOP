package workshop;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first integer:");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (num2 != 0) ? (double) num1 / num2 : 0; 

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);

        scanner.close();
		
	}

}
