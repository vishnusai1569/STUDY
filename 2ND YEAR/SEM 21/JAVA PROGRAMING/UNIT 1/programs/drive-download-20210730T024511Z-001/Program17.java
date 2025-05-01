/* Box Class with Constructor and Methods */
class Box {
	double width;
	double height;
	double depth;
	
		/* Constructor initizes the member variables */
	Box (/* No Arguments Passed */) {
		width = 1;
		depth = 2;
		height = 3;
		System.out.println("Class Box member variables are initialized using No Argument Constructor");
	}
	
	/* Method */
	double volume() {
		return width * height * depth;
	}
}

public class Program17 {
	public static void main(String [] args) {
		Box b1 = new Box();
		System.out.println("Box B1 -> Width : " + b1.width);
		System.out.println("Box B1 -> Height : " + b1.height);
		System.out.println("Box B1 -> Depth : " + b1.depth);
		
		System.out.println("Box B1 -> Volume : " + b1.volume());
	}
}