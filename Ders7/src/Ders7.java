import java.util.Scanner;

public class Ders7 {
	
	public static void main(String[] args) {
		/*
		 * Karsilastirma operat�rleri
		 * a == b --> esit mi (esitse True degilse false
		 * a !=b ---> esit degil mi (esit degilse true esitse false)
		 * a > b ---> a b'den b�y�k m� (b�y�kse true degilse false)
		 * a < b ---> a b'den b�y�k m� (k�c�kse true degilse false)
		 * a<=
		 * a>=
		 * 
		 * if (kosul) {
		 * 		if blogu
		 * 		burada kosul saglaninca islemler yapiliyor...
		 * 
		 */
		
	System.out.println("Sonuc: " + (4 == 4));
	System.out.println("Sonuc: " + (4 == 5));
	System.out.println("Sonuc: " + (4 != 5));
	System.out.println("Sonuc: " + (4 != 4));
	System.out.println("Sonuc: " + (4 < 5));
	System.out.println("Sonuc: " + (4 > 5));
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Notunuzu girin:");
	
	int note = scan.nextInt();
	
	if (note>70) {
		
		System.out.println("Dersten gectiniz...");
		
	}
	else {
		
		System.out.println("Dersten Kaldiniz...");

	}
		

		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
