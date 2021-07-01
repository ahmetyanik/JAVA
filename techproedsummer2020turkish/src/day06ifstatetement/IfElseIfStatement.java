package day06ifstatetement;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {
		
		//Kullanicidan yasini alin
		//Yas 13 den az ise ekrana "Calisamaz" yazdirin
		//Yas 13 den 65 e kadar ise ekrana "Calisabilir" yazdirin
		//Yas 65 den büyük ise ekrana "Emekli" yazdirin
		//Negatif sayi girerse yas negatif olamaz desin
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen yasinizi giriniz: ");
		int yas = scanner.nextInt();
		
		if(yas<0) {
			System.out.println("Yas sifirdan kücük olamaz!");
		}
		else if(yas<13) {
			
			System.out.println("Calisamaz");
		}else if(yas<=65){
			System.out.println("Calisabilir");
			
		}else {
			
			System.out.println("Emekli");
		}
		
		
		
		
		

	}

}
