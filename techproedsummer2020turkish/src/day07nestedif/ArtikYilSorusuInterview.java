package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		
		// Kullanicidan yil girmesini isteyin
		// Girilen yil artik yil ise ekrana “Artik Yil” yazdirin
		// Girilen yil artik yil degil ise ekrana “Artik Yil Degil” yazdirin.
		// Artik yil 1) Yil 100'e bölünürse 400'e de bölünmeli
		//			 2) Yil 100'e bölünmezse 4'e bölünmeli 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir yil giriniz: ");
		int year = scanner.nextInt();
		
		if (year%100==0 && year%400==0) {
			
			System.out.println(year+" artik yildir.");
		}else if(year%100!=0 && year%4==0) {
			System.out.println(year+" artik yildir.");
		}else {
			System.out.println(year+" artik yil degildir.");
		}

	}

}
