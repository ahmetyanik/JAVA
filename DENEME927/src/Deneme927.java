import java.util.Scanner;

public class Deneme927 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi = scanner.nextInt();

		int i =2 ;
		
		while (i<sayi) {
			
			if (sayi % i == 0) {
				
				System.out.println(sayi+" bir asal sayi degildir.");
				break;
			}
			
			
			else {
				
				System.out.println(sayi + " bir asal sayidir.");
				break;
					}
					
						
		}}}
					

	


