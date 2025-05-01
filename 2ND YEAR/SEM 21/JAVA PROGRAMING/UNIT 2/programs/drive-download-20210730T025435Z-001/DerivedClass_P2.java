// Access Specifier
// Derived Class - Program 2
// Same as super class - ProtectedClass_P1 
package p1;

class DerivedClass_P2 extends ProtectedClass_P1 {
	DerivedClass_P2() {
		System.out.println("derived constructor");
		System.out.println("n = " + n_nomodifier);
		// class only
		// System.out.println("n_private = "4 + n_private);
		System.out.println("n_protected = " + n_protected);
		System.out.println("n_public = " + n_public);
	}
}