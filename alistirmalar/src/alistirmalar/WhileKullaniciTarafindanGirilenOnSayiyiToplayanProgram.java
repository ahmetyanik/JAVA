package alistirmalar;

import java.util.Scanner;

public class WhileKullaniciTarafindanGirilenOnSayiyiToplayanProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		int sayac = 0;
		int toplam = 0;
		int i = 0;
		
		while(i<10) {
			
		System.out.print("Lütfen sayilari giriniz: ");
		int sayi = scanner.nextInt();
		
		toplam +=sayi;
		i++;
		sayac++;
			
		}System.out.println("Sayilarin Toplami: "+toplam);	

	}

}
