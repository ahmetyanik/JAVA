package day21multidimensionalarray;

public class Odev3DigerYol {

	public static void main(String[] args) {

//		3) Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı 
//		index’e sahip elemanların toplamını  ekrana yazdıran bir program yazınız  
//		arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }
		
		
		int arr1[][]= { {1,2}, {3,4,5}, {6} };
		int arr2[][]= { {7,8,9}, {10,11}, {12} };
		
		int sum=0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				for(int i1=0;i1 <arr2.length;i1++) {
					for(int j1=0;j1<arr2[j1].length;j1++) {
						if (i == i1 && j == j1) {
							sum = sum + arr1[i][j] + arr2[i1][j1];
							
						}						
					}
				}
			}
		}
		
		System.out.println(sum);

	}

}
