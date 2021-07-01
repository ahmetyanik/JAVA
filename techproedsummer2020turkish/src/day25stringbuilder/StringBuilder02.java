package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		// substring() methodu atama yapmadan String'i degistirmez. Cünkü substring() methodu
		//String class'indan gelir ve bir String return eder. Halbuki str1 String degil
		//StringBuilder'dir. Java data type'leri uyusmadigindan dolayi atamayi kabul etmez.(Sinav/mülakat)

		
		StringBuilder str1 = new StringBuilder("animals");
		
		str1.substring(3);
		
		System.out.println(str1);
		
		//Bu hatadan kurulmak icin iki yol vardir:
		
		//1. Yol: Yeni bir String üretip atama yapilir
		
			String str2 = str1.substring(3);
			System.out.println(str2);
			
		//2. Yol: 
			System.out.println(str1.substring(3));
			
		
		// indexOf() methodu belli bir karakterin indexini return eder
			
			System.out.println(str1.indexOf("m")); //cikti:3
			
			
		//length() methodu String classindan gelir ve Stringin uzunlugunu return eder
			
			System.out.println(str1.length()); //cikti:7
			
		//charAt() methodu belli bir indexteki karakteri return eder
			System.out.println(str1.charAt(5)); //l harfini return etti
			
		//insert() methodu istenen indexe istenen karakteri eklemeye yarar
		//insert() methodu append() gibi StringBuilderi direkt degistirir
			
			str1.insert(0,"x");
			System.out.println(str1);//cikti: xanimals
			
		//delete() methodu istenen index araligindaki karakteri siler
			
			str1.delete(0,1);
			System.out.println(str1); // cikti: animals
			
		
		//deleteCharAt(); istenen indexteki karakteri siler
			
			str1.deleteCharAt(6);
			
			System.out.println(str1); // cikti: animal   "s" silindi
			
		//reverse() methodu Stringi tersten yazdirir (Mülakatta Stringi tersten yapma sorulur)
			str1.reverse();
			System.out.println(str1);//cikti: lamina
			
		//toString() methodu StringBuilder'i String'e cevirmek icin kullanilir
			str1.toString();
			System.out.println(str1);//str1 artik StringBuilder degil String'tir
			
		//StringBuilder Java'nin 5. versiyonunda olusturuldu. StringBuffer'lar StringBuilder'larin
		//eski versiyonudur. StringBuilder'lar daha hizlidir bu nedenle StringBuilder kullanmayi tercih ederim
			
						
	}

}
