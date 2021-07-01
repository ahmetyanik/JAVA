package ekders01;

public class Day1d {

	public static void main(String[] args) {
		// 1'den 100 'e kadar olan sayilarin 3'e 5'e ve 15'e bölünenleri yazdiriniz
		
		for(int i=0;i<100;i++) {
			
			if(i%3==0) {
				
				System.out.print(i+" ");
				
			}
			
			if(i%5==0) {
				
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			
			if(i%5==0) {
				System.out.print(i+" ");
				
			}
			
			
		}
		
		System.out.println();
		for (int i = 0; i < 100; i++) {
			
			if(i%15==0) {
				
				System.out.print(i+" ");
				
			}
			
		}
		
	}

}
