// Access Specifier
// Protected Class Different Package - Program 4
// Inheritance
package p2;

class ProtectedClass2_P4 extends p1.ProtectedClass_P1 {
	ProtectedClass2_P4() {
		System.out.println("derived other package constructor");
		// class or package only
		// System.out.println("n = " + n_nomodifier);
		// class only
		// System.out.println("n_pri = " + n_private);
		System.out.println("n_pro = " + n_protected);
		System.out.println("n_pub = " + n_public);
	}
}