import java.util.*;


/**
 * The main class f5 having main function to start the execution. Contains functions for calculations. 
 * @author Dhananjay Narayan
 *
 */
class f5{

	/**
	 * A function to calculate power when two inputs are given. 
	 * @param a the base of the number
	 * @param b the power to which the base will be raised
	 * @return res the result of the power calculation.
	 */
	public static int powerCalc(int a,int b) {
		
		
		if (b == 0) {
			return 1;
		}
		else {
		int res = a^b;
		return res;
		}
	}
	
	/**
	 * The main function for the application
	 * @param args
	 */
    public static void main(String args[]){
    	System.out.println("In Eclipse Now: ");
        System.out.println("F5: ab^x");
        System.out.println("In Source Now");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b and x");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x =  sc.nextInt();
        
        int bx = powerCalc(b,x);
        int answer = a*bx;
        
        System.out.println("Result is : "+answer );
        
    }
}