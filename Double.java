import java.util.Scanner;

class Double{
	public static void main(String[] args) {
		double num, power;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = scan.nextDouble();

		power = num * num;
		System.out.println("The square of that is: " + power);
		System.out.println("The double of that is: " + num*2.0);

	}
}