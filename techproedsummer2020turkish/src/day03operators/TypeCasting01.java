package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by = 101;	// kücük data tipini büyük data tipine cevirmek icin extra bir kod yazmaya gerek yok java
		int sayi = by;		// bunu otomatik olarak yapar: auto widening
		
		
		System.out.println(sayi);
		
		// büyük data tiplerini kücük data tiplerine cevirmek: Explicit Narrowing Casting 
		
		int sayi2 = 45;
		byte by2 = (byte) sayi2;  // integer olan sayi2'yi byte data tipine cevirdik
		
		System.out.println("sayi2: "+sayi2);
		
		
		double sayi3 = 23.5;
		int by3 = (int)sayi3;
		
		System.out.println(by3);
		
		
		float sayi4 = -23.9f;
		short by4 = (short)sayi4;
		
		System.out.println(by4);
		
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		
		double sonuc1 = sayi5/sayi6;
		
		System.out.println(sonuc1);
		
		int sonuc2 = (int)(sayi5/sayi6);
		System.out.println(sonuc2);
		

		int sayi7 = 5;
		int sayi8 = 3;
		
		int sonuc3 = sayi7/sayi8;
		System.out.println(sonuc3);
		
		
		int sayi9 = 255;
		byte by5 = (byte) sayi9;
		System.out.println(by5);
		
	}

}
