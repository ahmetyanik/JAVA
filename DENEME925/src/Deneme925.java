
public class Deneme925 {
	
	public static int toplama (int a, int b, int c) {
		return (a + b + c);
		
	}
	
	public static int ikiylecarp(int a) {
		return 2*a;
		
	}
	
	public static int ikiyletopla(int b) {
		return 2+b;
	}	
	
	public static int dörtilecarp(int c) {
		return 4*c;
	}
	
	
	public static void main(String[] args) {
		
	
		System.out.println("Cikti degeri: "+toplama(1,2,3));		
		
		System.out.println(2 * toplama(2,3,4));
		
		System.out.println(dörtilecarp(ikiyletopla(ikiylecarp(8))));
		
		
		
	}

	
}
