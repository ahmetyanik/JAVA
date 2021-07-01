package day12scopewhileloop;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
//		Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç 
//		değerinden başlayıp bitiş değerinde  biten tüm tamsayıların toplamını ekrana yazdırın.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a start value: ");
		int start = scanner.nextInt();
		
		System.out.print("Please enter a finish value: ");
		int finish = scanner.nextInt();
		
		int num = start;
		int total = 0;
		
		while(num<=finish) {
			
			total +=num;
			num++;
				
			
		}System.out.println("The total value of the numbers which your interval: "+total);	

		scanner.close();
	}

}
