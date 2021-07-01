package denemeler;

import java.util.Scanner;

public class Birdenbinetoplam {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		float toplam=0;
		int i;
		
		for(i=1;i<1001;i++) {
			
			toplam+=i;			
			
		}
		
		System.out.println("Sayilarin Toplami: "+toplam);
		System.out.println("Sayilarin Ortalamasi: "+toplam/i);
		
		
		
		
		
		
		

	}

}
