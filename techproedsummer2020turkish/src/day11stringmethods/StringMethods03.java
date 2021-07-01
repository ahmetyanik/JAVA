package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
	
		//concat() method concatenation yapmanin yani iki Stringi birlestirmenin diger yöntemidir
		
		String str1 = "Ali";
		String str2 = "Veli";
		
		System.out.println(str1 + str2 ); //AliVeli
		System.out.println(str1.concat(str2));//AliVeli
		System.out.println(str1.concat(str2).concat(str1));//AliVeliAli  istedigimiz kadar pespese kullanabiliriz
		System.out.println(str1.concat("==>").concat(str2)); //Ali==>Veli
		
		//replace() methodu: bir characterin yerine baska karakter yazmaya yarar
		//örnek ata ==>ana  t'yi kaldir yerine n koy
		
		//replace() 1.VERSIYON
		String str3 = "ata";
		System.out.println(str3.replace("t","n"));//ana
		System.out.println(str3.replace("a","o"));//oto
		System.out.println(str3.replace("x","y"));//olmayan karakter secip degistir diyoruz
												  //cikti: hata vermez degismez de
		
		System.out.println(str3.replace("","y"));// cikti:yaytyay
		System.out.println(str3.replace("","/"));// cikti:/a/t/a/
		System.out.println(str3.replace("t",""));//cikti:aa  bu yöntem bir karakterin Stringten silinmesi icin
												 //kullanilir
		System.out.println(str3.replace("at", "Mustaf")); //cikti: Mustafa
		System.out.println(str3.replace("at", "y")); //cikti:ya
		
		
		//replaceFirst()     ===>  replace() 2. VERSIYON
		//degistirmek istedigimiz karakterin sadece ilk görünümünü degistirir
		
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k","K"));//cikti: Karakartal
		System.out.println(str4.replaceFirst("a","e"));//cikti: kerakartal        ilk a'yi degistirdi
		System.out.println(str4.replaceFirst("ka","A"));//cikti: Arakartal
		System.out.println(str4.replaceFirst("kar",""));//cikti: akartal
		System.out.println(str4.replaceFirst("kara","A"));//cikti: Akartal
		System.out.println(str4.replaceFirst("karakartal", "cimbombom"));//cikti: cimbombom
		
		//Soru:
		String text ="Ali okula gitti. Ali otobüse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
		
		System.out.println(text.replace("Ali","Veli"));
		//cikti:   Veli okula gitti. Veli otobüse bindi. Veli eve geldi. Veli yemek yedi. Veli uyudu.
		
		//replaceAll() ve replace() methodlari tamamiyla ayni seyi yapar.	
		
	}

}
