class Box {
	double width;
	double height;
	double depth;
	
	/* Do Nothing Constructor */
	Box() {
	}
	
	/*Overloaded Constructor 1 */
	Box(double len) {
		width = height = depth = len;
	}
	/*Overloaded Constructor 2 */
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	/* method returns nothing and no argument */
	void volume() {
		System.out.println(width * height * depth);
	}
	
	/*
	double volume() {
		return width * height * depth;
	}*/
	
	/* overloaded method returns nothing with one argument */
	void volume(double d){
		System.out.println(width * height * d);
	}
	
	/* overloaded method returns nothing with two arguments */
	void volume(double h, double d){
		System.out.println(width * h * d);
	}
	
	/* overloaded method returns nothing with three arguments */
	void volume(double w, double h, double d){
		System.out.println(w * h * d);
	}
	
	/*double volume(double w, double h, double d){
		return w * h * d;
	}*/
}

public class Program21 {
	public static void main(String [] args) {
		Box b1 = new Box();
		Box b2 = new Box(1,2,3);
		Box b3 = new Box(4);
		b1.volume();
		b1.volume(2,3,4);
		b2.volume();
		b2.volume(4);
		b2.volume(4,5);
		b3.volume();
	}
}