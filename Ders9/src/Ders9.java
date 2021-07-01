import java.util.Scanner;

// switch case ve ATM ÖRNEGI


public class Ders9 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//int sayi = scan.nextInt();
		
		/* if (sayi == 1) {
			System.out.println("Bir");
			
			
		}
		
		else if (sayi == 2) {
			System.out.println("Iki");
			
			
			
		}
		
		else if (sayi == 3) {
			System.out.println("Uc");
			
			
			
		}
		else if (sayi == 4) {
			
			System.out.println("Dört");
			
			
		}
		else {
			System.out.println("Gecersiz Sayi"); */
		
			
		/*("Bunu simdi de switch case ile yapalim");
			
			
		switch(sayi) {
		
			case 1:
				System.out.println("Bir");
				break;
			case 2:
				System.out.println("Iki");
				break;
				
			case 3:
				System.out.println("Uc");
				break;
				
			case 4:
				System.out.println("Dört");
				break;
				
			default:
				System.out.println("Gecersiz Sayi...");
				break;
		}*/
				
		System.out.println("Simdi de bir ATM Örnegi yapalim...");			

		int sayi = scan.nextInt();
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
			
			
			
			
			
			
	
