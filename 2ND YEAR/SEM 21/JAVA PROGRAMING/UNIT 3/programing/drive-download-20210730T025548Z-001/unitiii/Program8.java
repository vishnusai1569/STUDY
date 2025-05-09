package unitiii;

//Demonstrate the clone() method
// Cloneable class because it implements the interface Cloneable.
class TestClone implements Cloneable {
	int a;
	double b;

//This method calls Object's clone().
	TestClone cloneTest() {
		try {
//call clone in Object.
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed.");
			return this;
		}
	}
}

public class Program8 {

	public static void main(String[] args) {
		TestClone x1 = new TestClone();
		TestClone x2;
		x1.a = 10;
		x1.b = 20.98;
		x2 = x1.cloneTest(); // clone x1
		System.out.println("x1: " + x1.a + " " + x1.b);
		System.out.println("x2: " + x2.a + " " + x2.b);
		x2.a=100;
		System.out.println("x2: " + x2.a + "\nx1:" + x1.a);
	}

}
