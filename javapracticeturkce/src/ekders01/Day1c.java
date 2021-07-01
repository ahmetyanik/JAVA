package ekders01;

import java.util.Scanner;

public class Day1c {

	public static void main(String[] args) {
		// Kullanicidan 5 basamakli bir tamsayi aliniz ve 
		// bu sayinin bastan iki ve sondan iki rakamlarin
		//basamak degeri ile toplama sonucunu yazdiralim
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bes basamakli bir sayi giriniz:");
		int num = scanner.nextInt();
		
		int toplam =0;
		
		int ilk = num/1000;
		System.out.println(ilk);
		
		int son = num%100;
		System.out.println(son);
		
		System.out.println(ilk+son);
		

	}

}
