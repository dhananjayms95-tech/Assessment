package assignment;

public class StringMethosPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hyundai";
		String reversed ="";
		for (int i= str.length()-1; i>=0; i--) {
			reversed +=str.charAt(i);
		}
		System.out.println("Reversed : " + reversed);
		String replaced = str.replaceAll("[aeiouAEIOU]", "*");
		System.out.println("Replaced: " + replaced);

		System.out.println("Equals Hyundai : "+ str.equals("Hyundai"));
	}

}
