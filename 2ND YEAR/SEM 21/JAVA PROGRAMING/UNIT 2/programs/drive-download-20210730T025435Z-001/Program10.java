// This program creates a custom exception type.
class MyException extends Exception {
	private int detail;
	MyException(int a) {
		detail = a;
	}
	//overriding - Exception
	public String toString() {
		return "MyException[" + detail + "]";
	}
}
class Program10 {
	// method throws the user defined exception class - MyException
	static void compute(int a) throws MyException {
		System.out.println("Called compute(" + a + ")");
		if(a > 10)
			throw new MyException(a);
		System.out.println("Normal exit");
	}
	
	public static void main(String args[]) {
		try {
			compute(1); // normal exit
			compute(11); // MyException is thrown
			// The statements will neve get executed
			compute(5); // normal exit
			compute(20); // MyException is thrown
		} catch (MyException e) {
			System.out.println("Caught " + e);
		}
		try {
			compute(11);
		}catch(MyException me) {
			me.printStackTrace();
		}
		try {
			compute(1);
		}catch(MyException me) {
			me.printStackTrace();
		}
		try {
			compute(5);
		}catch(MyException me) {
			me.printStackTrace();
		}
		try {
			compute(20);
		}catch(MyException me) {
			me.printStackTrace();
		}
	}
}