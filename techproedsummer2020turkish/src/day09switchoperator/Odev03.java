package day09switchoperator;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
//		Kullanıcıdan bir tamsayı alın eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı” yazdırın.
//		99 ise ekrana “İki basamaklı en büyük sayı” yazdırın. 999 ise ekrana “Üç basamaklı en büyük sayı” yazdırın.
//		Bu sayıların dışındaki sayılar için “Yorum yok” yazdırın
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir tam sayi giriniz: ");
		int num = scanner.nextInt();
		
		switch (num) {
			
		case 9 :
			System.out.println("Bir basamakli en büyük sayi");
			break;
			
		case 99:
			System.out.println("Iki basamakli en büyük sayi");
			break;
		
		case 999:
			System.out.println("Üc basamakli en büyük sayi");
			break;
			
		default:
			System.out.println("Yorum yok!");
		
			
			
		}
		
		scanner.close();
		

	}

}
