package start;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1; // Base case
		} else {
			return n * factorial(n - 1); // Recursive call
		}
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println("Factorial of " + n + " = " + result);
	}
}
