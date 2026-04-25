package assignment;

class Books {
	String getdescription() {
		return "This is a Physical book.";
	}
}
class EBook1 extends Books {
	@Override 
	String getdescription() {
		return "This is an Electronic Book";
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b= new Books();
		EBook1 e = new EBook1();
		System.out.println(b.getdescription());
		System.out.println(e.getdescription());

	}

}
