package day21multidimensionalarray;

import java.util.Arrays;

public class Alistirma04 {

	public static void main(String[] args) {
		
		String str = "Ali can okula basladi ve okul cok güzel ve görkemliydi";
		
		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		
		
		String arr1[] = str.split("");
		
		System.out.println(str.length()-(arr.length-1));

		
		
	}

}
