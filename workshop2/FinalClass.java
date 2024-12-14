package workshop2;

public class FinalClass {
    public void displayMessage() {
        System.out.println("We good.");
    }
}


class SubClass extends FinalClass {
	// This will cause a compiler error
	// Overriding a final class is not possible.
}