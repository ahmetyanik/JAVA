import java.util.Scanner;

public class Deneme913 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
						
			
		System.out.print("L�tfen bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		int fakt�riyel = 1;
		
		for (int i=1; i<=sayi; i++ ) {
			
			fakt�riyel *= i;
				
		}
		
		System.out.println("Fakt�riyel: "+ fakt�riyel);
		
	}}


