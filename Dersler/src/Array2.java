import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
	
	public static void arraySort(int[]array) {
		
		//Arrays sinifi kullanarak siralama yapacagiz // sort metodu yardimiyla
		
		Arrays.sort(array);
		
		
		
		
	}

	public static int[] arrayi_doldur(int sayi) {
		
		Scanner scanner = new Scanner(System.in);
		int[] cikti = new int[sayi];
		
		for (int i = 0; i<sayi;i++) {
			cikti[i] = scanner.nextInt();		
			
			
		}
		return cikti;
		
	}
	
	public static void arrayi_bastir(int[]array) {
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Element "+(i+1)+": "+array[i]);
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
	
		int[]a = arrayi_doldur(3);		
		
		arrayi_bastir(a);
		
		arraySort(a);

	}

}
