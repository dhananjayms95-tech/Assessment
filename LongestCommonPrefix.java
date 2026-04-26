package assignment;

public class LongestCommonPrefix {
	public static String findPrefix(String[] arr) {
		// Assume the first string is prefix 
		String prefix = arr[0];
		// compare with other string 
		for (int i=1; i<arr.length; i++) {
			while(arr[i].indexOf(prefix) !=0) {
				prefix = prefix.substring(0,prefix.length()-1); 
					if(prefix.isEmpty()) {
						return "";
					}
				}
			}
			return prefix;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"flower", "flow", "flight"};
		String[] arr1 = {"dog", "racecar","car"};
		String[] arr2 = {"interview", "internet","interval","interval"};
		String result = findPrefix(arr);
		String result1 = findPrefix(arr1);
		String result2 = findPrefix(arr2);
		System.out.println("Longest Common Prefix : " + result);
		System.out.println("Longest Common Prefix : " + result1);
		System.out.println("Longest Common Prefix : " + result2);

	}

}
