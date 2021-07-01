package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Alistirma10 {

	public static void main(String[] args) {
		// kullanıcıdan length.i 3 olan iki integer array alıyoruz, orta degerlerini 
		//alip lenght(2) olan yeni dizi oluşturuyoruz
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("3 ögeli birinci arraye elemanlarini atayiniz: ");
		int arr[] = new int[3];
		
		for(int i=0; i<3; i++) {
			
			arr[i] = scanner.nextInt();
			
		}

		System.out.print("3 ögeli ikinci arraye elemanlarini atayiniz: ");
		int arr2[] = new int[3];
		
		for(int i=0; i<3; i++) {
			
			arr2[i] = scanner.nextInt();
			
		}System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

		int arr3[] = {arr[1],arr2[1]};
		System.out.println(Arrays.toString(arr3));
	}

}
