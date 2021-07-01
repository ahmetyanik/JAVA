package denemeler;

import java.util.Scanner;

public class OrtalamaAlan {

	public static void main(String[] args) {

		System.out.println("Kac adet sayi gireceksiniz: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int kacSayi= scanner.nextInt();
		int toplam=0;
		
		for(int i=1;i<=kacSayi;i++) {
			
			System.out.println("Lütfen "+i+". sayinizi giriniz: ");
			int sayi= scanner.nextInt();
			toplam +=sayi;
			
			
		}
		
		System.out.println("Girdiginiz sayilarin ortalamasi: "+(toplam/kacSayi));			

	}

}
