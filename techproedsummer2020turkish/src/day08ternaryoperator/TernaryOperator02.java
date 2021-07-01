package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		
		// Kullanicidan iki sayi alin
		// Bu sayilar birbirine esit ise toplamlarini ekrana yazdirin
		// Bu sayilar birbirinden farkli ise carpimlarini ekrana yazdirin
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci sayi: ");
		int num1 = scanner.nextInt();
		System.out.print("Ikinci sayi: ");
		int num2 = scanner.nextInt();
		
		int sonuc = num1==num2 ? num1+num2 : num1*num2;
		
		System.out.println("Sonuc: "+sonuc);
		
		scanner.close();

	}

	
}
