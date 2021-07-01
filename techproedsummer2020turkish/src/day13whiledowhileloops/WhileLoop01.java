package day13whiledowhileloops;

public class WhileLoop01 {
	
	// while loop kullanarak ilk 5 sayma sayisinin toplamini ekrana 
	// yazdiran programi yaziniz

	public static void main(String[] args) {
		
		int toplam = 0;
		int sayi =1;
		
		while(sayi<6) {
			
			toplam+=sayi;
			
			sayi++;
			
		}System.out.println(toplam);
		
		
		
		

	}

}
