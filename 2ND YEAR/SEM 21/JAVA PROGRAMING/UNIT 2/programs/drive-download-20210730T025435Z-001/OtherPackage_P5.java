// Access Specifier
// Other Package - Create an object - Program 5
package p2;

import p1.*;

class OtherPackage_P5 {
	OtherPackage_P5() {
		ProtectedClass_P1 p = new ProtectedClass_P1();
		// Alternate way to import a class from another package 
		// p1.ProtectedClass_P1 p = new p1.ProtectedClass_P1();
		System.out.println("other package constructor");
		// class or package only
		// System.out.println("n = " + p.nomodifier);
		// class only
		// System.out.println("n_pri = " + p.n_private);
		// class, subclass or package only
		// System.out.println("n_pro = " + p.n_protected);
		System.out.println("n_pub = " + p.n_public);
	}
}