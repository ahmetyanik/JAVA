package day06ifstatetement;

import java.util.Scanner;

public class Odev7 {

	public static void main(String[] args) {
		/*Kullanıcıdan alacağı ürün miktarını ve ürünün birim ﬁyatını alın. Eğer urun miktarı 1000 den 
		 * fazla ise  Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın.
		 *  Diğer durumlarda  ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen aldiginiz ürünün miktarini giriniz: ");
		double miktar = scanner.nextDouble();
		
		System.out.print("Lütfen aldiginiz ürünün fiyatini giriniz: ");
		double fiyat = scanner.nextDouble();
		
		if(miktar>1000) {
			
			System.out.println("Ürünün fiyati: "+((fiyat*miktar)*90/100));
		}else {
			
			System.out.println("Ürünün fiyati: "+ (fiyat*miktar));
		}
		
		
		
	}

}
