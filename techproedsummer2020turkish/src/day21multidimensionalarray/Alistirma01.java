package day21multidimensionalarray;

import java.util.Arrays;

public class Alistirma01 {

	public static void main(String[] args) {
		
		int arr[][] = new int [2][3];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][1]=4;
		arr[1][0]=9;
		arr[1][2]=18;
		arr[1][1]=7;
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(arr[0][1]+arr[1][1]);
		
		

	}

}
