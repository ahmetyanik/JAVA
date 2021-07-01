// metod overloading
public class Ders917 {
	
	public static void toplama(int a, int b, int c) {
		System.out.println("Toplamlari: "+ (a+b+c));
	 
	}
		
	
	public static void toplama(int a, int b) {   // buradaki mantik ayni adli metodun iki veya daha fazla sonuc 
		System.out.println("Toplamlari: "+ (a+b));  //verecek sekilde düzenlenebilmesidir. 
	
	
	}
	public static void main(String[] args) {
		
		toplama(3,4,5);
		toplama(10,20);
	    toplama(1,2,3);
	
	
	}}

