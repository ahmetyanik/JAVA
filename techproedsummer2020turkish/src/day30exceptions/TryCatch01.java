package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 2;
		
		// finally{} block exception olsa da olmasa da her zaman calisir	
		// finaly{} block try-catch block'dan sonra kullanilir
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e){
			System.out.println("Sifir ile bölme yapilamaz!");
			
		}finally {
			System.out.println("Isleminiz bitmistir...");
		}
		
//		Interview Sorusu: final, finally, finalize keywordlerinin farki nedir?
		/*
		 * 1) finally{} ==> try-catch blockdan sonra kullanilir. Exception olsa da olmasa da calisir
		 * 
		 * 2)final ==> Variable'larda final kullanilirsa o variable'in degeri degistirilemez. Mesela
		 * pi sayisi böyledir. 
		 * 
		 * Methodlarda final kullanilirsa o methodun body kismini degistiremezseniz. Yani o method overriding
		 * yapilamaz
		 * 
		 * Class'larda kullanilirsa, o class extend edilemez Örnek;
		 * 
		 * public final class Animal{ }  Animal class'i artik child classlara sahip olamaz
		 * 
		 * 
		 * 3)finalize()===>  finalize() methodu, Garbage Collector'in imha edecegi datalari imha edilecek hale getirir
		 *  
		 * 
		 */
		
		
		

	}

}
