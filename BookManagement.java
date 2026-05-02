package assignment;
import java.util.*;

class Book1 implements Comparable <Book1>  {
	int bookId;
	String bookName;
	int price;
	Book1(int bookId,String bookName, int price){
		this.bookId=bookId;
		this.bookName = bookName;
		this.price= price;
		
	}
	void display() {
		System.out.println(bookId +" "+bookName+" "+price);
	}


public int compareTo (Book1 b) {
	return this.price- b.price;
}

}
	
public class BookManagement {

	public static void main(String[] args) {
		ArrayList<Book1> books = new ArrayList<>();
		Book1 b1= new Book1(101,"java",499);
		Book1 b2= new Book1(102,"Python",399);
		Book1 b3= new Book1(103,"SQL",299);
		Book1 b4= new Book1(104,"C++",599);
		
		books.add(b1); books.add(b2); books.add(b3); books.add(b4);
		System.out.println("Original List : ");
		// 1. Display all the books
		for (Book1 b : books) {
			b.display();
		}
		// 2. Sorted book based on price 
		System.out.println("\nAfter Sorthing by price");
		Collections.sort(books);
		for (Book1 b : books) {
			System.out.println(b.bookId+" "+b.bookName+" "+b.price);
		}
		
			// 3. Remove Book id 
		int removeId=102;
		 books.removeIf(book -> book.bookId == removeId);
		 System.out.println("\nAfter Removing the Book id 102 : ");
		for (Book1 b: books) {
			b.display();
		}
		// 4. Update the price of one book 
		
		for (Book1 b: books) {
			if(b.bookId ==103) {
				b.price=350;
			}
		}
		System.out.println("\nAfter Upddating price");
		for (Book1 b: books) {
			b.display();
		}
		
		// 5. search a book by name 
		String searchName ="java";
		for (Book1 b: books) {
			if (b.bookName.equalsIgnoreCase(searchName)) {
				System.out.println("\nbook Found: " + b.bookName);
				
			}
		}
		// 6. Display the final List 
		System.out.println("\nfinal List");
		for (Book1 b: books) {
			b.display();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


