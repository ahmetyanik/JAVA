package day21multidimensionalarray;

import java.util.Arrays;

public class Alistirma10 {

	public static void main(String[] args) {
		// Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı 
		//index’e sahip elemanların toplamını  ekrana yazdıran bir program yazınız  
		//arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} } 	
	
		
		int[][] arr1 = { {1,2}, {3,4,5}, {6} };		
		int[][] arr2 = { {7,8,9}, {10,11}, {12}};
		
		
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr1[i].length;j++) {
				for(i=0; i<arr2.length;i++) {
					for(j=0;j<arr2[i].length;j++) {
						
						if(arr1[i].length<=arr2[i].length) {
							
							System.out.println(arr1[i][j]+arr2[i][j]);
						
							
						}
						
					}
				}
			}
		}
	}
		
}	
		
		
		
		

	


