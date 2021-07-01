package day09switchoperator;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
//		Kullanıcıdan A, B, C, D harﬂerinden birini alın eğer harf C ise ekrana “Doğru cevap” yazdırın. 
//		A, B, D den biri ise ekrana “Yanlış cevap” yazdırın. Bu harﬂerin dışındaki harﬂer için 
//		“Geçersiz cevap şıkkı” yazdırın.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir harf giriniz: ");
		char ch = scanner.next().charAt(0);
				
		switch (ch) {
		
		case 'c':
			System.out.println("Dogru Cevap");
			break;
		case 'a':
			System.out.println("Yanlis Cevap");
			break;
		case 'b':
			System.out.println("Yanlis Cevap");
			break;
		case 'd':
			System.out.println("Yanlis Cevap");
			break;
		default:
			System.out.println("Gecersiz cevap sikki");
		
		}
		
		scanner.close();
		
		

	}

}
