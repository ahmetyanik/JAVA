package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
	
		// kullanicidan alinan bir sayinin küpünü hesaplayan program yaziniz
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir kenar giriniz: ");
		int kenar = scanner.nextInt();	
		
		
		System.out.println("Kübün hacmi: "+(kenar*kenar*kenar));
		

	}

}
