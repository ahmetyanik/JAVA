package denemeler;

import java.util.Scanner;

public class Faktöriyel {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayi giriniz: ");
		
		int carpim=1;
		int sayi = scanner.nextInt();
		
		for(int i=1;i<=sayi;i++) {
			
			carpim *=i;		
			
			
		}
		
		System.out.println(sayi+"'nin faktöriyeli: "+carpim);
		
		
		
		
		
		

	}

}
