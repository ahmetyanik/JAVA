package alistirmalar;

import java.util.Scanner;

public class WhileFaktöriyel {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int sayi = scanner.nextInt();
		
		int i =1;
		int carpim = 1;
		
		while(i<=sayi) {
			
			carpim *=i;
			i++;
		}System.out.println(sayi+"'nin faktöriyeli: "+carpim);
		
		
		

	}

}
