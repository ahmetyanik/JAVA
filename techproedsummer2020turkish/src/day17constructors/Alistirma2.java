package day17constructors;

public class Alistirma2 {
	
	int num1 = 2;
	static int num2 = 4;
	
	
	public static void carpma() {
	
		Alistirma2 obj1 = new Alistirma2();
		System.out.println(obj1.num1*num2);
		
		Alistirma obj3 = new Alistirma(4);
		System.out.println(obj3.num2);
		
		System.out.println(Alistirma.num1);
		
		Alistirma.toplama();
		
		
		
	}
	
	

}
