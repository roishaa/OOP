package workshop;
import java.util.Scanner;
public class Q14 {

	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner input = new Scanner(System.in);
	        
	        // Prompt the user to enter the amount in U.S. dollars
	        System.out.print("Enter the amount in U.S. dollars: ");
	        double usdAmount = input.nextDouble();
	        
	        // Prompt the user to enter the exchange rate
	        System.out.print("Enter the exchange rate (1 USD to target currency): ");
	        double exchangeRate = input.nextDouble();
	        
	        // Calculate the converted amount
	        double convertedAmount = usdAmount * exchangeRate;
	        
	        // Display the converted amount
	        System.out.printf("The converted amount is: %.2f%n", convertedAmount);
	        
	        // Close the scanner
	        input.close();
	    }
	}


