package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		
		// Kullanicidan yil girmesini isteyin
		// Girilen yil artik yil ise ekrana “Artik Yil” yazdirin
		// Girilen yil artik yil degil ise ekrana “Artik Yil Degil” yazdirin.
		// Artik yil 1) Yil 100'e bölünürse 400'e de bölünmeli
		//			 2) Yil 100'e bölünmezse 4'e bölünmeli 
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir yil giriniz: ");
		int year = scanner.nextInt();
		
		if(year%100==0) {
			
			if(year%400==0) {
				
				System.out.println("Artik Yil");
				
				
			}else {
				System.out.println("Artik Yil Degil");
				
			}
			
			
		}else if(year%100!=0) {
			
			if(year%4==0) {
				
				System.out.println("Artik Yil");
			}else {
				
				System.out.println("Artik Yil Degil");
			}
		}
		
		
		scanner.close();

	}
	
	

}
