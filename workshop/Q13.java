package workshop;
import java.util.Scanner;
public class Q13 {
	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner input = new Scanner(System.in);
	        
	        // Prompt the user to enter the quantity of items
	        System.out.print("Enter the quantity of items: ");
	        int quantity = input.nextInt();
	        
	        // Prompt the user to enter the price per item
	        System.out.print("Enter the price per item: ");
	        double pricePerItem = input.nextDouble();
	        
	        // Calculate the total cost
	        double totalCost = quantity * pricePerItem;
	        
	        // Display the total cost
	        System.out.printf("The total cost is: $%.2f%n", totalCost);
	        
	        // Close the scanner
	        input.close();
	    }
	}


