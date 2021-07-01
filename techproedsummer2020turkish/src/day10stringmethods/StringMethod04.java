package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		// contains() methodu bir Stringin icinde bir karakterin olup olmadigini kontrol eder
		// eger o karakter stringin icinde varsa true yoksa false return eder
		
		
		String str1 = "karakartal";
		str1.contains("m"); // tek harf bile olsa string olmali
		System.out.println(str1.contains("m")); //cikti: false

		
		System.out.println(str1.contains("kar")); //cikti: true
		
		
	// trim() methodu bir stringin bas ve sonundaki bosluklari siler fakat ortadaki boslugu silmez
		
		String str2 = "    Ali Can       ";
		System.out.println("trim() kullanmadan önce  : "+str2);
		System.out.println("trim() kullandiktan sonra: "+str2.trim());
		
	//isEmpty() metodu: bir Stringin icinde karakter olup olmadigina bakar karakter yoksa true
	// varsa false cikti verir	
		
		String str3 = "Ali";
		System.out.println(str3.isEmpty()); //cikti: false
		
		String str4 = " ";
		System.out.println(str4.isEmpty()); //cikti: false cünkü bosluk bir karakterdir
		
		String str5 = "";
		System.out.println(str5.isEmpty()); //cikti: true cünkü bostur
		
		//NOTE: isEmpty() true cikarsa length sifir demektir
	

	}

}
