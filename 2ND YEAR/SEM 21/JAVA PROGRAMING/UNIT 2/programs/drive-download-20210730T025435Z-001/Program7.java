// This program contains an error and will not compile.
class Program7 {
	static void throwOne() {
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("demo");
	}
	public static void main(String args[]) {
		throwOne();
	}
}
