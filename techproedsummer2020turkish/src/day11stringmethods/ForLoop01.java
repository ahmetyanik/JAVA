package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		
		// 4,3,2 yi ekrana yazdiran bir for loop olusturunuz
		
		for(int i = 4; i>1; i--) {
			
			System.out.println(i);
		}
		//3,4,5,6,7 sayilarini ekrana yazdiran for loop olusturunuz
		for(int i=3;i<8;i++) {
			
			System.out.println(i);
		}
		//ilk 100 sayma sayisini ekrana yanyana yazdiran ve aralarina bosluk koyan programi
		//for loop kullanarak yaziniz
		
		for(int i=1;i<101;i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		//
		
		for(int i=2; i<101;i+=2) {
			
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i=1;i<101;i+=2) {
			System.out.print(i+" ");
		}		
	}
}
