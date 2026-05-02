package assignment;
import java.util.*;

class Mobile implements Comparable <Mobile> {
	String brand;
	String model;
	int price;
	
	Mobile(String brand,String model, int price){
		this.brand=brand;
		this.model=model;
		this.price=price;
		
}
	public int compareTo(Mobile m1) {
		return m1.price-this.price;
		
}
	
	void display() {
		System.out.println(brand+" "+model+" "+price);
	}

}



public class MobileStore {

	public static void main(String[] args) {
		
		ArrayList<Mobile> mobiles= new ArrayList<>();
		
		// 1. add 5 Mobile objects 
		mobiles.add(new Mobile("Samsung","S23",70000));
		mobiles.add(new Mobile("Apple", "iphone15",80000));
		mobiles.add(new Mobile("Oneplus", "12",60000));
		mobiles.add(new Mobile ("Vivo", "V30",35000));
		mobiles.add(new Mobile ("Realme","GT",30000));
		
		// 2. display all mobiles 
		for (Mobile m :mobiles) {
			m.display();
		}
		
		// 3. Sort mobiles based on price in descending order
		Collections.sort(mobiles);
		System.out.println("\nAfter Sorthig Descending");
		for (Mobile m :mobiles) {
			m.display();
			
		}
		
			// 4. remove the most expensive mobile 
			if(!mobiles.isEmpty()) {
				mobiles.remove(0);
			}
			System.out.println("\nAfter Removing the Expensive Mobiles");
			for (Mobile m :mobiles) {
				m.display();
			}
		
		
		
		
			// 5.Search mobile by brand
			String search ="vivo";
			for (Mobile m : mobiles) {
				if(m.brand.equalsIgnoreCase(search)) {
					System.out.println("\nBrand Found: "+ m.brand);
				}
			}
			//6. Update the price on one mobile 
			for (Mobile m : mobiles) {
				if(m.brand.equalsIgnoreCase("Samsung"))
					m.price=68000;
			}
				System.out.println("\nAfter updating the price");
				for (Mobile m: mobiles) {
					m.display();
				}
				
			// 7. display the final list 
				System.out.println("\nFinal List : ");
				for (Mobile m: mobiles) {
					m.display();
				}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
