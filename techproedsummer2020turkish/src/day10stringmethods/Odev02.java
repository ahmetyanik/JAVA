package day10stringmethods;

import java.util.Scanner;

public class Odev02 {
	
	public static void main(String[] args) {
		
		//Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Adinizi ve Soyadinizi giriniz: ");
		String adSoyad = scanner.nextLine();
		
		int ad = adSoyad.indexOf(' '); //adin kac karakterli oldugu burada
		int soyad = adSoyad.length()-(ad+1);
		
		int ikinciAd = adSoyad.indexOf(' ',ad+1);			
			
		if (ikinciAd==-1) {
			
			ad = adSoyad.indexOf(' '); //adin kac karakterli oldugu burada			
			soyad = adSoyad.length()-(ad+1);
			
			System.out.println("Sayin "+adSoyad+" adiniz "+(ad + soyad)+" harften olusmaktadir.");
		
		}else {
			
			ad = adSoyad.indexOf(' '); //adin kac karakterli oldugu burada			
			soyad = adSoyad.length()-(ad+2);
			
			System.out.println("Sayin "+adSoyad+" adiniz "+(ad + soyad)+" harften olusmaktadir.");		
		}		
			
		scanner.close();		
			
		}}

