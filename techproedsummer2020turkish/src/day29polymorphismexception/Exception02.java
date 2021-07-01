package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

	//Checked Exceptionlari (Compile Time Exception) handle etmek icin iki yol var;
	//Birincisi: "throws" keywordünü kullanmak. Bunu kullanirsaniz konsolda teknik mesajlar görürsünüz
	//Bu yüzden cok tercih edilmez
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream file = new FileInputStream("C:/ogrenci.txt");		

	}

}
	//Ikincisi: "try-catch block kullanmaktir. Bunu kullanirsaniz konsolda teknik mesajlar yerine
	//kendi yazdiginiz mesajlari görebilirsiniz. Bu yüzden try-catch kullanmak tercih edilir
class ExceptionTryCatch{
	
	public static void main(String[]args) {
		
		try {
			FileInputStream file = new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Dosya'nin pathi yanlis veya dosya silinmis olabilir");
		}
		
		
	}
}







