import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi: ");
		int sayi = scanner.nextInt();
		int faktöriyel = 1;
		int i;
		
		for(i=1 ; i<=sayi; i++) {
			
			faktöriyel *= i;
	

		}
		System.out.println(faktöriyel);
	}
	

}
