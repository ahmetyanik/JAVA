
public class Arraydekilerinortalamasi {

	
	public static void arrayi_bastir(int[]array) {
		
	
		
		for (int i =0 ; i<array.length;i++) {
				
		System.out.println("Element"+(i+1)+":"+array[i]);
		
		
		
		
	
	
		}}
	
	public static double ortalama(int[] array) {
	
		int toplam = 0;
		
		for (int i=0; i<6 ;i++) {			
			toplam +=array[i];	
			
	
		
	}
		return ((double)toplam/array.length);
	
		
	}
	
	public static void main (String[]args) { 
	
	int[] a = {20,30,55,75,38,43};
	
	System.out.println("Ortalama: "+ortalama(a));
	
	
		arrayi_bastir(a);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
