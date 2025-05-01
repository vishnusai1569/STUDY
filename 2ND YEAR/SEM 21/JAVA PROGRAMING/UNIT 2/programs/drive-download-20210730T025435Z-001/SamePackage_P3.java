// Access Specifier
// Create a object for the class ProtectedClass_P1 - Same Package Program 3

package p1;
class SamePackage_P3 {
	SamePackage_P3() {
		ProtectedClass_P1 p = new ProtectedClass_P1();
		System.out.println("same package constructor");
		System.out.println("n_nomodifier = " + p.n_nomodifier);
		// class only
		// System.out.println("n_pri = " + p.n_private);
		System.out.println("n_protected = " + p.n_protected);
		System.out.println("n_public = " + p.n_public);
	}
}