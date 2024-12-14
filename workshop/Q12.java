package workshop;
import java.util.Scanner;
public class Q12 {
	public class Main {
	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the radius of the circle
	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();

	        // Calculate the area using the formula Area = π * r * r
	        double area = Math.PI * Math.pow(radius, 2);

	        // Display the result
	        System.out.println("The area of the circle is: " + area);

	        // Close the scanner
	        scanner.close();
	    }
	}


}
