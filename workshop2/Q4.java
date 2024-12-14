package workshop2;
class Person {
    protected String address;  // Protected attribute

    // Constructor
    Person(String address) {
        this.address = address;
    }
}

class Employee extends Person {
    private String department;

    // Constructor
    Employee(String address, String department) {
        // Call the superclass constructor
        super(address);
        this.department = department;
    }

    // Method to display Employee details
    void displayDetails() {
        // Accessing protected attribute 'address'
        System.out.println("Address: " + address); 
        System.out.println("Department: " + department);
    }
}


public class Q4 {
	    public static void main(String[] args) {
	        // Create an instance of Employee
	        Employee emp = new Employee("123 Main Street", "HR");

	        // Display Employee details
	        emp.displayDetails();
	    }
	
}
