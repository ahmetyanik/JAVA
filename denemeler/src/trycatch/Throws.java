package trycatch;

import java.io.IOException;
import java.util.Scanner;

public class Throws {
	
	
	public static void yasKontrol(int yas) throws IOException {
		
		if (yas<18) {
			
			throw new IOException();
			
			
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
			
		}catch(IOException e){
			
			System.out.println("18 yasindan kücükler mekana giremez!");
			
		}
		
		try {
			yasKontrol(yas);
		} catch (IOException e) {
			System.out.println("IOexception olustu...");
		}
		

	}

}
