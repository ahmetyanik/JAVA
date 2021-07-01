package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		
		//startsWith() methodu: bu method bir Stringin istenen harfle baslayip baslamadigini
		//kontrol eder. istenen harfle basliyorsa true baslamiyorsa false return eder.
		
		
		String str1 = "Ali Can";
		
		//startWith() 1. versiyon
		
		System.out.println(str1.startsWith("A")); // cikti: true
		System.out.println(str1.startsWith("B")); // cikti: false
		System.out.println(str1.startsWith("a")); // cikti: false
		System.out.println(str1.startsWith("Ali")); // cikti: true
		
		//startWith() 2. versiyon
		
		System.out.println(str1.startsWith("a",3)); //cikti: false cünkü 3. index "a" ile baslamiyor
		System.out.println(str1.startsWith("a",5)); //cikti: true cünkü 5. index "a" ile basliyor
		
		System.out.println(str1.startsWith("Can",4)); //true
		
		
		//endsWith() methodu: bir Strinigin istenen harfle bitip bitmedigini kontrol eder
		//istenen harfle bitiyorsa true bitmiyorsa false return eder
		
		
		String str2 = "Ayse Canan";
		
		System.out.println(str2.endsWith("n")); //cikti: true
		System.out.println(str2.endsWith("Canan")); //cikti: true
		
		System.out.println(str2.endsWith("CANAN")); //cikti: false
		
		String str3 = "Ali ";
		System.out.println(str3.endsWith(" ")); // cikti: true
		System.out.println(str3.endsWith("")); //cikti: true
	}

}
