package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		//ilk 5 sayma sayisinin carpiminin sonucunu ekrana yazdirin
		
		int sayi =1;
		int carpim = 1;
		
		while(sayi<6) {
			
			carpim *=sayi;
			sayi++;
			
		}System.out.println(carpim);
		
		

	}

}
