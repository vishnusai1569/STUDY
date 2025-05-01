// Method overriding.
class A {
	int i, j;
	A(int a, int b) {
		i = a;
		j = b;
	}
	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A {
	int c;
	B(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	// display c – this overrides show() in A
	void show() {
		System.out.println("Value of c in subclass by overriding super class method show: " + c);
	}
}

class Program28 {
	public static void main(String args[]) {
		B subOb = new B(100, 200, 300);
		subOb.show(); // this calls show() in B
	}
}