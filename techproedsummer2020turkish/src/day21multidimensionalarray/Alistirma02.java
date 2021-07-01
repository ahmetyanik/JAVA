package day21multidimensionalarray;

import java.util.Arrays;

public class Alistirma02 {

	public static void main(String[] args) {
		
		int arr[][] = {{2,3,6},{1,2},{4},{6,9,0,8},{5,3,9}};
		
		System.out.println(Arrays.deepToString(arr));
		
		//arr arrayindeki tüm elemanlarin toplamini veren programi yaziniz
		
		int sum = 0;
		
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length;j++) {
				
				sum += arr[i][j];
				
			}
		}		System.out.println(sum);
		
		
		

	}

}
