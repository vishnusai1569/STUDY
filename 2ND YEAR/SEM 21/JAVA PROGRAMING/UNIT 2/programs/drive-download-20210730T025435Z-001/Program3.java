package unit2;
import java.util.Random;
import java.lang.*;

class Program3 {
	public static void main(String [] args) {
		int a, b;
		
		//Case 1: Exception Not Handled
		/*b = 0;
		a = 10 / b;
		System.out.println("10" + " / by " + b + " is "+a);
		*/
		//Case 2: Exception Handled
		
		try {
			b = 0;
			a = 10 / b;
			System.out.println("10" + " / by " + b + " is "+a);
		}catch (ArithmeticException ae) {
			System.out.println("Divide by Zero Error");
			System.out.println(ae);
		}
		System.out.println("After Catch Statement");
		
		Random rand = new Random();
		int x;
		for (int i=0; i<100;i++) {
			x = rand.nextInt(10); 
			//Random numbers are generated between 0 and 9.			
			try {				
				a = 12345 / x;
			}catch(ArithmeticException ae) {
				System.err.println("Division by Zero");
				a = 0;
			}
			System.out.println("a ==> " + a + " x==> " + x);
		}
	}
}