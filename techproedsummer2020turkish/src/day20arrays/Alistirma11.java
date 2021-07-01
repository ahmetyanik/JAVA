package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Alistirma11 {

	public static void main(String[] args) {
		//  length 5 olan bir int array giriyoruz, array.de 2 varsa ve 
		//bir sonraki değer 3 ise 3 değerini 0 ile değiştiriyoruz.

		int arr[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.print("5 elemanli arrayinize elemanlari gönderiniz: ");
		
		for(int i=0;i<5;i++) {
			
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.binarySearch(arr, 2);
		System.out.println(Arrays.binarySearch(arr, 2));
		
		
		//if(Arrays.binarySearch(arr, 2) && )
	
	
	}

}
