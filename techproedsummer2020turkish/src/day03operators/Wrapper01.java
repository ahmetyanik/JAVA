package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
	
		// Kullanicinin ad ve soyadini alip ekrana yazdir
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen adinizi giriniz: ");
		String ad = scanner.nextLine();
		System.out.print("L�tfen soyadinizi giriniz: ");
		String soyad = scanner.nextLine();  // strinleri kullanicidan almak icin next() veya nextLine() kullanilir.
		
		System.out.println("Adiniz Soyadiniz: "+ ad+" "+soyad);
		

	}

}
