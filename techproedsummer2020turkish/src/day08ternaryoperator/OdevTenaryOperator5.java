package day08ternaryoperator;

import java.util.Scanner;

public class OdevTenaryOperator5 {

	public static void main(String[] args) {

		/*Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın. 
		 * 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın. 
		 * Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir tamsayi giriniz: ");
		int num = scanner.nextInt();
		
		
		String result =(num<1000 && num>99) || (num>-1000 && num<-99) ? "3 basamakli" : num%2==0 ? "Üc basamakli olmayan cift sayi": "Üc basamakli olmayan tek sayi";
		
		System.out.println(result);
		
		scanner.close();
		
		
	}

}
