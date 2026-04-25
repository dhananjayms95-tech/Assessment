package assignment;

class Vechicle3 {
	final void engineType() {
		System.out.println(" Engine type :  Standard engine" );
				 
	}
}
class Car2 extends  Vechicle3 {
	
	/*  void engineType() {  // ❌ ERROR
		System.out.println("Different engine");
	}  */
	
	
}
public class VechicleFinalMethod {

	public static void main(String[] args) {
		Car2 c = new Car2();
		c.engineType();

	}

}
