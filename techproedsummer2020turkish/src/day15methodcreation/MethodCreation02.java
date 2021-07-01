package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		// Saati saniyeye, mili km'ye, kilogrami grama ceviren 
		//bir method yaziniz. bu methodu main methodun disinda 
		//olusturup main methodun icinden cagiriniz
		
			
		Scanner scanner = new Scanner (System.in);
		System.out.print("Birimi giriniz: ");
		String birim = scanner.nextLine().toLowerCase();
		
		System.out.print("Miktari giriniz: ");
		double miktar = scanner.nextDouble();
		
		
		dönüstürücü(birim,miktar);
		
		
		scanner.close();
		
	}
	
	public static void dönüstürücü(String birim, double miktar) {
		
		switch(birim) {
		
		case "saat":
			System.out.println(miktar*60*60);
			break;
			
		case "mil":
			System.out.println(miktar*1.6);
			break;
			
		case "kilogram":
			System.out.println(miktar*1000);
			break;
			
		default:
			System.out.println("saat, mil ve kilogram disinda bir birim girmeyiniz!");
		
		}
		
	}
	
	
	

}
