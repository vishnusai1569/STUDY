/* Program to demonstrate the Scope of Variables */
class Program6 {
    public static void main(String [] args) {
        int global; // Accessible to all the blocks
        global = 10;
        if (global == 10) {
            int localtoif=20; // Accessible onlywith the current if block 
            System.out.println("Global Scope: " + global);
            localtoif = localtoif + global;
            System.out.println("Local Scope: " + localtoif);
            global = global + localtoif;
        }
        // localtoif - is not accesible in this block.
        // Updated value of global variable
        System.out.println("Global Scope Outside the if block: " + global);
		//System.out.println("Local variable declared inside the if block: " + localtoif);
		
    }
}