package day20arrays;

import java.util.Arrays;

public class Odev03 {

	public static void main(String[] args) {
		
		int arr[] = {2,1,7,6};
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 2));
		System.out.println(Arrays.binarySearch(arr, 7));
		System.out.println(Arrays.binarySearch(arr, 3));
		System.out.println(Arrays.binarySearch(arr, 9));
		
		String str[] = {"A","C","B","D"};
		Arrays.sort(str);
		System.out.println(Arrays.binarySearch(str, "A"));
		System.out.println(Arrays.binarySearch(str, "C"));
		System.out.println(Arrays.binarySearch(str, "E"));
		System.out.println(Arrays.binarySearch(str, "G"));
		
	}

}
