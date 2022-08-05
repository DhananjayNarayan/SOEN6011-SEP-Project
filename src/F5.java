import java.util.*;


/**
 * The main class f5 having main function to start the execution. Contains functions for calculations. 
 * @author Dhananjay Narayan
 * v 0.0.3
 *
 */
class f5{

	/**
	 * A function to calculate power when two inputs are given. 
	 * @param a the base of the number
	 * @param b the power to which the base will be raised
	 * @return res the result of the power calculation.
	 */
	public static double calculateExponential(double a,double b,int x) throws Exception{


		if (x == 0) {
			return 1;
		}
		else {
			double res = b*x;
			return res;
		}
	}

	/**
	 * The main function for the application
	 * @param args
	 */
	public static void main(String args[]){
		
		System.out.println("F5: ab^x");
		System.out.println("In Source Now");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b and x");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int x =  sc.nextInt();

		
		try {
			double bx = calculateExponential(a,b,x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect Input");
			e.printStackTrace();
		}


	}
}