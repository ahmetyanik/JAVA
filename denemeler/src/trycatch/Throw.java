package trycatch;

import java.util.Scanner;

public class Throw {
	
	
	public static void yasKontrol(int yas) {
		
		if (yas<18) {
			
			throw new ArithmeticException();
			
			
		}else {
			
			System.out.println("Mekana Hosgeldiniz!");
		}
		
	}

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen yasinizi giriniz: ");
		int yas = scanner.nextInt();
		
		
		try {
			
			yasKontrol(yas);
			
		}catch(ArithmeticException e){
			
			System.out.println("18 yasindan kücükler mekana giremez!");
			
		}
		
		

	}

}
