package day12scopewhileloop;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {

//		Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç 
//		değerinden başlayıp bitiş değerinde  biten tüm tamsayıları while loop 
//		kullanarak ekrana yazdırınız.

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen baslangic degeri giriniz: ");
		int start = scanner.nextInt();
		
		System.out.print("Lütfen bitis degeri giriniz: ");
		int end = scanner.nextInt();
		
		int num = start;
		while(num<=end) {
			
			System.out.print(num+" ");
			num++;
		}
		
	scanner.close();	
	}

}
