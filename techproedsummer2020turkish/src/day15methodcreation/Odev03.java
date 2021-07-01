package day15methodcreation;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {

//		Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının 
//		rakamları toplamını ekrana  yazdıran bir program yazın	

		
		rakamlariTopla();
		
	}	
		public static void rakamlariTopla() {
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Bir Sayi Giriniz: ");
			int num = scanner.nextInt(); 
			int i = num;
			int toplam = 0;
			
			
			if(num>0) {
				
				while(i>0) {
					
					toplam+=num%10;
					num = num/10;
					i--;
					
				}System.out.println(toplam);
				
				
			}else {
				
				while(i<0) {
					
					toplam+=num%10;
					num = num/10;
					i++;
					
				}System.out.println(toplam);			
				
			}

			scanner.close();			
		}
	
}
	
	


