package day11stringmethods;

public class StringMethods04 {

	public static void main(String[] args) {
		// valueOf() rakamlarla olusturulan Stringleri sayiya dönüstürür böylece rakamlarla
		// olusturulan Stringler ile matematiksel islemler yapabilmemizi saglar
		
		/*DIKKAT: valueOf() metodu hem String hem de Integer wrapperlarinin icinde vardir. 
		 * Stringi Integer'a Integer'i Stringe cevirmeye yarar */
		
		String paraErkek = "1900";
		String paraKadin = "2000";
		
		//Bu ailenin toplam gelirini bulunuz.
		
		//Bu ailenin toplam gelirini bulunuz
		
		System.out.println(paraErkek+paraKadin);//19002000
		System.out.println(Integer.valueOf(paraErkek)+1);//1901
		
		int maasErkek = 1900;
		int maasKadin = 2000;
		
		System.out.println(String.valueOf(maasErkek)+String.valueOf(maasKadin));
		//cikti: 19002000
		

	}

}
