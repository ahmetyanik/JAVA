package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		// Varargsin yanlis kullanimlari
		
		//Kural 1: Varargs her zaman son parametre olmalidir
		//Cünkü ilk parametre yapilirsa girilen her deger Varargs'in icine düser
		//Bu nedenle asla ikinci parametreye deger veremeyiz
		
		//Kural 2: Parametre olarak 1'den fazla Varargs kullanilamaz
		//Cünkü Varargs en sonda olmalidir. En sonda olmak tek olmayi gerektirir
		
		valueChar("ahmet",'a');
		valueChar("ayse",'a','b');
		
		//product(1,2,2,3,4); //Kural 1 hatasi

	}

	public static void valueChar(String s,char... c) {
		
		for(char w : c) {
			
			System.out.println(s);
			System.out.println(w);
		}
		
	}
	
	/*public static void product(int... x, int y) {
		
		int product = 1;
		for(int w : x) {
			product*=w;
			
		}
		System.out.println(product);*/  //KURAL 1 hatasi
	
	
	
	
	}
	
	
	

