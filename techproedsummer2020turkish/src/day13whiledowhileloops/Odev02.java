package day13whiledowhileloops;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
//		Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden 
//		başlayıp bitiş değerinde  biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız	
		
		System.out.println("*********while loop*************");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen baslangic degeri giriniz: ");
		int start = scanner.nextInt();
		
		System.out.print("Lütfen bitis degeri giriniz: ");
		int end = scanner.nextInt();
		
		while(start<end) {
			
			if(start%3==0 && start%5==0) {
				
				System.out.print(start+" ");
			}start++;
			
		}
		while(end<start) {
			if(end%3==0 && end%5==0) {
				
				System.out.print(end+" ");
			}end++;
		}
		System.out.println();
		System.out.println("*********for loop*************");
		
		System.out.print("Lütfen baslangic degeri giriniz: ");
		int start1 = scanner.nextInt();
		
		System.out.print("Lütfen bitis degeri giriniz: ");
		int end1 = scanner.nextInt();
		
		for (int i1 = start1; i1<end1; i1++) {
			
			if(i1%3==0 && i1%5==0) {
				
				System.out.print(i1+" ");
				
			}
			
			
		}
		

	}

}
