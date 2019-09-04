import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter number to find factorial ");
		Scanner scan = new Scanner(System.in);
		try {
			int factorial = scan.nextInt();
			int output = factorial(factorial);
			System.out.println(output);
		} catch (Exception e) {
			System.out.println("The input must be a positive integer");
		}
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			int output = n * factorial(n - 1);
			return (output);
		}
	}
}
