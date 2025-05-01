/* Access Test */
class AccessTest {
	int a; // Default scope is public and it is assigned implicitly
	public int b; // Scope of public is defined explicitly. 
	private int c;
	
	// Public method to set the member variable c.
	void setC(int i) {
		c = i;
	}
	
	// Public method to get the value of the member variable c.
	int getC() {
		return c;
	}
}

public class Program23 {
	public static void main(String [] args) {
		AccessTest act = new AccessTest();
		act.a = 10;
		act.b = 20;
		//act.c = 30; //-> Error. As c is private.
		act.setC(30);
		System.out.println("a = " + act.a + "\nb = " + act.b);
		System.out.println("c = " + act.getC()); // act.c -> Error.
		//System.out.println("c="+act.c);
		
	}
}