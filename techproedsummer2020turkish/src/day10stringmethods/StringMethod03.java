package day10stringmethods;

public class StringMethod03 {

	public static void main(String[] args) {
		//charAt() methodu: belli indexteki charachteri return eder
		
		String str1 = "cimbombom";
		// str1 in 4. indexindeki charakteri bulan kodu yaziniz
				
		System.out.println(str1.charAt(4)); //cikti: o  indexi 4 olan karakter o harfidir
		
		System.out.println(str1.charAt(0)); //cikti: c
		
		//System.out.println(str1.charAt(10)); // hata verir cünkü 10. index yok
		
		//DIKKAT: olmayan indexi ararsak hata aliriz
		//		  olmayan karakteri ararsak -1 aliriz
		
		
		//length() methodu Stringin icinde kac karakter oldugunu verir
		
		System.out.println(str1.length()); //cikti: 9 
		
		
		
		

	}

}
