package javapracticeday7;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Adiniz ve Soyadinizi Giriniz: ");
		String adSoyad = scanner.nextLine().toLowerCase();
		
		String arr[] = adSoyad.split(" ");
		
		String yeni="";
		
		for(int i=0; i<arr.length;i++) {
			
			yeni += arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1)+" ";		
			
		}
		
		System.out.println(yeni.trim());
		
	}

}
