package day21multidimensionalarray;

import java.util.Arrays;

public class MultidimensionalArray02 {

	public static void main(String[] args) {
		// Multidimensional Array Olusturup Deger Atamak 2. Yöntem
		
		// int arr[][] = {{},{},{}}; önce bu sekilde taslak olustururuz
		
		int arr[][] = {{1,2},{3},{4,5,6},{8,9}}; // sonra bu sekilde icine degerler atanir
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr[0][1]+arr[1][0]+arr[2][2]);
		
		//arr arrayindeki tüm elemanlarin toplamini veren programi yaziniz
		
			int sum= 0;
		
			for(int i=0;i<arr.length;i++) {
				
				for(int j=0; j<arr[i].length;j++) {

				sum = sum + arr[i][j];				
					
				}				
				}
			System.out.println(sum);
	}

}
