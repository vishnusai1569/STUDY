package unit2;

public class MyCalculator implements CalculatorInterface {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b){
		return a - b;
	}
	public int mult(int a, int b){
		return a * b;
	}
	public int div(int a, int b){
		return a / b;
	}
	
	public static void main(String [] args) {
		MyCalculator myc = new MyCalculator();
		int x = myc.add(2,3);
		System.out.println(x);
		x = myc.sub(3,2);
		System.out.println(x);
		x = myc.mult(3,2);
		System.out.println(x);
		x = myc.div(8,2);
		System.out.println(x);
	}
}