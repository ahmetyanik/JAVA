package day06ifstatetement;

public class IfStatement03 {

	public static void main(String[] args) {
		
		//Bir char variable olusturun bir deger atayin
		//eger atanan deger haftanin günlerinden ilk harfiyse o günleri yazdirin
		
		
		char harf='P';
		
		if(harf=='P') {
			System.out.println("Pazartesi,Persembe,Pazar");
			
		}
		if(harf=='S') {
			System.out.println("Sali");
			
		}
		if(harf=='C') {
			System.out.println("Carsamba,Cuma,Cumartesi");
			
		}
		if(harf!='P' && harf!='C' && harf!='S') {
			System.out.println("Böyle bir gün yok.");
		}

	}

}
