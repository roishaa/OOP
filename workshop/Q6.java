package workshop;
import java.util.Scanner;
public class Q6 {

	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the temperature in Celsius
	        System.out.print("Enter the temperature in Celsius: ");
	        double celsius = scanner.nextDouble();

	        // Convert Celsius to Fahrenheit using the formula F = C * 9/5 + 32
	        double fahrenheit = celsius * 9 / 5 + 32;

	        // Display the result
	        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

	        // Close the scanner
	        scanner.close();
	    }
	}

	