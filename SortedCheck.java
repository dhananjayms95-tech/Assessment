package assignment;

public class SortedCheck {

	public static void main(String[] args) {
		int[] arr = {1,3,2};
		boolean isSorted = true;
		
		for (int i=1; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				isSorted = false;
				break;
			}
		}
		if(isSorted)
			System.out.println("Sorted");
		else 
			System.out.println("Not Sorted");

	}

}
