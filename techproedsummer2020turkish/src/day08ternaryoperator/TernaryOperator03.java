package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {

		//Kullanicidan iki sayi aliniz
		//Kücük sayiyi ekrana yazdiriniz
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci Sayi: ");
		double num1 = scanner.nextDouble();
		System.out.print("Ikinci Sayi: ");
		double num2 = scanner.nextDouble();
		
		double sonuc = num1>num2 ? num2 : num1;
		
		System.out.println("Sonuc: "+sonuc);
		
		scanner.close();
		
		
		
	}

}
