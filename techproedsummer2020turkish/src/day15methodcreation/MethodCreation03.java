package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		
		//Basit hesap makinesi
		//kullanicidan yapacagi islemi islem sembolü ile secmesini saglayalim
		//kullanicidan iki sayi girmesini isteyelim
		//girilen iki sayi ve secilen isleme göre dogru sonucu ekrana yazdiralim
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir islem seciniz: +, -,x, :");
		char islem = scanner.next().charAt(0);
		System.out.println("Islem yapmak icin iki sayi giriniz: ");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		hesapMakinesi(islem,num1,num2);
		

	}

	public static void hesapMakinesi(char islem, double num1, double num2) {
		
		switch(islem) {
		
		case'+':
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
			
		case'-':
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		
		case'x':
			System.out.println(num1+"x"+num2+"="+(num1*num2));
			break;
		
		case':':
			System.out.println(num1+"/"+num2+"="+(num1/num2));
			break;
			
		default:
			System.out.println("Gecerli bir islem giriniz!");
		
		
		}
	}
	
	
	
}
