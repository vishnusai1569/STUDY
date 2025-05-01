class StaticClassExample {
	static int a = 15;
	static void display() {
		System.out.println("Static Variable a in class StaticClassExample:" + a);
	}
}
class Program24 {
	static int a = 10;
	static int b = 20;
	
	static int add() {
		return a+b;
	}
	
	public static void main(String [] args) {
		System.out.println("Access Static Method in Main Class: " + add());
		StaticClassExample.display();
		StaticClassExample.a = 25;
		StaticClassExample.display();
	}
}