package day02wrapperclasses;

import java.util.Scanner;

public class Scanner09 {

	public static void main(String[] args) {
	
		//8)Saati saniyeye çeviren bir program yazınız. (long kullanınız) Not 1: Saniye = Saat x 60 x 60
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen süreyi saat olarak giriniz: ");
		long saat = scanner.nextLong();
		
		System.out.println(saat+" saat "+(saat*60*60)+" saniyedir.");
		
	}

}
