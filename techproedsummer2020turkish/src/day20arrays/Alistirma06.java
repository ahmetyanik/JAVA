package day20arrays;

import java.util.Scanner;

public class Alistirma06 {

	public static void main(String[] args) {
//		Write a Java program to calculate the average value of array elements.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kac adet eleman gireceksiniz?: ");
		int adet = scanner.nextInt();
		
		int arr[] = new int[adet];
		int length = arr.length;
		double sum = 0;
		
		for(int i=0;i<length;i++) {
			
			arr[i] = scanner.nextInt();
			sum +=arr[i];
		}
		System.out.println("Ortalama: "+sum/adet);
	}

}
