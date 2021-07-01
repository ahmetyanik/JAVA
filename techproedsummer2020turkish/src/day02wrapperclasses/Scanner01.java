package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
	
		//Kullanici iki tamsayi versin.
		//Program bu tamsayilarin toplamini ve carpimini ekrana yazdirsin.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Iki tam sayi giriniz: ");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("Toplam: "+(sayi1+sayi2));
		System.out.println("Carpim: "+sayi1*sayi2);
		
		

	}

}
