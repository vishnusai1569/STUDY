package unitiii;

// Wrapper Class - Double Method.
public class Program1 {

	public static void main(String[] args) {

		Double d1 = new Double(3.14159); // Constructor - Double as an argument.
		Double d2 = new Double("314159E-5"); // Constructor that considers String as an argument.
		//314159E-5 = 314159*10^-5 or 314159/100000 = 3.14159
		
		// if d1 == d2?
		System.out.println(d1 + " = " + d2 + " -> " + d1.equals(d2));

		//Double d3 = new Double("s"); // Run time exception. Program compiles successfully.
		
		Float f1 = new Float(1);
		Float f2 = new Float(1.0);
		String s1 = new String("5.5");
		Float f3 = new Float(s1);
		float f4 = f1 + f2 + f3;
		System.out.println(f4);
		
		String s11 = new String("4");
		String s12 = new String(" CSE");
		String s13 = s11.concat(s12);
		System.out.println(s13);
		
	}

}
