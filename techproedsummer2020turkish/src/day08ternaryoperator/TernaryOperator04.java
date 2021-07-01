package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		
		// NESTED TERNARY OPERATOR (IF - ELSE IF)
		
		//Kullanicidan bir sayi aliniz
		//Sayi 0'dan büyük esit ise 10'dan kücük olup olmadigini kontrol ediniz
		//10'dan kücük ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz
		//Sayi 0'dan kücük ise ekrana "Negatif" yazdiriniz
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz: ");
		double num = scanner.nextDouble();
		
		
		
		String result = num >=0 ? (num<10 ? "Rakam" : "Pozitif Sayi") : "Negatif Sayi";
		
		System.out.println(result);
		
		scanner.close();

	}

}
