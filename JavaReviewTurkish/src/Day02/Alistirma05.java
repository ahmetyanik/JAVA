package Day02;

import java.util.Scanner;

public class Alistirma05 {

	public static void main(String[] args) {
		// Kullanıcıdan bir sayı girmesini isteyiniz
		// Sayı tek sayı ise "Sayınız tek sayıdır."
		// Sayı çift sayı ise "Sayınız çift sayıdır." yazdırınız
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int sayi = scanner.nextInt();
		
		
		String sonuc = sayi%2==0 ? "Sayiniz cift sayidir":"Sayiniz tek sayidir";
		
		System.out.println(sonuc);
		
		scanner.close();

	}

}
