import java.util.*;

/**
 * The main class having main function to start the execution. Contains other
 * functions for calculation of exponential function.
 * 
 * @author Dhananjay Narayan v 1.1.7
 *
 */
class f5ExponentialFunction {

  /**
   * A function to compute exponentiation using recursion
   * 
   * @param a The initial amount
   * @param b The base
   * @param x The exponent
   * @return The result of the computation
   * @throws Exception
   */
  public static double recursiveExponentiation(double a, double b, int x) throws Exception {

    if (b == 1 || b < 0) {
      System.out.println( "The base should not be equal to 1 or negative. If 1,it will make the function linear. If negative, the function will become logarithmic. ");
      return 0;
    }
    if (a == 0) {
      System.out.println("If a is zero, the answer becomes zero. The function will no longer be exponential. ");
      return 0;
    }
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
  public static double iterativeExponentiation(double a, double b, int x) throws Exception {

    if (b == 1 || b < 0) {
      System.out.println( "The base should not be equal to 1 or negative. If 1,it will make the function linear. If negative, the function will become logarithmic. ");
      return 0;
    }
    if (a == 0) {
      System.out.println("If a is zero, the answer becomes zero. The function will no longer be exponential. ");
      return 0;
    }

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
    } catch (InputMismatchException e1) {
      System.err.println( "Invalid datatype entered. Please enter the correct datatype. a and b should be double and x should be integer.");

    }

    double recursiveExponentiationResult = 0;
    double iterativeExponentiationResult = 0;

    try {

      recursiveExponentiationResult = recursiveExponentiation(a, b, x);
      iterativeExponentiationResult = iterativeExponentiation(a, b, x);

      System.out.println("We are computing the value of exponential function : ab^x ");
      System.out.println( "The computed value of exponentioal function with recursion is: " + recursiveExponentiationResult);
      System.out.println("The computed value of exponentioal function with iteratice method is: " +
        iterativeExponentiationResult);
    } catch (StackOverflowError t) {
      System.err.println("The computed value is too large to handle. Stack Overflow Occured.");
    }

    sc.close();
  }

}