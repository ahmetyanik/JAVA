package day21multidimensionalarray;

public class Odev02 {

	public static void main(String[] args) {
		// Aşağıdaki multi dimensional array’in iç array’lerindeki son 
		//elemanların çarpımını ekrana yazdıran  bir program yazınız { {1,2,3}, {4,5}, {6} } 
		
		int arr[][] = { {1,2,3}, {4,5}, {6} } ;
		
		int carpim=1;
		
		for(int i=0; i<arr.length;i++) {
			
				carpim *=arr[i][arr[i].length-1];
						
			}
			
			System.out.println(carpim);
		}
		

	}


