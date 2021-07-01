package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Alistirma09 {

	public static void main(String[] args) {
		// kullanıcıdan 3 integerdan oluşan bir array girmesini istiyoruz, 
		//ilk ve son index değerleri yer değiştirip tekrar yazdırıyoruz.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Üc integerdan olusan bir array yaziniz: ");
		int arr[] = new int[3];
		
		int arr2[] = new int[3];
		
		for(int i=0; i<3;i++) {
			
			arr[i]=scanner.nextInt();
		}
			
			arr2[0]=arr[2];
			arr2[1]=arr[1];
			arr2[2] = arr[0];
			
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(arr2));
	}

}
