import java.util.Scanner;

/* while döngüleri ve döngü mantigi
 * döngü baslatma
 * 
 * while(kosul) {
 * 		islem1
 * 		islem2
 * 		islem3
 * 
 * artirma,azaltma
 * 
 * }
 * 
 */
public class Ders9 {
	
public static void main (String[] args) {
	
	int i = 0;
	
	while(i<10) {
		
		System.out.println("Java");
		
		i +=2;		
			
	}
	
	System.out.println("Döngü Bitti...Simdi de Faktöriyel Bulalim");
	
	
	
	}
	
		Scanner scan = new Scanner(System.in);
	
	int bakiye = 1000;
	int islem;				
			
	System.out.println("1: Bakiye Görüntüle");
	System.out.println("2: Para Yatirma");
	System.out.println("3: Para Cekme");
	System.out.println("4: Sistemden Cikis");
	

	
	islem = scan.nextInt();
	
	switch(islem) {
		case 1:
			System.out.println("Bakiyeniz:"+bakiye+"tl'dir");
			break;
		case 2:
			System.out.println("Ne kadar yatiracaksiniz?");
			int miktar = scan.nextInt();
			
			bakiye +=miktar;
			
			System.out.println("Bakiyeniz:"+bakiye+"tl'dir.");
			break;				
		case 3:
			System.out.println("Ne kadar cekeceksiniz?");
			miktar = scan.nextInt();
			bakiye -= miktar;
			break;
		case 4:
			System.out.println("Sistemden cikiliyor...");
			break;
			
		default:
			System.out.println("Gecersiz Islem...");
			
			
			
	
	
	}
			
			
	}
	
	}
		
		

