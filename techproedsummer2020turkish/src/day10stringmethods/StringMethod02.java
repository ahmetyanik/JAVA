package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		// lastIndexOf() methodu aradiginiz character Stringin icindeki son görünumun indexini return eder
		
		//lastIndexOf() methodu 1. versiyonu
		String str1 = "Sivrihisar";
		System.out.println(str1.lastIndexOf('i'));//cikti: 6  i'nin son göründügü yerin indexini verdi
		
		System.out.println(str1.lastIndexOf('r')); //cikti: 9
		
		//lastIndexOf() methodu 2. versiyonu
		System.out.println(str1.lastIndexOf('i', 7)); //cikti:6 DIKKAT: ilk 7 indexin icinde i harfinin son
													 // indexini return eder
		
		
		System.out.println(str1.lastIndexOf('i', 5)); //cikti:4
		
		//lastIndexOf() methodu 3. versiyonu
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("ri")); //cikti:9   stringin icindeki ri'nin son görünümünü bulup
													// son ri'deki r harfinin indexini return eder
		
	}

}
