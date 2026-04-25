package assignment;

class Book3 {
	static String libraryName = "City Library";
	static void showLibrary() {
		System.out.println("Library: "+ libraryName);
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		Book3.showLibrary();

	}

}
