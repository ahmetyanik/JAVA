package alistirmalar;

import java.util.Scanner;

public class BelliSartlaWhileDöngüsüneGirmekveCikmak {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int sayi = scanner.nextInt();
		
		
		while(sayi>0) {
			
			System.out.println("Burasi Calisti");
			System.out.print("Sayi giriniz: ");
			sayi = scanner.nextInt();
			
		}
		
			System.out.println("Döngü Bitti!");
		
		

	}

}
