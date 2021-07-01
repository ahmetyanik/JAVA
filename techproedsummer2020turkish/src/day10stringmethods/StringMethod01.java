package day10stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		// indexOf() methodu Stringin icindeki characterin yerini belirlemek icin kullanilir
		
		String str1 = "Javva World";
		
		System.out.println(str1.indexOf('v'));// ekrana 2 yazdirir
		System.out.println(str1.indexOf('W'));// ekrana 6 yazdirir
		System.out.println(str1.indexOf('w'));// java bulamadigi index'in ciktisini -1 verir
		System.out.println(str1.indexOf('a'));// iki tane a var hangisi? java soldan saga calisir 
											  // ilk a'nin indexini verir.  cikti: 1
		
		// indexOf() methodu diger versiyonu
		
		System.out.println(str1.indexOf('a',2)); //Strindeki ikinci 'a' nin indexini bulmak icin
												 //cikti: 4
												 //peki parantezdeki 2 ne anlama geliyor? javaya biz
												//2. index ve sonrasinda ara diyoruz
		
		System.out.println(str1.indexOf('a',4)); // java aramaya 4. indexten basladigi icin cikti:4
		
		System.out.println(str1.indexOf('a',1)); // cikti:1
		
		System.out.println(str1.indexOf('a',5)); // cikti:-1
		
		
		
		//"Alamanya" Stringindeki ikinci 'a' karakterinin indexini bulunuz
		
		String str2 = "Alamanya";
		System.out.println(str2.indexOf('a')); // birinci a'nin indexi cikti:2
		System.out.println(str2.indexOf('a',3)); //ikinci a'nin indexi icin ilk anin indexinden sonrasini arattik
		
		//bunun güzel yolu
		
		int idx = str2.indexOf('a');
		System.out.println(str2.indexOf('a',idx+1)); // cikti:4
		
		//indexOf() methodu 3. versiyonu
		
		String str3 = "Missisippi";
		System.out.println(str3.indexOf("is")); // is in indexini aradik is'in ilk harfi olan i'nin indexini
												// verir cikti:1
		
		
		
		System.out.println(str3.indexOf("si")); //cikti: 3
				
	}

}
