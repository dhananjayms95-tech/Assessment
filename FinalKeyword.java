package assignment;

class Book4 {
	final int ISBN = 12345;
	void showISBN() {
		
		System.out.println("ISBN: " +ISBN);
		
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		Book4 obj = new Book4();
		obj.showISBN( );
		
		 // obj.ISBN = 54321; // ❌ ERROR: cannot assign value to final variable

	}

}
