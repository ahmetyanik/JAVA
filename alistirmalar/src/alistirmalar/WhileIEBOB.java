package alistirmalar;

import java.util.Scanner;

public class WhileIEBOB {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci Sayi: ");
		int birinci = scanner.nextInt();
		
		System.out.print("Ikinci Sayi: ");
		int ikinci = scanner.nextInt();
		
		int i = 2;
		int ebob = 1;
		
		while(i<=birinci && i<=ikinci) {
			
			if(birinci%i==0 && ikinci%i==0) {
				
				ebob =i;
				
				
			}i++;
			
			
		}System.out.println(ebob);
		
		

	}

}
