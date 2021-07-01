package day12scopewhileloop;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {

//		Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden 
//		başlayıp bitiş değerinde  biten tüm tamsayıların çarpımını ekrana yazdırın.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int first = scanner.nextInt();
		
		System.out.print("Please enter your second number: ");
		int finish = scanner.nextInt();
		
		int num = first;
		int product = 1;
		
		while(num<=finish) {
			
			product*=num;
			num++;
			
		}System.out.println("Total product that your interval: "+product);

		
		scanner.close();
	}

}
