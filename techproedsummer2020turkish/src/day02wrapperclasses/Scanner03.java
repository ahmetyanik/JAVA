package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
	
		// kullanicidan alinan bir sayinin k�p�n� hesaplayan program yaziniz
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen bir kenar giriniz: ");
		int kenar = scanner.nextInt();	
		
		
		System.out.println("K�b�n hacmi: "+(kenar*kenar*kenar));
		

	}

}
