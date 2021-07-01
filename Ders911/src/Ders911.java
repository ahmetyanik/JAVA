import java.util.Scanner;

// cok kullanilmayan bir döngü
 // do while döngüsü icindeki degerleri mutlaka en az bir kez kullandirir
public class Ders911 {
	
	public static void main(String[] args) {{
		int n =10;
		
		do {
			
			System.out.println("n ="+ n);
			
			n --;
			
		}
		
		while(n>0);
	}

	Scanner scan = new Scanner(System.in);
	
	int sayi=scan.nextInt();
	int toplam = 0;
	
	do {
		
		toplam += sayi % 10;
		sayi = sayi / 10;
		System.out.println("Toplam="+ toplam + "sayi ="+ sayi);
		
	
	
	
	
	
	}
	while (sayi > 0);
	
	
	
}}
