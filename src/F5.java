import java.util.*;


/**
 * The main class f5 having main function to start the execution. Contains functions for calculations. 
 * @author Dhananjay Narayan
 * v 0.0.4
 *
 */
class f5{

	/**
	 * A function to calculate power when two inputs are given. 
	 * @param a the base of the number
	 * @param b the power to which the base will be raised
	 * @return res the result of the power calculation.
	 */
	public static double calculateExponentialResult(double a,double b,int x) throws Exception{

        double bx =0;
		if (x == 0) {
			return 1.0;
		}
		else {
			try {
			 bx = calculateExponentIterative(b,x);
			}
			catch(Exception StackOverflowError){
				System.out.println("The result is very big leading to stack overflow.");
			}
		}
		
		double result = a*bx;
		return result;
	}

	private static double calculateExponentRecursive(double b, int x) {
		// TODO Auto-generated method stub
		double result = 0;
		if(x==0) {
			return 1;
		}
		else {
			try {
			result= b*calculateExponentRecursive(b,x-1);
			}
			catch(Exception StackOverflowError){
				System.out.println("The result is very big leading to stack overflow.");
			}
			}
		return result;
		
	}
	
	private static double calculateExponentIterative(double b,int x) {
		double result = 1;
		
		for(int i = 1; i <= x; i++)
		{
			result = result * b;
		}
		
		return result;
	}

	/**
	 * The main function for the application
	 * @param args
	 */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**************************");
		System.out.println("**********ETERNITY********");
		System.out.println("**************************");
		System.out.println("A Calculator to calculate F5: ab^x");


		
		System.out.println("Enter the values of a,b and x");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int x =  sc.nextInt();

		
		try {
			double bx = calculateExponentialResult(a,b,x);
			System.out.println(bx);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect Input");
			e.printStackTrace();
		}


	}
}