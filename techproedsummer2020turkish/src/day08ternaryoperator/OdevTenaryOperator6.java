package day08ternaryoperator;

import java.util.Scanner;

public class OdevTenaryOperator6 {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl” degilse ekrana “Artık yıl degil” yazdırın.
		// Artik yil 1) Yil 100'e bölünürse 400'e de bölünmeli
		//			 2) Yil 100'e bölünmezse 4'e bölünmeli 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir yil giriniz: ");
		int year = scanner.nextInt();
		
		String result = year % 100 == 0 ? year % 400 ==0 ? "Artik Yil" : "Artik Yil Degil" : year % 4 == 0 ? "Artik Yil" : "Artik Yil Degil";
		System.out.println(result);

		scanner.close();
	}

}
