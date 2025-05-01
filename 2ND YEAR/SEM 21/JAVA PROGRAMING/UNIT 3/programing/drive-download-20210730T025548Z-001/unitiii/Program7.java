package unitiii;

public class Program7 {
	static byte a[] = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74 };
	static byte b[] = { 77, 77, 77, 77, 77, 77, 77, 77, 77, 77 };

	public static void main(String[] args) {
		// Array Copy
		// Converting Byte Array to String
		System.out.println("a = " + new String(a));
		System.out.println("b = " + new String(b));
		
		
		System.arraycopy(a, 0, b, 0, a.length); // b = a
		// Equivalently
		/*
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}*/
		
		System.out.println("a = " + new String(a));
		System.out.println("b = " + new String(b));
		
		System.arraycopy(a, 0, a, 1, a.length - 1);
		System.arraycopy(b, 1, b, 0, b.length - 1);
		
		// Index of B 0 to 9
		// Copy from Index 1 and b upto Index 9
		
		System.out.println("a = " + new String(a));
		System.out.println("b = " + new String(b));
	}

}
