// Access Specifier
// Super Class - Program 1
package p1;

public class ProtectedClass_P1 {
	int n_nomodifier = 1;
	private int n_private = 2;
	protected int n_protected = 3;
	public int n_public = 4;
	
	public ProtectedClass_P1() {  
	// No Argument Constructor (or) Default Constructor
		System.out.println("Base Class Constructor");
		System.out.println("n_nomodifier = " + n_nomodifier);
		System.out.println("n_private = " + n_private);
		System.out.println("n_protected = " + n_protected);
		System.out.println("n_public = " + n_public);
	}
}