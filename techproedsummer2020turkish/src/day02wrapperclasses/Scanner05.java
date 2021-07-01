package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen dairenin yaricapini giriniz: ");
		double yaricap = scanner.nextDouble();
		double cevre = 2*3.14159*yaricap;
		double alan = 3.14159*yaricap*yaricap;
		
		System.out.println("Dairenin cevresi: "+ cevre);
		System.out.println("Dairenin alani: "+ alan);		
		

	}

}
