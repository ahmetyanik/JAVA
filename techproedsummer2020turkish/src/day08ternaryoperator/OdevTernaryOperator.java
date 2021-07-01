package day08ternaryoperator;

import java.util.Scanner;

public class OdevTernaryOperator {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı girmesini isteyin, tamsayı çift ise ekrana “Çift” tek ise ekrana “Tek” yazdırın.

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz: ");
		int num = scanner.nextInt();
		
		
		String result = num%2==0 ? "Cift" : "Tek";
		System.out.println(result);
		scanner.close();
		
	}

}
