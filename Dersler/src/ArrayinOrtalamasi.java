
public class ArrayinOrtalamasi {
	
	
	public static double ortalamabul(int [] array) {
		
		int toplam = 0;
		
		for (int i = 0; i<array.length; i++) {
			
			toplam += array[i];			
			
		}
		return ((double)toplam/array.length);		
		
	}	

	public static void main(String[] args) {
		
		
		int [] a = {10,20,30,40,50,60};
		
		System.out.println("Ortalama:"+ortalamabul(a));

	}}
