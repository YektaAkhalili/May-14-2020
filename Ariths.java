import java.util.Scanner;

class Ariths{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double value;

		System.out.println("Enter a number:");
		value = scan.nextDouble();

		//calculate square root
		double sqrt = Math.sqrt(value);
		System.out.println("square root: " + sqrt);
	}
}