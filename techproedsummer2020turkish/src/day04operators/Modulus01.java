package day04operators;

import java.util.Scanner;

public class Modulus01 {

	public static void main(String[] args) {
		
		//12835 sayisinin 23 bölümünden kalan	
		
		System.out.println(12835%23);
		
		
		//kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaziniz
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("4 basamakli bir tamsayi giriniz: ");
		int s = scanner.nextInt();
		int birler = s%10;
		int binler = s/1000;
		
		System.out.println("1. ve 4. rakamlarin toplami: "+ (birler + binler));		
		
	}

}
