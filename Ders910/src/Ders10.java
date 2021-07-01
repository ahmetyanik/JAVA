import java.util.Scanner;

public class Ders10 {
	
	public static void main (String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayiyi Giriniz:");
		
		int sayi =scan.nextInt();
		
		int faktoriyel =1;
		
		while (sayi >=1) {
			
			faktoriyel = faktoriyel*sayi;
		
			sayi --;
		}
		System.out.println("Faktoriyel:"+faktoriyel);

	}}
