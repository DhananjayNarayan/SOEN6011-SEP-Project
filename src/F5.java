import java.util.*;

/**
 * The main class f5 having main function to start the execution. Contains other
 * functions for calculations.
 * 
 * @author Dhananjay Narayan v 1.1.0
 *
 */
class f5 {

	/**
	 * A function to compute exponentiation using recursion
	 * 
	 * @param a The initial amount
	 * @param b The base
	 * @param x The exponent
	 * @return The result of the computation
	 * @throws Exception
	 */
	private static double recursiveExponentiation(double a, double b, int x) throws Exception {

		double result = 1;
		if (x == 0) {
			return 1;
		} else {
			result = b * recursiveExponentiation(a, b, x - 1);
		}
		return a * result;

	}

	/**
	 * A function to compute exponentiation using iteration method
	 * 
	 * @param a The initial amount
	 * @param b The base
	 * @param x The exponent
	 * @return The result of the computation
	 * @throws Exception
	 */
	private static double iterativeExponentiation(double a, double b, int x) throws Exception {
		double result = 1;

		if (x == 0) {
			return 1;
		}

		for (int i = 1; i <= x; i++) {
			result = result * b;
		}
		return a * result;

	}

	/**
	 * The main function for the application
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {

		System.out.println("**********************************");
		System.out.println("**************ETERNITY************");
		System.out.println("**********************************");
		System.out.println("  A Calculator to compute F5: ab^x");
		System.out.println("***********************************");

		double a = 0, b = 0;
		int x = 0;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the value of a: ");
			a = sc.nextDouble();

			System.out.println("Enter the value of b: ");
			b = sc.nextDouble();

			System.out.println("Enter the value of x: ");
			x = sc.nextInt();
		} catch (Exception e1) {
			System.err.println(
					"Invalid datatype entered. Please enter the correct datatype again. a and b should be double and x should be integer.");

			System.out.println("Enter the value of a: ");
			a = sc.nextDouble();

			System.out.println("Enter the value of b: ");
			b = sc.nextDouble();

			System.out.println("Enter the value of x: ");
			x = sc.nextInt();

		}

		double recursiveExponentiationResult = 0;
		double iterativeExponentiationResult = 0;

		try {

			recursiveExponentiationResult = recursiveExponentiation(a, b, x);
			iterativeExponentiationResult = iterativeExponentiation(a, b, x);

			System.out.println("We are computing the value of exponential function : ab^x ");
			System.out.println(
					"The computed value of exponentioal function with recursion is: " + recursiveExponentiationResult);
			System.out.println("The computed value of exponentioal function with iteratice method is: "
					+ iterativeExponentiationResult);
		} catch (StackOverflowError t) {
			System.err.println("The computed value is too large to handle. Stack Overflow Occured.");
		}

		sc.close();
	}

}