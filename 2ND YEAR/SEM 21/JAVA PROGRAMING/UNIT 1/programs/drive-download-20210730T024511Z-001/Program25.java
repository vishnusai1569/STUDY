class OuterClass {
	int outer_x = 10;
	void test() {
		InnerClass ic = new InnerClass();
		ic.display();
	}
	class InnerClass {
		void display() {
			System.out.println("Member Variable of Outer Class outer_x = " + outer_x);
		}
	}
}

public class Program25 {
	public static void main(String [] args) {
		OuterClass oc = new OuterClass();
		oc.test();
	}
}