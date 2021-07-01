package alistirmalar;

import java.util.Scanner;

public class KullanicininGirdigiSayiKadarYildiz {

	public static void main(String[] args) {
		
		//Konsoldan kullanıcının girdiği integer değer kadar alt alta yıldız 
		//üçgen yapan java algoritma kodunu yazınız ?
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		
		int sayi = scanner.nextInt();
		
		
		
		for(int i=1; i<=sayi; i++) {
			
			for (int j = 0; j<i ; j++) {
				

			
				
				System.out.print("*");
			}
			
				System.out.println("");
			
		
		}}}
		
		

	


