package javaofficehours02;

import java.util.Scanner;

public class Day2Moduls {

	public static void main(String[] args) {
		// Kullanicidan 5 basamakli pozitif tamsayi alalim ve herbir rakamai
		//tek tek yazdiralim
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bes basamakli bir sayi giriniz: ");
		int num = scanner.nextInt();
		
	
			
		int onbinler=num/10000;
		int binler=(num/1000)%10;
		int yüzler=(num/100)%10;
		int onlar=((num%1000)%100)/10;
		int birler=(num%10);
		
			System.out.println(onbinler);
			System.out.println(binler);
			System.out.println(yüzler);
			System.out.println(onlar);
			System.out.println(birler);
		
		
		
		
		
		
	}

}
