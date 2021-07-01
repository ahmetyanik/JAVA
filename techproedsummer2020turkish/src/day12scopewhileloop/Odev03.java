package day12scopewhileloop;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
//		Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden 
//		veya sonrasından başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları 
//		while loop kullanarak ekrana yazdırınız.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a start value: ");
		int start = scanner.nextInt();
		
		System.out.print("Please enter a finish value: ");
		int finish = scanner.nextInt();
		
		int num = start;
		
		while (num<finish) {
			
			if(num%2==0) {
				System.out.print(num+" ");
				
			}num++;
			
		}
scanner.close();
	}

}
