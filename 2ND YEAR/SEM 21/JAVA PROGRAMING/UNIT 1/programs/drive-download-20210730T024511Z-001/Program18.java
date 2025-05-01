/* Box Class with Constructor and Methods */
class Box {
	double width;
	double height;
	double depth;
	
	Box () {
		/* Example of Do Nothing Constructor */
	}
	
	/* Parameterized Constructor */
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {
		return width * height * depth;
	}
}

public class Program18 {
	public static void main(String [] args) {
		/* Object is instantiated with do nothing Constructor */
		Box b1 = new Box(); 
		System.out.println("Box B1 -> Width : " + b1.width);
		System.out.println("Box B1 -> Height : " + b1.height);
		System.out.println("Box B1 -> Depth : " + b1.depth);		
		System.out.println("Box B1 -> Volume : " + b1.volume());
		System.out.println("----------------------------------");
		
		Box b2 = new Box(10,20,30);
		System.out.println("Box B2 -> Width : " + b2.width);
		System.out.println("Box B2 -> Height : " + b2.height);
		System.out.println("Box B2 -> Depth : " + b2.depth);		
		System.out.println("Box B2 -> Volume : " + b2.volume());
		System.out.println("----------------------------------");
		Box b3 = new Box(5,6,7);
		System.out.println("Box B3 -> Width : " + b3.width);
		System.out.println("Box B3 -> Height : " + b3.height);
		System.out.println("Box B3 -> Depth : " + b3.depth);		
		System.out.println("Box B3 -> Volume : " + b3.volume());
		System.out.println("----------------------------------");
		
		Box b4 = new Box();
		System.out.println("Box B4 -> Width : " + b4.width);
		System.out.println("Box B4 -> Height : " + b4.height);
		System.out.println("Box B4 -> Depth : " + b4.depth);
		b4 = b3;
		System.out.println("Box B4 -> Width : " + b4.width);
		System.out.println("Box B4 -> Height : " + b4.height);
		System.out.println("Box B4 -> Depth : " + b4.depth);		
		System.out.println("Box B4 -> Volume : " + b4.volume());
		System.out.println("----------------------------------");
		
		Box b5 = new Box('a','b');
	}
}