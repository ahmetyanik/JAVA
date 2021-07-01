package day06ifstatetement;

import java.util.Scanner;

public class IfElseIfStatement04 {

	public static void main(String[] args) {
		
		//Kullanicidan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir.
		//Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan bir Jackpot oyunu icin program yaziniz. 
		//000000-000001-000002-...-999999==>1000000 sayi var
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen alti basamakli bir sayi giriniz: ");
		long num = scanner.nextInt();
		
		
		if(num<200000) {
			
			System.out.println("Kazandiniz");
		}else if (num<500000) {
			System.out.println("Amorti");
		}else {
			System.out.println("Kaybettiniz!");
			
		}
		
		
		

	}

}
