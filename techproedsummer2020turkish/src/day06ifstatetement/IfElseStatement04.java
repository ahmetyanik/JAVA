package day06ifstatetement;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
		// Kullanicidan alacagi urun miktarini ve fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ürün Miktari giriniz: ");
		double ürünMiktari = scanner.nextDouble();
		
		
		double ürünFiyati =5.0; 
		
		if(ürünMiktari>1000) {
			
			System.out.println((ürünMiktari*80/100));
			
		}else {
			System.out.println(ürünMiktari*ürünFiyati);
		}
		
		
		
		

	}

}
