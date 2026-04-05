package assignment;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr = {4,2,7,2,9,1};
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		// find the smallest 
		
		for (int i=0; i<arr.length;i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		// find the second smallest 
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < secondSmallest && arr[i] > smallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("Second Smallest Element is : "+ secondSmallest ); 



	}

}
