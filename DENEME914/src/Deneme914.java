import java.util.Scanner;

public class Deneme914 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		
		int i = 1;
		int faktöriyel = 1;
		
		while(i<=sayi) {
			
			faktöriyel *=i;
			i++;			
		}
	System.out.println("Faktöriyel: "+faktöriyel);	
	
	}		
		
	}
			

