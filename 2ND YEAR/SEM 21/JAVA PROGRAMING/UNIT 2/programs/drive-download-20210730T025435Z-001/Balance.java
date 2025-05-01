// Name of the package MyPack.
package mypack;

// import mypack.Balance;
public class Balance {
	
	String name;
	double bal;
	
	public Balance(String n, double b) {
		name = n;
		bal = b;
		System.out.println("Constructor Called");
	}
	
	public void show() {
		if (bal < 0)
			System.out.print("--> ");
		System.out.println(name + ": Rs." + bal);
	}
}