// A simple example of inheritance.
// Create a superclass.
class A { // Superclass
	int i, j;
	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
}

// Create a subclass by extending class A.
class B extends A { // B Subclass and A is the super class for B
	int k;
	int i;
	void showk() {
		System.out.println("k: " + k);
	}
	void sum() {
		// i - subclass
		// j - superclass
		// k - subclass
		System.out.println("i+j+k: " + (i+j+k));
		// this.i - superclass
		System.out.println("i+j+k: " + (super.i+j+k));
	}
	void locali() {
		i = 10;
		System.out.println("Local Variable i: " + i);
	}
	void superi() {
		super.i = 20;
		System.out.println("Super Class Variable i: " + super.i);
	}
}

class Program26 {
	public static void main(String args []) {
		A superOb = new A();
		B subOb = new B();
		// The superclass may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of superOb: ");
		superOb.showij();
		System.out.println();
		/* The subclass has access to all public members of
		its superclass. */
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.showij(); // Method is available in Super Class A
		subOb.showk();
		System.out.println();
		System.out.println("Sum of i, j and k in subOb:");
		subOb.sum();
		System.out.println();
		/* Access local and super variables */
		subOb.locali();
		subOb.superi();
		subOb.sum();
		System.out.println();
		Class parentclass =  subOb.getClass();
		System.out.println("Class of subOb is : " + subOb.getClass());
		System.out.println("Parent Class of subOb is : " + parentclass.getSuperclass());
	}
}