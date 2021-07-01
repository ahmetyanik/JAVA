package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		
//		Kullanıcıdan kaç elemanlı bir array girmesini  isteyin.
//		Bu array’in tum elemanlarını ekrana yazdırın.
//		Bu arayın ilk elemanını son eleman yapın ve tum elemanlarını ekrana yazdırın.
//		Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazdırın.

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kac elemanli bir integer array olusturmak istersiniz?: ");
		int length = scanner.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Array elemanlarini giriniz:");
		for (int i=0; i<length;i++) {
			
			arr[i] = scanner.nextInt();
			
		}
		//Arrays.toString(ilgiliarrayinadi)
		System.out.println(Arrays.toString(arr)); // Array'in tüm elemanlarini yazdirmaya 
		//yarayan method
		
		int arrSon[] = new int [length];
		
		for(int i=1; i<length;i++) {
			
			arrSon[i-1]=arr[i];			
			
		}arrSon[length-1] = arr[0];
		
		System.out.println(Arrays.toString(arrSon));
	}

}
