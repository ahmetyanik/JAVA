package day08ternaryoperator;

import java.util.Scanner;

public class Tekrar01 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi aliniz
		//Sayi pozitif veya 0 ise ekrana "Pozitif veya 0" yaziniz
		//Sayi negatif ise ekrana "Negatif" yaziniz
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int num = scanner.nextInt();
		
		String result = num>=0 ?  "Pozitif veya sifir" : "Negatif";
		String result2 = num>5 ?  "Besten büyüktür"   : "Besten kücüktür";
		
		System.out.println(result);
		System.out.println(result2);
		
		
		

	}

}
