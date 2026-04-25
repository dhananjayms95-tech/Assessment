package assignment;

class Vechilce1 {
	void run() {
		System.out.println("Vechile is running");
	}
}
class Car1 extends Vechilce1 {
	void run() {
		System.out.println("Car is running smoothly");
	}
	
}

public class VechileMethodOverriding {

	public static void main(String[] args) {
		Vechilce1 v = new Vechilce1();
		Car1 c = new Car1();
		v.run();
		c.run();
		
		
	}

}
