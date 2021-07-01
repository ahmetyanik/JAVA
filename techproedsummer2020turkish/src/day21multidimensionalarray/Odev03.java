package day21multidimensionalarray;

public class Odev03 {


	public static void main(String[] args) {
		// Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı 
		//index’e sahip elemanların toplamını  ekrana yazdıran bir program yazınız  
		//arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} } 
		
	
		
		int[][] arr1 = { {1,2}, {3,4,5}, {6} };
		
		int[][] arr2 = { {7,8,9}, {10,11}, {12}};
		
		 int i;
		 int j;
		 int x;
		 int y;		
			
			if(arr1.length<=arr2.length) {
				
				x = arr1.length;
			}			
			
			else {
			
				x = arr2.length;
				
			}
			
			for(i =0; i<x;i++) {
				
			
				if(arr1[i].length<=arr2[i].length) {
					
					y = arr1[i].length;
				}
				else {
					y =arr2[i].length;
				}
				
				for(j=0;j<y;j++ ) {					
					
					
					System.out.println(arr1[i][j]+ " ve "+ arr2[i][j] +
							"'nin toplami: "+(arr1[i][j]+arr2[i][j]));
					
						}			
			}	
	}
}
