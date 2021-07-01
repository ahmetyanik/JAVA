package day08ternaryoperator;

import java.util.Scanner;

public class OdevTenaryOperator {

	public static void main(String[] args) {
		
		//Kullanıcıdan iki tamsayı girmesini isteyin, ekrana her zaman büyük olanını yazdırın
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci tamsayi: ");
		int num1 = scanner.nextInt();
		System.out.print("Ikinci tamsayi: ");
		int num2 = scanner.nextInt();
		
		int result = num1>num2 ? num1 : num2;
		
		System.out.println("Büyük tamsayi "+result+"'dir.");
		
		scanner.close();
		
	}

}
