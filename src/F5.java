import java.util.*;

class f5{

	public static int powerCalc(int a,int b) {
		int res = a^b;
		return res;
	}
	
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