package day13whiledowhileloops;

public class Odev01 {

	public static void main(String[] args) {
		// 8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız
		
		System.out.println("*********while loop*************");
		int num = 8;
		
		while(num<181) {
			
			if(num %5 ==0) {
				
				System.out.print(num+" ");
				
			}num++;
			
			
		}
		System.out.println();
		System.out.println("*********for loop*************");
		
		for (int i = 8; i<=180; i++) {
			
			if(i%5==0) {
				
				System.out.print(i+" ");
			}
			
		}
		
		
		

	}

}
