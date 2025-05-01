class Program20 { 
	public static void main(String[] args) 
	{ 
		Program20 p = new Program20();
		p.finalize();
		p = null;
		// Requesting JVM to call Garbage Collector method 
		System.gc(); 
		System.out.println("Main Completes"); 
	} 

	// Here overriding finalize method 
	public void finalize() 
	{ 
		System.out.println("finalize method overriden"); 
	} 
} 
