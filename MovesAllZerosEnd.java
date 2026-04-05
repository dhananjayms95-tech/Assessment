package assignment;

public class MovesAllZerosEnd {

	public static void main(String[] args) {
		int[] arr = {1,0,3,0,5};
		int index = 0;
		
		// move non zero element 
		for (int i=0; i<arr.length; i++) {
			if (arr[i] !=0) {
				arr[index] = arr[i];
				index++;
			}
		}
		// fill the remaining zeros 
		while (index < arr.length) {
			arr[index] =0;
			index++;
		}
		// print the result 
		for (int i =0; i<arr.length; i++){
			System.out.print(arr[i] +" "  );
		}

	}

}
