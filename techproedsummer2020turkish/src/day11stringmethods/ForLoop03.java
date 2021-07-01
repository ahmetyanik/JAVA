package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		
		//ilk 4 sayma sayisinin carpimini veren for loop olusturunuz
		
		int product =1;
		
		for(int i=1;i<5;i++) {
			product*=i;
		}System.out.println("Carpim: "+product);
	
		//ilk 6 cift sayma sayisinin carpimini veren for loop olusturunuz
	
		int product2 =1;
		
		for(int i=2;i<13;i+=2) {
			
			product2 *=i;			
			
		}System.out.println(product2);
	
	
	
	
	}
	
	
	

}
