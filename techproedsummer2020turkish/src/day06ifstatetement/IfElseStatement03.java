package day06ifstatetement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		
		//Kullanicidan tam sayi isteyin o tam sayinin mutlak degerini ekrana yazdirin
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen bir tam sayi giriniz: ");
		int sayi = scanner.nextInt();
		
		if(sayi>=0) {
			
			System.out.println(sayi+"'nin mutlak degeri: "+sayi);
		}else {
			
			System.out.println(sayi+"'nin mutlak degeri: "+(sayi*-1));
		}
		
		
		

	}

}
