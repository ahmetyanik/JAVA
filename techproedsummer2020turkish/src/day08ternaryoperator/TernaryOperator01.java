package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi aliniz
		//Sayi pozitif veya 0 ise ekrana "Pozitif veya 0" yaziniz
		//Sayi negatif ise ekrana "Negatif" yaziniz
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		double sayi = scanner.nextDouble();
		
		//				condition   soru isareti     dogruysa ne                  iki nokta         yanlissa ne olacak     semi colon
		String sonuc = sayi>=0       ?               "Pozitif veya sifir"             :              "Negatif"               ;
		String sonuc2= sayi>5        ?               "Besten büyüktür"                :              "Besten kücüktür"       ;
		
		
		System.out.println(sonuc);
		System.out.println(sonuc2);
		
		
		

	}

}
