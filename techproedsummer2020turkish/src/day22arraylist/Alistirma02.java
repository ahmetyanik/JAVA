package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Alistirma02 {

	public static void main(String[] args) {
		
//		int.dan oluşan bir array alıyoruz, bu arrayın ilk veya son indexinin 
//		büyük olduğuna bakıyoruz. büyük değeri bulup bütün degerleri büyük değer ile değiştiriyoruz
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen elemanlarinizi giriniz: ");
		System.out.print("Eleman girme islemini tamamlamak icin (-1) giriniz: ");
		List<Integer> liste = new ArrayList<>();
		
		int islem = 0;
		
		while(!(islem==-1)){
			
			islem = scanner.nextInt();
			liste.add(islem);
		}
		liste.remove(liste.size()-1);
		Object arr[] = liste.toArray();
		
			
			int x = (int) arr[0];
			int y = (int) arr[arr.length-1];
			
			if(x>y) {
				
				for(int i=0;i<arr.length;i++) {
					
					arr[i] = x;
				}
			}else {
				
				for(int i=0;i<arr.length;i++) {
					
					arr[i] = y;
				
			}			
				
			
		}System.out.println(Arrays.toString(arr));
		

	}

}
