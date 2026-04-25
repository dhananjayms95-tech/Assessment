package assignment;

class Book{
	String title;
	String author;
	
	// constructor 
	Book(String title, String author) {
		this.title=title;
		this.author=author;
		
	}
		// methods 
		void display() {
			System.out.println("Title : "+ title);
			System.out.println("Aothor: " + author);
		}
}
		
class EBook extends Book{
		int fileSize;
		
		// constructor using super 
		EBook(String title, String author,int fileSize){
			super(title,author); // calling parent constructor
			this.fileSize =fileSize;
			}
		void display() {
			super.display();
			System.out.println("FileSize: "+ fileSize +"MB");
		}
		
}
		
public class InheritanceConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook obj = new EBook("Atomic Habits ", "James Clear",5);
				obj.display();
	
		
	}

}
