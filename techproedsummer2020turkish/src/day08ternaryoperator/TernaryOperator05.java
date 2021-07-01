package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		
		//Kullanicidan bir chrachter girmesini isteyiniz
		//Charachter harf ise kücük harf olup olmadigini kontrol ediniz
		//Kücük harf ise ekrana "Kücük harf" yazdirin
		//Büyük harf ise ekrana "Büyük Harf" yazdirin
		//Harf degilse "Harf Degil" yazdirin
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir karakter giriniz: ");
		char harf = scanner.next().charAt(0);
		
		String result = ((harf<=122 && harf>=97) || (harf>=65 && harf<=90)) ? 
				((harf<=122 && harf>=97) ? "Kücük Harf" : "Büyük Harf") : "Harf Degil";
		System.out.println(result);
		
		scanner.close();
	}

}
