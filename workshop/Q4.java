package workshop;

public class Q4 {
	public static void main(String[] args) {
		double a = 5;
		double b=6;
		double c=8;
		
		double s = (a + b + c)/2;
		
		double area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
		
		System.out.println("The area of the triangle is: " + area);
	}

}
