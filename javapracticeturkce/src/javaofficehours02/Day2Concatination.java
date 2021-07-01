package javaofficehours02;

import java.util.Scanner;

public class Day2Concatination {

	public static void main(String[] args) {
		// Kullanicidan 3 tane pozitif tamsayi alalim. Bu sayilarla ücgen olup olamayacagini kontrol edelim
		//Ücgen ise esit kenar mi diye kontrol edelim
		
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Birinci: ");
		int a = scanner.nextInt();
		System.out.print("Ikinci: ");
		int b = scanner.nextInt();
		System.out.print("Ücüncü: ");
		int c = scanner.nextInt();
		
		
		if((a+b>c && c>a-b) && (a+c>b && b>a-c) && (b+c>a && a>b-c)) {
			
			System.out.println("Ücgendir");
			
			if(a==b && b==c) {
				
				System.out.println("Eskenar");
			}
			
			
		}else {
			System.out.println("Ücgen degildir");
		}
		

	}

}
