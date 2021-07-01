package Day02;

import java.util.Random;

public class Alistirma01 {

	
	
	public static void main(String[] args) {
		//0 ile 1000 arasında random bir sayı oluşturarak bu sayının rakamları toplamını veren java algoritma kodunu yazınız ?	
		//random sayi= 185  toplamları = 14
		
		
		
		Random r = new Random();
		
		int a = r.nextInt(1000);
		
		int yüzler = a/100;	
		int birler = a%10;		
		int onlarKalan = (a%100);
		int onlar = onlarKalan/10;
		
		System.out.println("Rastgele Sayi: "+a);
		System.out.println("Toplamlari: "+(birler+onlar+yüzler));
		

	}

}
