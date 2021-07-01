package day20arrays;

import java.util.Arrays;

public class Alistirma03 {

	public static void main(String[] args) {
		// Bir String ve bir integer array olusturunuz ve daha sonra bu iki arayin elemanlarini 
		//sirali halde ekrana yazdiriniz
		
		int arr1[] = {21,5,2,1,19,32,97,89};
		String arr2[] = {"Ahmet","Java","Zeynep","Ayse","Azra"};
		
		System.out.println("Siralamadan önce arr1[]: "+Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println("Siraladiktan sonra arr1[]:" + Arrays.toString(arr1));
		
		System.out.println();
		
		
		System.out.println("Siralamadan önce arr2[]: "+ Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("Siralamadan sonra arr2[]: "+ Arrays.toString(arr2));
		
		
	}

}
