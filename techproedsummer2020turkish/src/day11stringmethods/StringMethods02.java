package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {

		// substring() methodu bir Stringin belli bir bölümünü kesip almak icin kullanilir
		
		String str1 = "Java calisana kolaydir"; //21 indexli bir string
		
		// substring() 1. Versiyon
		
		System.out.println(str1.substring(5)); //cikti: calisana kolaydir (5. indexten itibaren kesmeye baslar)
		System.out.println(str1.substring(8)); // cikti: isana kolaydir (index 8 dahildir (inclusive))
		System.out.println(str1.substring(22));//ekranda hicbir sey göremeyiz cikti vermez hata da vermez
//		System.out.println(str1.substring(23));//hata verir index 23 yok ama ben olmayan bir yerden kesmek isti
											   //yorum bu bir hatali istektir java Exception verir beni uyarir
		
		System.out.println(str1.substring(0));//cikti: Java calisana kolaydir
		
		// substring() 2. Versiyon
		
		System.out.println(str1.substring(5,13));//cikti olarak "calisana" almak istedim ilk index dahil 
												 //ikinci index dahil degildir
		
		System.out.println(str1.substring(6,12));//cikti: alisan
		System.out.println(str1.substring(6,6));//cikti: cikti da vermedi hata da vermedi		
		System.out.println(str1.substring(7,6));//cikti: hata verir cünkü her zaman ilk index ikinciden kücük veya
												//ikinciye esit olmalidir
		
		
	}

}
