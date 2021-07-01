package alistirmalar;

import java.util.Scanner;

public class YildizdanÜcgenCizdirma {

	public static void main(String[] args) {
		
		//Konsoldan girilen sayı kadar alt alta yıldız koyarak üçgen çizdirme java algoritma kodunu yazınız.

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int sayi = scanner.nextInt();
		
		for (int i =1 ; i<=sayi; i++) {
			
			for (int j=0; j<i; j++) {
				
				System.out.print("*");
			}
				System.out.println(" ");
		}
		
		
		
		
		
		
		
		
	}

}
