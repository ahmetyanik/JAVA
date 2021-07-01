package denemeler;

import java.util.Scanner;

public class Asalsayi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		boolean asalMi = true;
		
		for (int i=2;i<sayi;i++) {
			
			
			if (sayi %i==0) {
				
				asalMi = false;
				break;
			}
			}	
			
			if (asalMi==true) {
				
				
				System.out.println("Sayiniz bir asal sayidir.");
				
				
			}
			else {
				
				System.out.println("Sayiniz bir asal sayi degildir.");
				
				
			}			
		
		}
		
	}


