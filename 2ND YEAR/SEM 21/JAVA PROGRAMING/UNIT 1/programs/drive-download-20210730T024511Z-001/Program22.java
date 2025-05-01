/* Object as Parameter */

class ObjectAsParameter {
	int i, j;
	ObjectAsParameter() {
		//Do nothing constructor
		//Non-Parameterized Constructor
	}
	ObjectAsParameter(int i, int y) {
		this.i = i;
		j = y;
	}
	
	boolean equalTo(ObjectAsParameter oap) {
		if (oap.i == i && oap.j == j) return true;
		else return false;
	}
	
	int add(ObjectAsParameter oap) {
		return oap.i + oap.j;
	}
	
	int addObjectVariabes(ObjectAsParameter oap) {
		return this.i + this.j + oap.i + oap.j;
		//i + j + oap.i + oap.j
	}
	
	ObjectAsParameter add() {
		ObjectAsParameter ob1 = new ObjectAsParameter(
		4+this.i, 5+this.j); // 4+i, 5+j
		return ob1;
	}
}

public class Program22 {
	public static void main(String [] args) {
		ObjectAsParameter oap1 = new ObjectAsParameter(10, 10);
		ObjectAsParameter oap2 = new ObjectAsParameter(10, 10);
		ObjectAsParameter oap3 = new ObjectAsParameter(-1, -1);
		ObjectAsParameter oap4 = new ObjectAsParameter();
		
		System.out.println("Is oap1 == oap2? " + 
		oap1.equalTo(oap2)
		);
		System.out.println("Is oap2 == oap3? " + 
		oap2.equalTo(oap3)
		);
		
		System.out.println("Add oap1 variables: " + 
		oap1.add(oap1)
		);
		System.out.println("Add oap1 variables: " + 
		oap1.add(oap2)
		);
		System.out.println("Add oap1 variables: " + 
		oap1.add(oap3)
		);
		System.out.println("oap1 + oap1 variables: " + 
		oap1.addObjectVariabes(oap1)
		);
		System.out.println("oap1 + oap2 variables: " + 
		oap1.addObjectVariabes(oap2)
		);
		System.out.println("oap1 + oap3 variables: " + 
		oap1.addObjectVariabes(oap3)
		);
		// Return type as an object
		oap4 = oap3.add();
		System.out.println(oap4.i + " " + oap4.j);
		System.out.println("oap4 + oap4 variables: " + 
		oap4.addObjectVariabes(oap4)
		);
	}
}