package day12scopewhileloop;

import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		
		//Math.random() ile ürettiğimiz random bir sayıyı tahmin etme programı:
		
		Scanner scanner = new Scanner(System.in);
		
		int sayi= 0;
		int tahmin = (int)(Math.random()*2);
		
		System.out.println(sayi);
		while(sayi!=tahmin) {
			
			System.out.print("Tahmin ettiginiz sayiyi giriniz: ");
			sayi = scanner.nextInt();
			
			if(sayi==tahmin) {
				
				System.out.println("Dogru tahmin...");
				
			}else if(sayi<tahmin) {
				System.out.println("Daha kücük bir sayi giriniz!");
			}
			
			
			
			
		}
		
		

	}

}
