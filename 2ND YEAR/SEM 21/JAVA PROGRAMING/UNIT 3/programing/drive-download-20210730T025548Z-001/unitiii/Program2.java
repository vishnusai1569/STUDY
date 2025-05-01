package unitiii;

public class Program2 {

	public static void main(String[] args) {
		// To demonstrate isInfinite and isNaN

		Double d1 = new Double(1 / 0.);
		Double d2 = new Double(0 / 0.);
		Double d3 = new Double(new String("02")); // Valid Code
		// Double d4 = new Double(new String("SIST")); // throws NumberFormatException
		System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
		System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());
		System.out.println(d2 + ": " + d3.isInfinite() + ", " + d3.isNaN());

	}

}
