package day23date;

import java.util.Arrays;

public class Alistirma07 {

	public static void main(String[] args) {
		// Aşağıdaki multi dimensional array’in iç array’lerindeki son 
		//elemanların çarpımını ekrana yazdıran  bir program yazınız { {1,2,3}, {4,5}, {6} } 
		
		int arr[][] = { {1,2,3}, {4,5}, {6} };
		
		int carpim = 1;
		for(int i=0; i<arr.length;i++) {
			
				int x = arr[i].length-1;
				int y = arr[i][x];
				
				carpim *= y;
			
		}System.out.println(carpim);	
		

	}

}
