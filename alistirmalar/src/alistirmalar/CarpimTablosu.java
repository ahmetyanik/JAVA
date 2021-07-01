package alistirmalar;

public class CarpimTablosu {

	public static void main(String[] args) {
//		1’den 10’a kadar sayılar için bir çarpım tablosu hazırlamak istiyoruz. 
//		Bunun için iç içe 2 döngü yeterlidir ve her iki 
//		döngünün de parametresi 1’den 10’a kadar değişecektir.
		
		for(int i= 1; i<11; i++) {
			
			for(int j = 1; j<11; j++) {
				
				for(int k = 1; k<11; k++) {
					
					System.out.println(i+"x"+j+"x"+k+"="+(i*j*k));
				}
				
				
			}
			
		}
		
		
		
		
		

	}

}
