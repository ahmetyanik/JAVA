package day15methodcreation;

import java.util.Scanner;

public class Odev04 {

	private static final String String = null;


	public static void main(String[] args) {
		
//		Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve 
//		iki sayı seçmesini söyleyin.  Hangi şekli seçerse, o şeklin alanını ve 
//		çevresini ekrana yazdıran programı yazınız

		
	
	
		alan();
		

	}

	
	public static void alan() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sekil seciniz: ");
		String sekil1 = scanner.nextLine();
		
		System.out.print("Taban uzunlugu giriniz: ");
		int kenar1 = scanner.nextInt();
		System.out.print("Boy uzunlugu giriniz: ");
		int kenar2 = scanner.nextInt();
		
		
		switch(sekil1) {
		
		case "paralelkenar":
			
			System.out.print("Lütfen yükseklik giriniz: ");
			int yükseklik = scanner.nextInt();
			System.out.println("Paralelkenarin cevresi: "+2*(kenar1+kenar2));
			System.out.println("Paralelkenarin alani: "+ (yükseklik*kenar1));
			break;
			
		case "dikdörtgen":
			System.out.println("Dikdörtgenin cevresi: "+2*(kenar1+kenar2));
			System.out.println("Dikdörtgenin alani: "+ (kenar1*kenar2));
			break;
			
		case "ücgen":
			System.out.print("Lütfen ücüncü kenari giriniz: ");
			int ücüncüKenar = scanner.nextInt();
			System.out.println("Ücgenin cevresi: "+(kenar1+kenar2+ücüncüKenar));
			
			double u= (kenar1+kenar2+ücüncüKenar)/2;
			double alan = Math.sqrt((u*(u-kenar1)*(u-kenar2)*(u-ücüncüKenar)));
			System.out.println("Ücgenin alani: "+ (alan));
			break;
			
		default:
		
			System.out.println("Gecerli bir sekil giriniz: ");
			
			
		}
			
			
		
		
		
		
	}
	
	
	
	
	
	
	
}
