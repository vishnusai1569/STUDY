public class Program19 {
  int x; // member variable

  // Constructor with a parameter
  public Program19(int x) {
    this.x = x; // this.x -> refers to instance variable
	//x -> refers to parameter variable
	
  }

  // Call the constructor
  public static void main(String[] args) {
    Program19 pobj = new Program19(2021);
    System.out.println("Value of x = " + pobj.x);
  }
}