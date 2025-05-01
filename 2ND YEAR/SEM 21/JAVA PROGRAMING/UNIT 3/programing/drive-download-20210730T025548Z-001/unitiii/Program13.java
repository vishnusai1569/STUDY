package unitiii;

import java.io.*;

public class Program13 {

	public static void main(String[] args) {
	
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);
			
			System.out.println("Enter Number1: ");
			String number1 = reader.readLine();
			
			System.out.println("Enter Number2: ");
			String number2 = reader.readLine();
			
			System.out.println(number1 + number2);
			
			// Convert to Integer and Calculate
			int a = Integer.parseInt(number1);
			int b = Integer.parseInt(number2);
			int sum = a + b;
			System.out.println("Addition of " + a + " + " + b + " = " +  sum);
			
			// Convert to Float and Calculate
			float f1 = Float.parseFloat(number1);
			float f2 = Float.parseFloat(number2);
			float total = f1 + f2;
			System.out.println("Addition of " + f1 + " + " + f2 + " = " +  total);
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
