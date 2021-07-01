package day24varargsaccessmodifiers;

public class Varargs01 {

	public static void main(String[] args) {
		// Varargs :  Variable Arguments
		//Bir method olusturdugumuzda argument olarak istedigimiz
		//kadar argument girebilmemizi saglar
		
		
		sumNums(2,3);
		sumNums(3,4,5,6,7,8,9,9,4,5,6,7,8,9,6);
		
		printName("ahmet","Ali","Ayse","Zeynep");
		System.out.println();
		printName("ahmet","ali");
		
				
	}
	
	public static void sumNums(double... b ) {
		
		double sum =0;
		for(double w : b) {
			
			sum += w;
		}
		System.out.println(sum);
		
	}
	
	public static void printName(String... n) {
		
		for(String w : n) {
			
			System.out.print(w+" ");
		}
		
	}
	

}
