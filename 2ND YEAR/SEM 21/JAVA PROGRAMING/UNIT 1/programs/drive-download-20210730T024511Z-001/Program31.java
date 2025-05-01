// Display all command-line arguments.
class Program31 {
	public static void main(String args[]) {
		System.out.println("Number of arguments passed: " + args.length);
		for(int i=0; i<args.length; i++)
			System.out.println("args[" + i + "]: " + args[i]);
	}
}