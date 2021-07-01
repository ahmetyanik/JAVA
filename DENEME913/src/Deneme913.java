import java.util.Scanner;

public class Deneme913 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
						
			
		System.out.print("Lütfen bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		int faktöriyel = 1;
		
		for (int i=1; i<=sayi; i++ ) {
			
			faktöriyel *= i;
				
		}
		
		System.out.println("Faktöriyel: "+ faktöriyel);
		
	}}


