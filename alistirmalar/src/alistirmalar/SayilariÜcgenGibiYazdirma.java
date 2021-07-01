package alistirmalar;

import java.util.Scanner;

public class SayilariÜcgenGibiYazdirma {

	public static void main(String[] args) {
	
//		Konsoldan girilen sayıyı 1 e kadar yazdırıp,aynı satırda tekrardan verilen
//		sayıya kadar yazdıran ve alt alt 1’er azaltıp aynı işlemi üçgen gibi devam 
//		ettiren java algoritma kodunu yazınız.	
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		
		for(int i = sayi; i>=1;i--) {
			
			for(int j=i;j>=1;j-- ) {
				
				System.out.print(j+" ");
				
			}for (int k = 2; k<=i;k++) {
				
				System.out.print(k+" ");
			}
			System.out.println("");
			
			
			
		}
		
		
		
		
		
		
		
		}}	

	


