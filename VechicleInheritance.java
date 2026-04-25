package assignment;

class Vechicle {
	String brand;
	int speed;
	
	Vechicle(String brand, int speed){
		this.brand= brand;
		this.speed = speed;
	}
	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Speed: "+ speed);
		
	}
}

class Car extends Vechicle {
	String fueltype;
	Car (String brand, int speed, String fuelType) {
		super (brand,speed);
		this.fueltype = fuelType;
	}
	void display() {
		super.display();
		System.out.println("FuelType :" + fueltype);
		
	}
	
}

public class VechicleInheritance {

	public static void main(String[] args) {
		Car c = new Car("Hyundai" ,120, "Petrol");
		c.display();
	}

}
