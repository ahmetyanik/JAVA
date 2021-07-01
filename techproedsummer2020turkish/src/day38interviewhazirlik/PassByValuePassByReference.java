package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		
		/*
		 Bir methoda variable yollandiginda Java o variable'in kopyasini olusturur ve methoda kopyayi
		 yollar. Bu nedenle variable'in orijinal degeri method calistiktan sonra da ayni kalir. Buna Java'da
		 Pass by Value denir.
		 
		 Bunun degeri degistiren versiyonuna ise Pass by Reference denir. Java bunu kullanmaz.
		 */

		int x = 12;
		
		System.out.println(increment(x));
		
		System.out.println(x);
		
	}
	
	public static int increment(int a) {		
		
		a= a+1;
		return a;		
		
	}

}
