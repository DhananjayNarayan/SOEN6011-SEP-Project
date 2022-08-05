import java.util.*;


/**
 * The main class f5 having main function to start the execution. Contains functions for calculations. 
 * @author Dhananjay Narayan
 * v 0.0.4
 *
 */
class f5{


	/**
	 * The main function for the application
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String args[]) throws Exception{


		System.out.println("**********************************");
		System.out.println("**************ETERNITY************");
		System.out.println("**********************************");
		System.out.println("  A Calculator to compute F5: ab^x");
		System.out.println("***********************************");


		double a=0,b=0;
		int x = 0;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the value of a: ");
			a = sc.nextDouble();

			System.out.println("Enter the value of b: ");
			b=sc.nextDouble();

			System.out.println("Enter the value of x: ");
			x = sc.nextInt();	
		} catch (Exception e1) {			
			System.err.println("Invalid datatype entered. Please enter the correct datatype again. a and b should be double and x should be integer.");
			System.out.println("Enter the value of a: ");
			a = sc.nextDouble();

			System.out.println("Enter the value of b: ");
			b=sc.nextDouble();

			System.out.println("Enter the value of x: ");
			x = sc.nextInt();	

		}



		double recursiveExponentiationResult = 0;
		double iterativeExponentiationResult = 0;

		try {

			recursiveExponentiationResult = recursiveExponentiation(a,b,x);
			iterativeExponentiationResult = iterativeExponentiation(a,b,x);

			System.out.println("The computed value of exponentioal function with recursion is: " + recursiveExponentiationResult );
			System.out.println("The computed value of exponentioal function with iteratice method is: " + iterativeExponentiationResult );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect Input");
			e.printStackTrace();
		}


	}


	private static double recursiveExponentiation(double a, double b, int x) {
		double result = 1;
		if(x==0) {
			return 1;
		}
		else {
			try {
				result= b * recursiveExponentiation(a,b,x-1);
			}
			catch(Exception StackOverflowError){
				System.out.println("The result is very big leading to stack overflow.");
			}
		}

		return a*result;


	}


	private static double iterativeExponentiation(double a, double b, int x) {
		double result = 1;

		if(x==0) {
			return 1;
		}


		for(int i = 1; i <= x; i++)
		{
			result = result * b;
		}
		return a*result;

	}

}