package assignment;
abstract class Payment {
	int amount;
	// constructor 
	Payment(int amount) {
		this.amount= amount;
	}
	// abstract method 
	abstract void makePayment();
	// concrete method 
	void paymentdeatils() {
		System.out.println("Payment amount : " + amount);
	}
}
// subclass 1
class CreditCardPayment extends Payment {
	String cardNumber;
	CreditCardPayment (int amount, String cardNumber){
		super(amount);
		this.cardNumber=cardNumber;
	}
	void makePayment() {
		System.out.println("Paid " + amount + " using credit Card Ends with " + cardNumber);
	}	
}
class UPIPayment extends Payment {
	String upiId;
	UPIPayment(int amount,String upiId) {
		super(amount);
		this.upiId=upiId;
	}
	void makePayment() {
		System.out.println("Paid " + amount + " using UPI ID : " + upiId);
	}
	
}

public class PaymentMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1= new CreditCardPayment (5000,"1234");
		p1.paymentdeatils();
		p1.makePayment();
		System.out.println();
		
		Payment p2 = new UPIPayment(1500, "user@upi");
		p2.paymentdeatils();
		p2.makePayment();
			
		
	}

}
