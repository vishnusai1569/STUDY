package unitiii;

public class Program5 {

	public static void main(String[] args) {
		// Exec - Child Process
		// Runtime
		Runtime r = Runtime.getRuntime();
		System.out.println(r);
		
		Process p = null;
		try {
			p = r.exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\winword.exe");
			System.out.println(p);
		} catch (Exception e) { //RuntimeException
			System.out.println("Error executing ms paint.");
		}
	}

}
